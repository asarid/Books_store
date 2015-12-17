package model.backend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.*;


/**
 * Created by aviad on 17/11/2015.
 */
public interface IBackend {

    // (1) 'create' functions

    /**
     * add a book entity to the database
     * @param b instance of book class
     * @param idProvider id of the provider that owns this book
     * @param amount number of book copies of certain provider
     * @param price the price of the book per one copy
     * @throws Exception if one of the arguments is not valid
     */
    @AccessControl.AccessPermission (permission = "provider")
    void addBook(Book b, String idProvider, int amount, float price) throws Exception;

    /**
     * add a provider entity to the database
     * @param c instance of provider class
     * @throws Exception if one of the arguments is not valid
     */
    @AccessControl.AccessPermission (permission = "storeOwner")
    void addProvider(Provider c) throws Exception;

    /**
     * add a client entity to the database
     * @param c instance of client class
     * @throws Exception if one of the arguments is not valid
     */
    @AccessControl.AccessPermission (permission = "storeOwner")
    void addClient(Client c) throws Exception;

    /**
     * add an order entity to the database
     * @param o an instance of 'Order'
     * @param subOrders list of subOrders of the Order
     */
    @AccessControl.AccessPermission(permission = "client")
    void addOrder(Order o, ArrayList<SubOrder> subOrders);



    // (2) 'read' functions

    /**
     * returns an instance of book from the database according to its unique number
     * @param systemNumber key of the book
     * @return an instance of 'Book'
     */
    @AccessControl.AccessPermission
    Book getBook(int systemNumber);

    /**
     * returns an instance of 'provider' from the database according to its key
     * @param providerID the id of the provider
     * @return an instance of 'Provider'
     */
    @AccessControl.AccessPermission(permission = "storeOwner")
    Provider getProvider(String providerID);

    /**
     * returns an instance of 'Client' from the database according to its key
     * @param clientID the id of the client
     * @return an instance of 'Client'
     */
    @AccessControl.AccessPermission(permission = "storeOwner")
    Client getClient(String clientID);



    // (3) 'update' functions

    /**
     * update a certain book entity in the database
     * @param b instance of book class
     * @param idProvider id of the provider that owns this book
     * @param amount number of book copies of certain provider
     * @param price the price of the book per one copy
     * @throws Exception if one of the arguments is not valid
     */
    @AccessControl.AccessPermission (permission = "provider")
    void updateBook(Book b, String idProvider, int amount, float price) throws Exception;

    /**
     * upadte a provider entity in the database
     * @param c instance of provider class
     * @throws Exception if one of the arguments is not valid
     */
    @AccessControl.AccessPermission (permission = "storeOwner")
    void updateProvider(Provider c) throws Exception;

    /**
     * updates a client entity in the database
     * @param c instance of client class
     * @throws Exception if one of the arguments is not valid
     */
    @AccessControl.AccessPermission (permission = "storeOwner")
    void updateClient(Client c) throws Exception;



    // (4) 'delete' functions

    /**
     * delete a book from the database
     * @param systemNumber the unique number of the book (its key)
     * @param idProvider the id of the provider
     * @throws Exception if one of the arguments is not valid
     */
    @AccessControl.AccessPermission (permission = "provider")
    void delBook(int systemNumber, String idProvider) throws Exception;

    /**
     * delete a provider from the database
     * @param providerID id of the provider
     */
    @AccessControl.AccessPermission (permission = "storeOwner")
    void delProvider(String providerID);

    /**
     * delete a client from the database
     * @param clientID the id of the client
     */
    @AccessControl.AccessPermission (permission = "storeOwner")
    void delClient(String clientID);



    // lists accessors

    /**
     * returns the list of books from the database
     * @return the list of books from the database
     */
    @AccessControl.AccessPermission
    ArrayList<Book> getBooks();

    /**
     * returns the list of clients from the database
     * @return the list of clients from the database
     */
    @AccessControl.AccessPermission(permission = "storeOwner")
    ArrayList<Client> getClients();

    /**
     * returns the list of providers from the database
     * @return the list of providers from the database
     */
    @AccessControl.AccessPermission (permission = "storeOwner")
    ArrayList<Provider> getProviders();


    //our functions

    /**
     * searches for the books of certain provider according to its ID number
     * @param idProvider the ID of the provider
     * @return a list of books that a certain provider owns
     */
    @AccessControl.AccessPermission(permission = "client")
    ArrayList<Book> getBooksProvider(String idProvider);

    /**
     * update the number of copies of speific book of certain provider in the store
     * @param idBook the unique number of the book
     * @param idProvider the ID of the provider
     * @param amount number of copies of a book that a certain provider owns
     * @throws Exception if one of the arguments is not valid
     */
    @AccessControl.AccessPermission(permission = "provider")
    void updateAmountBook(int idBook, String idProvider, int amount) throws Exception;

    /**
     * searches for the books that belongs to a certain category
     * @param category the name of the category
     * @return list of books that their category is like the argument
     */
    @AccessControl.AccessPermission
    ArrayList<Book> getBooksByCategory(String category);

    /**
     * searches for the books that cost between a given range
     * @param books list of books
     * @param min min cost
     * @param max max cost
     * @return list of books that match the condition
     */
    @AccessControl.AccessPermission
    ArrayList<Book_Provider> getBooksByCost(ArrayList<Book> books, float min, float max);

    @AccessControl.AccessPermission(permission = "none")
    ArrayList<Book_Provider> booksToBook_Providers(ArrayList<Book> books);


}
