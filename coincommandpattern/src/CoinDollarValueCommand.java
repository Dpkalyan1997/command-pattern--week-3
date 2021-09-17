
public class CoinDollarValueCommand implements Command{
	Coin coin;
	public CoinDollarValueCommand(Coin coin)
	{
		this.coin = coin;
	}
	@Override
	public void execute() {
		coin.dollarValue();		
	}
}