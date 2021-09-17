
public class CoinCentValueCommand implements Command{
	Coin coin;
	public CoinCentValueCommand(Coin coin)
	{
		this.coin = coin;
	}
	@Override
	public void execute() {
		coin.centValue();		
	}
}
