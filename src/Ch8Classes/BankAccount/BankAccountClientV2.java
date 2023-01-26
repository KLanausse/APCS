package Ch8Classes.BankAccount;

public class BankAccountClientV2 {
    public static void main(String[] args){

        BankAccountV2[] accounts = new BankAccountV2[3];

        //Kai (Online)
        Address kaiAddress = new Address(123, "Main Street", "A254", "Mamaroneck", "NY", 10543);
        DateOfBirth kaiDateOfBirth = new DateOfBirth(2006, 7, 4);
        accounts[0] = new BankAccountV2("Kai", "123456789", kaiAddress, kaiDateOfBirth, "123-456-7890", "kai@cs.com", 1337);
        accounts[0].deposit(8080);

        //Roesmary (In person)
        Address roesmaryAddress = new Address(123, "Main Street", "Mamaroneck", "NY", 10543);
        DateOfBirth roesmaryDateOfBirth = new DateOfBirth(2005, 6, 23);
        accounts[1] = new BankAccountV2("Roesmary", "123456789", roesmaryAddress, roesmaryDateOfBirth, "123-456-7890", "roesmary@cs.com", 3753, 100);

        //Quinn (In person)
        Address quinnAddress = new Address(123, "Main Street", "Mamaroneck", "NY", 10543);
        DateOfBirth quinnDateOfBirth = new DateOfBirth(2006, 6, 4);
        accounts[2] = new BankAccountV2("Quinn", "123456789", quinnAddress, quinnDateOfBirth, "123-456-7890", "quinn@cs.com", 7613, 1000000);

        //Print accounts
        for (BankAccountV2 account: accounts) {
            System.out.println(account);
            System.out.println();
        }
    }
}
