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

    //Getters

    /**
     * Gets the Building Number
     * @return Building Number
     */
    public int getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Gets the Zip Code
     * @return Zip Code
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * Gets the Street
     * @return Street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Gets the Unit Number
     * @return Unit Number
     */
    public String getUnitNum() {
        return unitNum;
    }

    /**
     * Gets the City
     * @return City
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets the State
     * @return State
     */
    public String getState() {
        return state;
    }

    //Setters

    /**
     * Sets the Building Number
     * @param buildingNumber the new Building Number
     */
    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    /**
     * Sets the Zip Code
     * @param zipCode the new Zip Code
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Sets the Street Name
     * @param street new Street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Sets the Unit Number
     * @param unitNum new Unit Number
     */
    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum;
    }

    /**
     * Sets the City
     * @param city the new City
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the State
     * @param state the new State
     */
    public void setState(String state) {
        this.state = state;
    }

    //toString
    @Override
    public String toString() {
        if (unitNum != null)
            return buildingNumber + " " + street + " " + unitNum + "\n" + city + " " + street + " " + zipCode;
        return buildingNumber + " " + street + "\n" + city + " " + street + " " + zipCode;
    }
}
