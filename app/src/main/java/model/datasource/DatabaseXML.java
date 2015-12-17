package model.datasource;

import entities.*;
import model.backend.IBackend;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.SAXException;


import java.util.List;

/**
 * Created by aviad on 17/11/2015.
 */
public class DatabaseXML implements IBackend
{

    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();

    @Override
    public void addBook(Book b, String idProvider, int amount, float prise) throws Exception {

    }

    @Override
    public void addProvider(Provider c) {

    }

    @Override
    public void addClient(Client c) {

    }

    @Override
    public Book getBook(int systemNumber) {
        return null;
    }

    @Override
    public Provider getProvider(String providerID) {
        return null;
    }

    @Override
    public Client getClient(String clientID) {
        return null;
    }

    @Override
    public void updateBook(Book b, String idProvider, int amount, float prise) throws Exception {

    }

    @Override
    public void updateProvider(Provider c) {

    }

    @Override
    public void updateClient(Client c) {

    }

    @Override
    public void delBook(int systemNumber, String idProvider) throws Exception {

    }

    @Override
    public void delProvider(String providerID) {

    }

    @Override
    public void delClient(String clientID) {

    }


    @Override
    public ArrayList<Book> getBooks() {
        return null;
    }

    @Override
    public ArrayList<Client> getClients() {
        return null;
    }

    @Override
    public ArrayList<Provider> getProviders() {
        return null;
    }

    @Override
    public ArrayList<Book> getBooksProvider(String idProvider) {
        return null;
    }

    @Override
    public void updateAmountBook(int idBook, String idProvider, int amount) throws Exception {

    }

    @Override
    public ArrayList<Book> getBooksByCategory(String category) {
        return null;
    }

    @Override
    public void addOrder(Order o, ArrayList<SubOrder> subOrders) {

    }

    @Override
    public ArrayList<Book_Provider> getBooksByCost(ArrayList<Book> books, float min, float max) {
        return null;
    }

    @Override
    public ArrayList<Book_Provider> booksToBook_Providers(ArrayList<Book> books) {
        return null;
    }
}
