package Ch9Inheritance.LawFirmV3;

import Ch8Classes.BankAccount.Address;
import Ch8Classes.BankAccount.DateOfBirth;

import java.util.ArrayList;
import java.util.Arrays;

public class MyLawFirm {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>(Arrays.asList(
                new Marketer(
                        "Quinn",
                        "Quinn@gmail.com",
                        "1111111111111",
                        "Marketer",
                        17,
                        500000,
                        new DateOfBirth(
                                2006,
                                5,
                                4
                        ),
                        new Address(
                                8,
                                "Mamaroneck Rd.",
                                "Mamaroneck",
                                "NY",
                                10543
                        )
                ),
                new Lawyer(
                        "Jason",
                        "Jason@gmail.com",
                        "2222222222222",
                        "Lawyer",
                        6,
                        455231.06,
                        new DateOfBirth(
                                2006,
                                6,
                                4
                        ),
                        new Address(
                                9,
                                "Mamaroneck Rd.",
                                "Mamaroneck",
                                "NY",
                                10543
                        )
                ),
                new LegalSecretary(
                        "Val",
                        "Val@gmail.com",
                        "3333333333",
                        "LegalSecretary",
                        6,
                        455231.06,
                        new DateOfBirth(
                                2006,
                                6,
                                4
                        ),
                        new Address(
                                10,
                                "Mamaroneck Rd.",
                                "Mamaroneck",
                                "NY",
                                10543
                        )
                ),
                new Secretary(
                        "Rosemary",
                        "Val@gmail.com",
                        "3333333333",
                        "LegalSecretary",
                        6,
                        455231.06,
                        new DateOfBirth(
                                2006,
                                5,
                                23
                        ),
                        new Address(
                                11,
                                "Mamaroneck Rd.",
                                "Mamaroneck",
                                "NY",
                                10543
                        )
                )
        ));
        //Quinn marketer
        //Jason lawyer
        //Val legal secretary
        //Rosemary secretary

        for (Employee employee: employees) {
            System.out.println(employee+"\n");
        }

    }

    public static void printEmployeeInformation(Employee employee) {
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Please fill out the " + employee.getVacationForm() + " form\n");
    }
}
