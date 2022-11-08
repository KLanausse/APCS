/**
 *
 */
package Ch8Classes.BankAccount;

public class Address {
    //Fields
    private int buildingNumber,zipCode;
    private String street, unitNum, city, state;

    //Constructors
    private Address(int buildingNumber, String street, String unitNum, String city, String state, int zipCode){
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.unitNum = unitNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    private Address(int buildingNumber, String street, String city, String state, int zipCode){
        this(buildingNumber,street, null, city, state, zipCode);
    }
}
