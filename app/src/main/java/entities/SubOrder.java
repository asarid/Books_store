package entities;

/**
 * Created by aviad on 12/11/2015.
 * This purpose of this class is to represent a part of single order which focuses on the books that the client ordered from a certain provider,
 * and the Order class will contain a collection of SubOrder's, each one for different provider.
 */
public class SubOrder {

    private String idSubOrder /*primary key*/, idOrder /*foreign key*/, idProvider;
    private int amount;
    private float pricePerSingleBook;

    public SubOrder()
    {
        idSubOrder = idOrder = idProvider = "";
        amount = 0;
        pricePerSingleBook = 0;
    }

    public SubOrder(String idSubOrder, String idOrder, String idProvider, int amount, float pricePerSingleBook) throws Exception
    {
        this.idSubOrder = idSubOrder;
        this.idOrder = idOrder;
        this.idProvider = idProvider;

        if (pricePerSingleBook <= 0)
            throw new Exception("The book may not cost 0 or less NIS.");
        this.pricePerSingleBook = pricePerSingleBook;

        if (amount <= 0)
            throw new Exception("amount of book cannot be less than 1.");
        this.amount = amount;
    }

    public String getIdSubOrder() {
        return idSubOrder;
    }

    public void setIdSubOrder(String idSubOrder) {
        this.idSubOrder = idSubOrder;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(String idProvider) {
        this.idProvider = idProvider;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) throws Exception {
        if (amount <= 0)
            throw new Exception("amount of book cannot be less than 1.");
        this.amount = amount;
    }

    public float getPricePerSingleBook() {
        return pricePerSingleBook;
    }

    public void setPricePerSingleBook(float pricePerSingleBook) throws Exception {
        if (pricePerSingleBook <= 0)
            throw new Exception("The book may not cost 0 or less NIS.");
        this.pricePerSingleBook = pricePerSingleBook;
    }
}