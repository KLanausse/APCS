package Ch8Classes.BankAccount;
/**
 * This program is a template to create a simple checking account
 * Version 2: This version uses aggregation
 *
 *  @author: Kai Lanausse
 *  @since: November 10, 2022
 *  @version: 2.0
 */

public class BankAccountV2 {
    //Fields
    private String name, ssn, phone, email;
    private int pin, accountNumber;
    private double balance;
    private Address address;
    private DateOfBirth dob;

    private static int totalNumberOfAccounts;

    //Constructor(s)

    /**
     * Account created In-person
     * @param name Account name
     * @param address Home address
     * @param dob Date of Birth
     * @param ssn Social Security Number
     * @param phone Phone Number
     * @param email E-Mail
     * @param pin Pin code
     * @param balance Amount added
     */
    public BankAccountV2(String name, String ssn, Address address, DateOfBirth dob, String phone, String email, int pin, int balance){
        totalNumberOfAccounts++;
        this.address = address;
        this.balance = balance;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.dob = dob;
        this.ssn = ssn;
        this.pin = pin;

        this.accountNumber = totalNumberOfAccounts;
    }

    /**
     * Account created online
     * @param name Account name
     * @param address Home address
     * @param dob Date of Birth
     * @param ssn Social Security Number
     * @param phone Phone Number
     * @param email E-Mail
     * @param pin Pin code
     */
    public BankAccountV2(String name, String ssn, Address address, DateOfBirth dob, String phone, String email, int pin){
        this(name, ssn,address,dob,phone,email,pin,0);
    }

    //Getters

    /**
     * Gets the bank account's name
     * @return Account Name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the address connected to the account
     * @return Home Address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Gets the phone number connected to the account
     * @return Phone Number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Gets the E-Mail connected to the account
     * @return E-Mail
     */
    public String getEmail() {
        return email;
    }

    //Setters

    /**
     * Sets/changes the address linked to the account
     * @param address New Address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Sets/changes the phone number linked to the account
     * @param phone New Phone Number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Sets/changes the E-mail linked to the account
     * @param email new E-mail
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Adds the amount deposited to the account balance
     * @param amount amount deposited
     */
    public void deposit(double amount) {
        balance+=amount;
    }

    /**
     * Removes the amount withdrawn from the account balance
     * @param amount amount withdrawn
     */
    public void withdraw(double amount) {
        balance-=amount;
    }

    //toString
    public String toString(){
        return "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Ending Balance: " + balance + "\n" +
                "Thank you for being a valued customer!";
    }
}
