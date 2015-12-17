package entities;
import android.util.Pair;

import java.util.Date;
import java.util.List;

/**
 * Created by aviad on 09/11/2015.
 */
public class Order {
    private long id_order;
    private int idClient;
    private float totalCost;
    private Date dateOfOrder;

    /**
     * constructor which initializes the attributes with default values
     */
    public Order() {
        id_order = 0;
        idClient = 0;
        totalCost = 0;
        dateOfOrder = null;
    }

    /**
     * constructor of the 'Order' class
     *
     * @param idC       id of the client
     * @param totalCost of the order
     * @param d         date of order
     * @throws Exception
     */
    public Order(int idC, float totalCost, Date d) throws Exception {
        if (idC == 0 || d == null || totalCost < 0)
            throw new Exception("Invalid input\n");
        idClient = idC;
        this.totalCost = totalCost;
        dateOfOrder = d;
        id_order = 0; //we don't give a value to the ID field, the backend has to do it
    }

    public long getId() {
        return id_order;
    }

    public void setId(long id) {
        this.id_order = id;
    }

    /**
     * get the id of the client
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * set the id of the client
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    /**
     * get the cost of the reservation
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * set the cost of the reservation
     */
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * get the date of the reservation
     */
    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    /**
     * set the date of the reservation
     */
    public void setDateOfOrder(Date dateOrder) {
        this.dateOfOrder = dateOrder;
    }
}
