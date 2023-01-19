package Ch9Inheritance.LawFirmV3;

import Ch8Classes.BankAccount.Address;
import Ch8Classes.BankAccount.DateOfBirth;

public class Employee {
    //fields
    private String name, email, ssn, position;
    private int years, id;
    private double salary;
    private DateOfBirth dateOfBirth;
    private Address address;

    private static int numOfEmployees;

    //constructors
    public Employee(){
        numOfEmployees++;
        this.name = "Unknown";
        this.email = "N/A";
        this.ssn = "";
        this.position = position;
        this.years = years;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.id = numOfEmployees;
    }


    public Employee(String name, String email, String ssn, String position, int years, double salary, DateOfBirth dateOfBirth, Address address) {
        numOfEmployees++;
        this.name = name;
        this.email = email;
        this.ssn = ssn;
        this.position = position;
        this.years = years;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.id = numOfEmployees;
    }

    //getters
    public String getVacationForm(){
        return "yellow";
    }

    public int getVacationDays(){ return 15; }

    public String getName() {
        return name;
    }

    public String getEmail() { return email; }

    public int getYears() { return years; }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public static int getNumOfEmployees() {
        return numOfEmployees;
    }

    public String getPosition() {
        return position;
    }

    //setters

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) { this.address = address; }


    //ToString
    @Override
    public String toString() {
        return "Name: " + name +
                "\nDate Of Birth: " + dateOfBirth +
                "\nAddress: " + address +
                "\nEmail: " + email +
                "\nSalary: " + salary;
    }
}
