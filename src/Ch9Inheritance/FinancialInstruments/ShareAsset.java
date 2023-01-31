package Ch9Inheritance.FinancialInstruments;

public abstract class ShareAsset implements Asset {

    private String symbol;
    private double totalCost, currentPrice;

    //Constructors
    public ShareAsset(String symbol, double currentPrice){
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }
}
