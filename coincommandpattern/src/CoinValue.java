
public class CoinValue {
    Command command;
    public void setCommand(Command command)
    {
    	this.command = command;
    }
    
    public void getValue() {
    	command.execute();
    }
}
