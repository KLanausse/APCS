package Ch8Classes;

public class BankAccountClientV1 {
    public static void main(String[] args){
        BankAccountV1 kai = new BankAccountV1("Kai", "123456789", "123 Main Street", "07042006", "123-456-7890", "kai@cs.com", 1337);
        kai.deposit(8080);
        System.out.println(kai);

        BankAccountV1 roesmary = new BankAccountV1("Roesmary", "123456789", "123 Main Street", "06232005", "123-456-7890", "roesmary@cs.com", 3753);
    }
}
