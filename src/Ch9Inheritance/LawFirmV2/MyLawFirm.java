package Ch9Inheritance.LawFirmV2;

public class MyLawFirm {
    public static void main(String[] args) {
        //Quinn marketer
        Marketer quinn = new Marketer();
        printEmployeeInformation(quinn);

        //Jason lawyer
        Lawyer jason = new Lawyer();
        printEmployeeInformation(jason);

        //Val legal secretary
        LegalSecretary val = new LegalSecretary();
        printEmployeeInformation(val);

        //Rosemary secretary
        Secretary rosemary = new Secretary();
        printEmployeeInformation(rosemary);

    }

    public static void printEmployeeInformation(Employee employee) {
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Please fill out the " + employee.getVacationForm() + "\n");
    }
}
