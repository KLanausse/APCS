package Ch9Inheritance.LawFirmV3;

public class LegalSecretary extends Secretary {

    public double getSalary(){
        return 45000;
    }

    public String prepareLegalDocs() {
        return "I specialize in preparing legal docs.";
    }
}
