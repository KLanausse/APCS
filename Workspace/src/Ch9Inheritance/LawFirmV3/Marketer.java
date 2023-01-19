package Ch9Inheritance.LawFirmV3;

import Ch8Classes.BankAccount.Address;
import Ch8Classes.BankAccount.DateOfBirth;

public class Marketer extends Employee {
    private String skill;

    public Marketer(){ super(); skill = "advertise"; }

    public Marketer(String name, String email, String ssn, String position, int years, double salary, DateOfBirth dateOfBirth, Address address) {
        super(name, email, ssn, position, years, salary, dateOfBirth, address);
        skill = "advertise";
    }

    public double getSalary() {
        return super.getSalary()+10000;
    }

    public String advertise() {
        return "I'll sell you garbage.";
    }
}