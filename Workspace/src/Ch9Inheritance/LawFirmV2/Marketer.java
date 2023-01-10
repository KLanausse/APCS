package Ch9Inheritance.LawFirmV2;

public class Marketer extends Employee {
    public double getSalary() {
        return 50000;
    }

    public String advertise() {
        return "I'll sell you garbage.";
    }
}