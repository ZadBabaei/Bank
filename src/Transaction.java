import java.util.Date;

public class Transaction extends GenericTransaction {
    public boolean isDeposit= true;



    public Transaction(double value,boolean isDeposit,Account account)
    {
        super(value);
        account.makeTransaction(this);
        this.isDeposit=isDeposit;
    }

    public String getValueForPrinting() {
        if(this.isDeposit) {
            return "+" + value + "$ (type: deposit)";
        } else {
            return "-" + value + "$ (type: withdraw)";
        }
    }
    public double calculateNewBalance(double balance){
        if(isDeposit)
        {
            return balance+value;
        }else
        {
            return balance-value;
        }

    }
}
