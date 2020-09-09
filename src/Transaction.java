import java.util.Date;

public class Transaction {
    public boolean isDeposit= true;
    public double value;
    public Date  date;
    public double newBalance;

    public Transaction(double value,boolean isDeposit)
    {
        this.isDeposit=isDeposit;
        this.value = value;
         date=new Date();
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
            newBalance=balance+value;
        }else
        {
            newBalance=balance-value;
        }
        return newBalance;




    }
}
