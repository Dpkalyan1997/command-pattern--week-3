
public class CoinNickelValueCommand implements Command{
	Coin coin;
	public CoinNickelValueCommand(Coin coin)
	{
		this.coin = coin;
	}
	@Override
	public void execute() {
		coin.nickelValue();		
	}
}