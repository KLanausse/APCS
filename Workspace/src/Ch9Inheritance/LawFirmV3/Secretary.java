package Ch9Inheritance.LawFirmV3;

import Ch8Classes.BankAccount.Address;
import Ch8Classes.BankAccount.DateOfBirth;

public class Secretary extends Employee {
    private String skill;

    public Secretary(){ super(); skill = "notes"; }

    public Secretary(String name, String email, String ssn, String position, int years, double salary, DateOfBirth dateOfBirth, Address address) {
        super(name, email, ssn, position, years, salary, dateOfBirth, address);
        skill = "notes";
    }

    public String notes() {
        return "taking good notes...";
    }
}
