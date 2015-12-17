package entities;
import java.util.Date;
import java.util.List;

/**
 * Created by aviad on 01/11/2015.
 */
public class Client extends Person {

    //statistical information
    private int numberOfEntries; //number of times the costumer entered to the system
    private int numberOfOrders;
    private float moneyUsed;

    /**
     * constructor which initializes the attributes with default values
     */
    public Client() {
        super();
        numberOfEntries = numberOfOrders = 0;
        moneyUsed = 0;
    }

    /**
     * constructor of the Costumer class
     * @param privateName private name
     * @param familyName family name
     * @param id ID
     * @param city city
     * @param street street
     * @param accountNumber of his bank account
     * @param bankName bank name
     * @param houseNumber house number
     * @param dob date of birth
     * @param phoneNumber
     * @param homeNumber
     * @param userName
     * @param password
     * @param defTypeAcc defualt type of account - provider or client
     * @throws Exception if one of the arguments isn't valid
     */
    public Client(String privateName, String familyName, String id, String city, String street, String accountNumber, String bankName,
                  int houseNumber, Date dob, String phoneNumber, String homeNumber, String userName, String password, String defTypeAcc) throws Exception {

        super(privateName, familyName, id, city, street, accountNumber, bankName, houseNumber, dob, phoneNumber,
                homeNumber, userName, password, defTypeAcc);
    }

    public String getPrivateName() {
        return super.getPrivateName();
    }

    public void setPrivateName(String privateName) throws Exception {
        super.setPrivateName(privateName);
    }

    public String getFamilyName() {
        return super.getFamilyName();
    }

    public void setFamilyName(String familyName) throws Exception {
        super.setFamilyName(familyName);
    }

    public String getId() {
        return super.getId();
    }

    public void setId(String id) throws Exception {
        super.setId(id);
    }

    public String getCity() {
        return super.getCity();
    }

    public void setCity(String city) throws Exception {
        super.setCity(city);
    }

    public String getStreet() {
        return super.getStreet();
    }

    public void setStreet(String street) throws Exception {
        super.setStreet(street);
    }

    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    public void setAccountNumber(String accountNumber) throws Exception{
        super.setAccountNumber(accountNumber);
    }

    public String getBankName() {
        return super.getBankName();
    }

    public void setBankName(String bankName) throws Exception {
        super.setBankName(bankName);
    }

    public int getHouseNumber() {
        return super.getHouseNumber();
    }

    public void setHouseNumber(int houseNumber) throws Exception {
        super.setHouseNumber(houseNumber);
    }

    public String getUserName() {
        return super.getUserName();
    }

    public void setUserName(String userName) {
        super.setUserName(userName);
    }

    public String getPassword() {
        return super.getPassword();
    }

    public void setPassword(String password) {
        super.setPassword(password);
    }

    public Date getDob() {
        return super.getDob();
    }

    public void setDob(Date dob) throws Exception {
        super.setDob(dob);
    }

    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    public void setPhoneNumber(String phoneNumber) throws Exception{
        super.setPhoneNumber(phoneNumber);
    }

    public String getHomeTelephoneNumber() {
        return super.getHomeTelephoneNumber();
    }

    public void setHomeTelephoneNumber(String homeTelephoneNumber) throws Exception {
        super.setHomeTelephoneNumber(homeTelephoneNumber);
    }

    public String getDefaultTypeOfAcc()
    {
        return super.getDefaultTypeAccount();
    }

    public void  setDefaultTypeOfAcc(String accType)
    {
        super.setDefaultTypeAccount(accType);
    }


    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfReservations) {
        this.numberOfOrders = numberOfReservations;
    }

    public float getMoneyUsed() {
        return moneyUsed;
    }

    public void setMoneyUsed(float moneyUsed) {
        this.moneyUsed = moneyUsed;
    }
}
