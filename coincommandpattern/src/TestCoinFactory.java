
public class TestCoinFactory {

	public static void main(String[] args) {
		Coin coin = new Coin();
		CoinValue coinValue = new CoinValue();
		coinValue.setCommand(new CoinCentValueCommand(coin));
		coinValue.getValue();
		
		coinValue.setCommand(new CoinNickelValueCommand(coin));
		coinValue.getValue();
	
		coinValue.setCommand(new CoinDollarValueCommand(coin));
		coinValue.getValue();	
	}
}
