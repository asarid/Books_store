package entities;
import java.util.Date;
import java.util.List;

//to update in android studio!

/**
 * Created by aviad on 09/11/2015.
 */
public class Provider extends Person {

    private float moneyEarned; //the amount of money this provider earned
    private List<String> reviews; //the id's of all the reviews which relevant to this provider


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
     * @param defAccType defualt type of account - provider or client
     * @throws Exception if one of the arguments isn't valid
     */
    public Provider(String privateName, String familyName, String id, String city, String street, String accountNumber, String bankName,
                    int houseNumber, Date dob, String phoneNumber, String homeNumber, String userName, String password, String defAccType) throws Exception {

        super(privateName, familyName, id, city, street, accountNumber, bankName, houseNumber, dob, phoneNumber,
                homeNumber, userName, password, defAccType);
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

    public void setDefaultTypeOfAcc(String accType)
    {
        super.setDefaultTypeAccount(accType);
    }

    public float getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(float moneyEarned) throws Exception {
        if (moneyEarned < 0)
            throw new Exception("the money which this provider earned is not valid.");
        this.moneyEarned = moneyEarned;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) throws Exception {
        if (reviews == null)
            throw new Exception("the list is null.");
        this.reviews = reviews;
    }


    //functions


}
