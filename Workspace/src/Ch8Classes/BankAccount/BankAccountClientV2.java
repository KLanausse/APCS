package Ch8Classes.BankAccount;

public class BankAccountClientV2 {
    public static void main(String[] args){
        //Kai (Online)
        Address kaiAddress = new Address(123, "Main Street", "Mamaroneck", "NY", 10543);
        DateOfBirth kaiDateOfBirth = new DateOfBirth(2006, 7, 4);
        BankAccountV2 kai = new BankAccountV2("Kai", "123456789", kaiAddress, kaiDateOfBirth, "123-456-7890", "kai@cs.com", 1337);
        kai.deposit(8080);
        System.out.println(kai);
        System.out.println();

        //Roesmary (In person)
        Address roesmaryAddress = new Address(123, "Main Street", "Mamaroneck", "NY", 10543);
        DateOfBirth roesmaryDateOfBirth = new DateOfBirth(2005, 6, 23);
        BankAccountV2 roesmary = new BankAccountV2("Roesmary", "123456789", roesmaryAddress, roesmaryDateOfBirth, "123-456-7890", "roesmary@cs.com", 3753, 100);
        System.out.println(roesmary);
        System.out.println();

        //Quinn (In person)
        Address quinnAddress = new Address(123, "Main Street", "Mamaroneck", "NY", 10543);
        DateOfBirth quinnDateOfBirth = new DateOfBirth(2006, 6, 4);
        BankAccountV2 quinn = new BankAccountV2("Quinn", "123456789", quinnAddress, quinnDateOfBirth, "123-456-7890", "quinn@cs.com", 7613, 1000000);
        System.out.println(quinn);
        System.out.println();
    }
}
