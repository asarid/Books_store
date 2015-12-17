package entities;

/**
 * Created by aviad on 10/11/2015.
 */
public class Book_Provider {

    private String bookId, providerId;
    private float price;
    private int amount; //amount of this book above in the store that the provider owns

    /**
     * constructor which gives default values
     */
    public Book_Provider() {
        bookId = providerId = "";
        price = 0;
        amount = 0;
    }
    /**
     * constructor of this class - book_Provider, amount is determined to 1
     * @param bookId the key of the book
     * @param providerId the key of the provider
     * @param price the price of the book
     * @throws Exception if the price is invalid
     */
    public Book_Provider(String bookId, String providerId, float price) throws Exception
    {
        this.bookId = bookId;
        this.providerId = providerId;
        this.amount = 1;

        if (price <= 0)
            throw new Exception("The book may not cost 0 or less NIS.");
        this.price = price;
    }
    /**
     * constructor of this class - book_Provider, amount is determined to 1
     * @param bookId the key of the book
     * @param providerId the key of the provider
     * @param amount amount of this book in the store that the provider owns
     * @param price the price of the book
     * @throws Exception if the amount if less than 1 or the price is invalid
     */
    public Book_Provider(String bookId, String providerId, int amount, float price) throws Exception {
        this.bookId = bookId;
        this.providerId = providerId;

        if (price <= 0)
            throw new Exception("The book may not cost 0 or less NIS.");
        this.price = price;

        if (amount <= 0)
            throw new Exception("amount of book cannot be less than 1.");
        this.amount = amount;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) throws Exception {
        if (amount <= 0)
            throw new Exception("amount of book cannot be less than 1.");
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) throws Exception {
        if (price <= 0)
            throw new Exception("The book may not cost 0 or less NIS!");
        this.price = price;
    }
}
