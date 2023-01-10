package Ch9Inheritance.LawFirmV3;

import java.util.ArrayList;
import java.util.Arrays;

public class MyLawFirm {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>(Arrays.asList(new Employee[] {new Marketer(), new Lawyer(), new LegalSecretary(), new Secretary()}));
        //Quinn marketer
        //Jason lawyer
        //Val legal secretary
        //Rosemary secretary

        for (Employee employee: employees) {
            printEmployeeInformation(employee);
        }

    }

    public static void printEmployeeInformation(Employee employee) {
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Please fill out the " + employee.getVacationForm() + " form\n");
    }
}
