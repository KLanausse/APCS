/**
 * This program is a template to create a simple checking account
 *
 *  @author: Kai Lanausse
 *  @since: November 4, 2022
 *  @version: 1.0
 */
package Ch8Classes;

public class BankAccountV1 {
    //Fields
    private String name, ssn, address, dob, phone, email;
    private int pin, accountNumber;
    private double balance;

    private static int totalNumberOfAccounts;

    //Constructor(s)

    /**
     * Account created In-person
     * @param name
     * @param address
     * @param dob
     * @param ssn
     * @param phone
     * @param email
     * @param pin
     * @param balance
     */
    public BankAccountV1(String name, String address, String dob, String ssn, String phone, String email, int pin, int balance){
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
     * @param name
     * @param address
     * @param dob
     * @param ssn
     * @param phone
     * @param email
     * @param pin
     */
    public BankAccountV1(String name, String ssn, String address, String dob, String phone, String email, int pin){
        this(name,address,dob,ssn,phone,email,pin,0);
    }

    //Getters

    /**
     * Gets the bank account's name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the address connected to the account
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the phone number connected to the account
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Gets the E-Mail connected to the account
     * @return
     */
    public String getEmail() {
        return email;
    }

    //Setters

    /**
     * Sets/changes the address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(double amount) {
        balance+=amount;
    }

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
