package Ch9Inheritance.FinancialInstruments;

public class Stock extends ShareAsset {

    private int totalShares;

    public Stock(String symbol, double currentPrice){
        super(symbol, currentPrice);
        totalShares = 0;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public double getMarketValue() {
        return totalShares;// * getCurrentPrice();
    }

    public double getProfit(){
        return getMarketValue(); // - getTotalCost();
    }

    //setters
    public void purchase(int shares, double pricePerShare){

    }
}
