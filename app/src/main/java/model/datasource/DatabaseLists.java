package model.datasource;

import entities.*;
import model.backend.IBackend;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aviad on 18/11/2015.
 */
public class DatabaseLists implements IBackend {

    static ArrayList<Book> listOfBooks = new ArrayList<>();
    static ArrayList<Client> listOfClients = new ArrayList<>();
    static ArrayList<Provider> listOfProviders = new ArrayList<>();
    static ArrayList<Order> listOfOrder = new ArrayList<>();
    static ArrayList<SubOrder> listOfSubOrders = new ArrayList<>();
    static ArrayList<Book_Provider> listOfBook_Providers = new ArrayList<>();


    int bookCounter, orderCounter, subOrderCounter = 1;
    long personCounter = 100000001;

    enum typeOfBook {
        HORROR,SCIENCE_FICTION,SATIRE,DRAMA,MYSTERY,ROMANCE,FANTASY,
        SCIENCE,POETRY,HISTORY,COMICS,BIOGRAPHIES
    }

    @Override
    public void addBook(Book b, String idProvider, int amount, float price) throws Exception {
        b.setSystemNumber(bookCounter++);
        listOfBooks.add(b);
        Book_Provider BP = new Book_Provider(Integer.toString(b.getSystemNumber()),idProvider,amount, price);
        listOfBook_Providers.add(BP);

    }

    @Override
    public void addProvider(Provider p) throws Exception {

        if (p == null)
            throw new Exception("provider argument is null.");

        p.setId(Long.toString(personCounter++));
        listOfProviders.add(p);
    }

    @Override
    public void addClient(Client c) throws Exception {
        c.setId(Long.toString(personCounter++));
        listOfClients.add(c);
    }

    @Override
    public Book getBook(int systemNumber) {
        for(int i=0;i<listOfBooks.size();i++)
            if(listOfBooks.get(i).getSystemNumber() == (systemNumber))
                return listOfBooks.get(i);
        return null;
    }

    @Override
    public Provider getProvider(String id) {
        for(int i=0;i<listOfProviders.size();i++)
            if(listOfProviders.get(i).getId().equals(id))
                return listOfProviders.get(i);
        return null;
    }

    @Override
    public Client getClient(String id) {
        for (int i=0;i<listOfClients.size();i++)
            if(listOfClients.get(i).getId().equals(id))
                return listOfClients.get(i);
        return null;
    }

    @Override
    public void updateBook(Book b , String idProvider,int amount, float price) throws Exception {
        delBook(b.getSystemNumber(),idProvider);
        addBook(b,idProvider,amount, price);
    }

    @Override
    public void updateProvider(Provider c) throws Exception {
        delProvider(c.getId());
        addProvider(c);
    }

    @Override
    public void updateClient(Client c) throws Exception {
        delClient(c.getId());
        addClient(c);
    }

    @Override
    public void delBook(int systemNumber,  String idProvider) {
        for(int i=0;i<listOfBooks.size();i++)
            if(listOfBooks.get(i).getSystemNumber() == (systemNumber)) {
                listOfBooks.remove(i);
                break;
            }
        for(int i=0;i<listOfBook_Providers.size();i++)
            if(listOfBook_Providers.get(i).getBookId().equals(systemNumber) && listOfBook_Providers.get(i).getProviderId().equals(idProvider)) {
                listOfBook_Providers.remove(i);
                break;
            }
    }

    @Override
    public void delProvider(String id) {
        for(int i=0;i<listOfProviders.size();i++)
            if(listOfProviders.get(i).getId().equals(id)) {
                listOfProviders.remove(i);
                break;
            }
    }

    @Override
    public void delClient(String id) {
        for (int i=0;i<listOfClients.size();i++)
            if(listOfClients.get(i).getId().equals(id)) {
                listOfClients.remove(i);
                break;
            }
    }
    
    @Override
    public ArrayList<Book> getBooks() {
        return listOfBooks;
    }

    @Override
    public ArrayList<Client> getClients() {
        return listOfClients;
    }

    @Override
    public ArrayList<Provider> getProviders() {
        return listOfProviders;
    }


    @Override
    public ArrayList<Book> getBooksProvider(String idProvider)
    {
        ArrayList<Book> result=new ArrayList<>();
        for (int i=0;i<DatabaseLists.listOfBook_Providers.size();i++)
        {
            if(DatabaseLists.listOfBook_Providers.get(i).getProviderId().equals(idProvider))
                result.add(getBook(Integer.parseInt(DatabaseLists.listOfBook_Providers.get(i).getBookId())));
        }
        return result;
    }

    @Override
    public void updateAmountBook(int idBook, String idProvider, int amount) throws Exception
    {
        float price=0;
        for(Book_Provider b_p : listOfBook_Providers)
            if(b_p.getBookId().equals(idBook) && b_p.getProviderId().equals(idProvider)) {
                price = b_p.getPrice();
                break;
            }
        Book b = getBook(idBook);
        delBook(idBook,idProvider);
        addBook(b,idProvider,amount,price);
    }

    @Override
    public ArrayList<Book> getBooksByCategory(String category)
    {
        ArrayList<Book> filteredBooks = new ArrayList<Book>();
        for (Book b : listOfBooks)
        {
            if (b.getTypeOfBook().equals(category))
                filteredBooks.add(b);
        }
        return (filteredBooks.size() != 0) ? (filteredBooks) : null;
    }

    @Override
    public void addOrder(Order o, ArrayList<SubOrder> subOrders)
    {
        long idOrder = orderCounter++;
        o.setId(idOrder);

        for (SubOrder s_o : subOrders)
        {
            s_o.setIdSubOrder(Integer.toString(subOrderCounter++));
            s_o.setIdOrder(Long.toString(idOrder));
            listOfSubOrders.add(s_o);
        }
        listOfOrder.add(o);
    }


    public ArrayList<Book_Provider> booksToBook_Providers(ArrayList<Book> books)
    {
        ArrayList<Book_Provider> result = new ArrayList<Book_Provider>();
        for(Book_Provider bp : listOfBook_Providers)
        {
            for(Book b : books)
            {
                if(Integer.toString(b.getSystemNumber()).equals((bp.getBookId())))
                    result.add(bp);
            }
        }
        return result;
    }

    @Override
    public ArrayList<Book_Provider> getBooksByCost(ArrayList<Book> books, float min, float max)  {
        ArrayList<Book_Provider> result = new ArrayList<Book_Provider>();
        for (Book_Provider bp: booksToBook_Providers(books))
        {
            if(bp.getPrice()<=max && bp.getPrice()>=min)
                result.add(bp);
        }
        return  result;
    }




}
