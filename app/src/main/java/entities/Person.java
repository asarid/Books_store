package entities;
import java.util.Date;

/**
 * Created by aviad on 09/11/2015.
 */
public abstract class Person {

    private String privateName, familyName, id, city, street;
    private String accountNumber, bankName;
    private int houseNumber;
    private Date dob; //date of birth
    private String phoneNumber, homeTelephoneNumber;
    private String userName, password, defaultTypeAccount;

    /**
     * constructor which initializes the attributes with default values
     */
    protected Person() {
        privateName = familyName = id = city = street = "";
        accountNumber = bankName = "";
        houseNumber = 0;
        dob = null;
        phoneNumber = homeTelephoneNumber = "";
        userName = password = "";
        defaultTypeAccount="";
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
     * @param defTypeAcc default type of account - provider or client
     * @throws Exception if one of the arguments isn't valid
     */
    protected Person(String privateName, String familyName, String id, String city, String street, String accountNumber, String bankName,
                     int houseNumber, Date dob, String phoneNumber, String homeNumber, String userName, String password, String defTypeAcc) throws Exception {

        if (privateName == null)
            throw new Exception("The private name cannot be empty!");
        this.privateName = privateName;

        if (familyName == null)
            throw new Exception("The family name cannot be empty!");
        this.familyName = familyName;

        if (id == null || id.length() != 9)
            throw new Exception("invalid ID!");
        for (int i=0 ; i < 9 ; i++)
        {
            if (id.charAt(i) < '0' || id.charAt(i) > '9')
                throw new Exception("invalid ID!");
        }
        this.id = id;

        if (city == null)
            throw new Exception("The city name cannot be empty!");
        for (int i=0 ; i < city.length() ; i++)
        {
            if (city.charAt(i) != ' ' && (city.charAt(i) < 'A' || city.charAt(i) > 'z'))
                throw new Exception("invalid city name!");
        }
        this.city = city;

        if (street == null)
            throw new Exception("The street name cannot be empty!");
        for (int i=0 ; i < street.length() ; i++)
        {
            if (street.charAt(i) != ' ' && (street.charAt(i) < 'A' || street.charAt(i) > 'z'))
                throw new Exception("invalid street name!");
        }
        this.street = street;

        if (accountNumber == null || accountNumber.length() != 9)
            throw new Exception("invalid account number!");
        for (int i=0 ; i < 9 ; i++)
        {
            if (accountNumber.charAt(i) < '0' || accountNumber.charAt(i) > '9')
                throw new Exception("invalid account number!");
        }
        this.accountNumber = accountNumber;

        if (bankName == null)
            throw new Exception("invalid bank name!");
        for (int i=0 ; i < bankName.length() ; i++)
        {
            if (bankName.charAt(i) != ' ' && (bankName.charAt(i) < 'A' || bankName.charAt(i) > 'z'))
                throw new Exception("invalid bank name!");
        }
        this.bankName = bankName;

        if (houseNumber == 0 || houseNumber <= 0)
            throw new Exception("invalid house number!");
        this.houseNumber = houseNumber;

        if (dob == null)
            throw new Exception("invalid DoB!");
        this.dob = dob;


        this.phoneNumber = phoneNumber;
        this.homeTelephoneNumber = homeNumber;


        this.userName = userName;
        this.password = password;

        this.defaultTypeAccount = defTypeAcc;
    }

    /**
     * partial constructor, just for representing to the client
     * @param privateName
     * @param familyName
     * @param city
     * @param street
     * @param houseNumber
     * @param phoneNumber
     * @throws Exception
     */
    protected Person(String privateName, String familyName, String city, String street, int houseNumber, String phoneNumber) throws Exception
    {
        if (privateName == null)
            throw new Exception("The private name cannot be empty!");
        this.privateName = privateName;

        if (familyName == null)
            throw new Exception("The family name cannot be empty!");
        this.familyName = familyName;

        if (city == null)
            throw new Exception("The city name cannot be empty!");
        this.city = city;

        if (street == null)
            throw new Exception("The street name cannot be empty!");
        this.street = street;

        if (houseNumber == 0 || houseNumber <= 0)
            throw new Exception("invalid house number!");
        this.houseNumber = houseNumber;

        this.phoneNumber = phoneNumber;
    }

    protected String getPrivateName() {
        return privateName;
    }

    protected void setPrivateName(String privateName) throws Exception {
        if (privateName != null)
            this.privateName = privateName;
        else
            throw new Exception("The name cannot be empty!");
    }

    protected String getFamilyName() {
        return familyName;
    }

    protected void setFamilyName(String familyName) throws Exception {
        if (familyName == null)
            throw new Exception("The family name cannot be empty!");
        this.familyName = familyName;
    }

    protected String getId() {
        return id;
    }

    protected void setId(String id) throws Exception {
        if (id == null || id.length() != 9)
            throw new Exception("invalid ID!");
        for (int i=0 ; i < 9 ; i++)
        {
            if (id.charAt(i) < '0' || id.charAt(i) > '9')
                throw new Exception("invalid ID!");
        }
        this.id = id;
    }

    protected String getCity() {
        return city;
    }

    protected void setCity(String city) throws Exception {
        if (city == null)
            throw new Exception("The city name cannot be empty!");
        for (int i=0 ; i < city.length() ; i++)
        {
            if (city.charAt(i) != ' ' && (city.charAt(i) < 'A' || city.charAt(i) > 'z'))
                throw new Exception("invalid city name!");
        }
        this.city = city;
    }

    protected String getStreet() {
        return street;
    }

    protected void setStreet(String street) throws Exception {
        if (street == null)
            throw new Exception("The street name cannot be empty!");
        for (int i=0 ; i < street.length() ; i++)
        {
            if (street.charAt(i) != ' ' && (street.charAt(i) < 'A' || street.charAt(i) > 'z'))
                throw new Exception("invalid street name!");
        }
        this.street = street;
    }

    protected String getAccountNumber() {
        return accountNumber;
    }

    protected void setAccountNumber(String accountNumber) throws Exception{
        if (accountNumber == null || accountNumber.length() != 9)
            throw new Exception("invalid account number!");
        for (int i=0 ; i < 9 ; i++)
        {
            if (accountNumber.charAt(i) < '0' || accountNumber.charAt(i) > '9')
                throw new Exception("invalid account number!");
        }

        this.accountNumber = accountNumber;
    }

    protected String getBankName() {
        return bankName;
    }

    protected void setBankName(String bankName) throws Exception {
        if (bankName == null)
            throw new Exception("invalid bank name!");
        for (int i=0 ; i < bankName.length() ; i++)
        {
            if (bankName.charAt(i) != ' ' && (bankName.charAt(i) < 'A' || bankName.charAt(i) > 'z'))
                throw new Exception("invalid bank name!");
        }
        this.bankName = bankName;
    }

    protected int getHouseNumber() {
        return houseNumber;
    }

    protected void setHouseNumber(int houseNumber) throws Exception {
        if (houseNumber == 0)
            throw new Exception("invalid house number!");
        this.houseNumber = houseNumber;
    }

    protected String getUserName() {
        return userName;
    }

    protected void setUserName(String userName) {
        this.userName = userName;
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected Date getDob() {
        return dob;
    }

    protected void setDob(Date dob) throws Exception {
        if (dob == null)
            throw new Exception("invalid DoB!");
        this.dob = dob;
    }

    protected String getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(String phoneNumber) throws Exception{
        if (phoneNumber == null || phoneNumber.length() != 10)
            throw new Exception("invalid phone number!");
        for (int i=0 ; i < 9 ; i++)
        {
            if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9')
                throw new Exception("invalid phone number!");
        }
        this.phoneNumber = phoneNumber;
    }

    protected String getHomeTelephoneNumber() {
        return homeTelephoneNumber;
    }

    protected void setHomeTelephoneNumber(String homeTelephoneNumber) throws Exception {
        if (homeTelephoneNumber == null || homeTelephoneNumber.length() != 9)
            throw new Exception("invalid telephone number!");
        for (int i=0 ; i < 9 ; i++)
        {
            if (homeTelephoneNumber.charAt(i) < '0' || homeTelephoneNumber.charAt(i) > '9')
                throw new Exception("invalid telephone number!");
        }
        this.homeTelephoneNumber = homeTelephoneNumber;
    }

    protected String getDefaultTypeAccount() {
        return defaultTypeAccount;
    }

    protected void setDefaultTypeAccount(String defaultTypeAccount) {
        this.defaultTypeAccount = defaultTypeAccount;
    }
}
