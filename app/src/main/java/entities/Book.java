package entities;

import java.util.Date;

/**
 * Created by aviad on 09/11/2015.
 */
public class Book {

    private String title, author, publisher;
    private Date publishingDate;
    private int systemNumber;
    private String typeOfBook;

    /**
     * constructor which initializes the attributes with default values
     */
    public Book() {
        title = author = publisher = "";
        publishingDate = null;
        systemNumber = 0;
        typeOfBook = "";
    }

    /**
     * the title
     * the author
     * the publisher
     * the creation date
     * the system number
     */
    public Book(String t, String a, String p, Date c, int s, String type) throws Exception {
        if(t==null || a==null || p==null || c==null || s == 0 || type.equals(("")))
            throw new Exception("Invalid input\n");
        title=t;
        author=a;
        publisher=p;
        publishingDate=c;
        systemNumber=s;
        typeOfBook = type;
    }

    /**
     * get the title Book
     */
    public String getTitle() {
        return title;
    }

    /**
     * set the title Book
     */
    public void setTitle(String title) throws Exception{
        if(title==null)
            throw new Exception("Invalid title\n");
        this.title = title;
    }

    /**
     * get the author Book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * set the author Book
     */
    public void setAuthor(String author) throws Exception{
        if(author==null)
            throw new Exception("Invalid author\n");
        this.author = author;
    }

    /**
     * get the publisher Book
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * set the publisher Book
     */
    public void setPublisher(String publisher) throws Exception{
        if(publisher==null)
            throw new Exception("Invalid publisher\n");
        this.publisher = publisher;
    }

    /**
     * get the creation date Book
     */
    public Date getPublishingDate() {
        return publishingDate;
    }

    /**
     * set the creation date Book
     */
    public void setPublishingDate(Date creationDate) throws Exception {
        if(creationDate==null)
            throw new Exception("Invalid creation date\n");
        this.publishingDate = creationDate;
    }

    /**
     * get the system number Book
     */
    public int getSystemNumber() {
        return systemNumber;
    }

    /**
     * set the system number Book
     */
    public void setSystemNumber(int systemNumber) throws Exception{
        if(systemNumber==0)
            throw new Exception("Invalid system number\n");
        this.systemNumber = systemNumber;
    }

    public String getTypeOfBook() {
        return typeOfBook;
    }

    public void setTypeOfBook(String typeOfBook) {
        this.typeOfBook = typeOfBook;
    }
}

