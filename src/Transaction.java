import java.util.Date;

public class Transaction extends GenericTransaction {
    public boolean isDeposit;



    public Transaction(double value,boolean isDeposit,Account account)
    {

        super(value);
        this.isDeposit=isDeposit;
        account.makeTransaction(this);

    }

    public String getValueForPrinting() {
        if(this.isDeposit) {
            return "+" + value + "$ (type: deposit)";
        } else {
            return "-" + value + "$ (type: withdraw)";
        }
    }
    public double calculateNewBalance(double balance){
        if(this.isDeposit)
        {
            balance=balance+value;
        }else
        {balance=balance-value;
        }
        return balance;

    }

    public void print() {
        System.out.println(this.date + " - the amount of transaction is "+ this.getValueForPrinting());
    }
}
