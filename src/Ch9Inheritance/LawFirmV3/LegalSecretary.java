package Ch9Inheritance.LawFirmV3;

import Ch8Classes.BankAccount.Address;
import Ch8Classes.BankAccount.DateOfBirth;

public class LegalSecretary extends Secretary {

    private String skill;

    public LegalSecretary(){ super(); skill = "prepareLegalDocs"; }

    public LegalSecretary(String name, String email, String ssn, String position, int years, double salary, DateOfBirth dateOfBirth, Address address) {
        super(name, email, ssn, position, years, salary, dateOfBirth, address);
        skill = "prepareLegalDocs";
    }

    public double getSalary(){
        return super.getSalary()+5000;
    }

    public String prepareLegalDocs() {
        return "I specialize in preparing legal docs.";
    }
}
