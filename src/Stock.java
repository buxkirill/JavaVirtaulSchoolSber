public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice) {
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPreviousClosingPrice;
        currentPrice = newCurrentPrice;
    }
    double getChangePercent() {
        return (previousClosingPrice - currentPrice) / previousClosingPrice * 100;
    }

}
