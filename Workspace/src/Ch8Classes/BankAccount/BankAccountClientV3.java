package Ch8Classes.BankAccount;

public class BankAccountClientV3 {
    public static void main(String[] args){

        BankAccountV3[] accounts = {
                new BankAccountV3(
                        "Kai", 
                        "123456789", 
                        new Address(
                                123, 
                                "Main Street", 
                                "A254", 
                                "Mamaroneck", 
                                "NY", 
                                10543
                        ),
                        new DateOfBirth(
                                2006, 
                                7, 
                                4
                        ),
                        "123-456-7890", 
                        "kai@cs.com", 
                        1337
                ),
                new BankAccountV3(
                        "Roesmary", 
                        "123456789", 
                        new Address(
                                123, 
                                "Main Street", 
                                "Mamaroneck", 
                                "NY", 
                                10543
                        ), 
                        new DateOfBirth(
                                2005, 
                                6, 
                                23
                        ), 
                        "123-456-7890", 
                        "roesmary@cs.com", 
                        3753, 
                        100
                ),
                new BankAccountV3(
                        "Quinn", 
                        "123456789", 
                        new Address(
                                123, 
                                "Main Street", 
                                "Mamaroneck", 
                                "NY", 
                                10543
                        ), 
                        new DateOfBirth(
                                2006, 
                                6, 
                                4
                        ), 
                        "123-456-7890", 
                        "quinn@cs.com", 
                        7613, 
                        1000000
                )
        };
        
        accounts[0].deposit(8080);
        
        //Print accounts
        for (BankAccountV3 account: accounts) {
            System.out.println(account);
            System.out.println();
        }
    }
}
