package Ch9Inheritance.LawFirmV3;

import Ch8Classes.BankAccount.Address;
import Ch8Classes.BankAccount.DateOfBirth;

public class Lawyer extends Employee {

    private String skill;

    public Lawyer(){ super(); skill = "sue"; }

    public Lawyer(String name, String email, String ssn, String position, int years, double salary, DateOfBirth dateOfBirth, Address address) {
        super(name, email, ssn, position, years, salary, dateOfBirth, address);
        skill = "sue";
    }

    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }

    public String getVacationForm(){
        return "pink";
    }

    public void sue(){
        System.out.println("I'll see you in court!");
    }
}
