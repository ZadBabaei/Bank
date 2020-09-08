import java.util.Date;

public class Transaction {
    public boolean isDeposit= true;
    public double value;
    public Date  date;

    public Transaction(double value,boolean isDeposit)
    {
        this.isDeposit=isDeposit;
        this.value = value;
         date=new Date();
    }

    public String getValueForPrinting() {
        if(this.isDeposit) {
            return "+" + value + "$ type: deposit";
        } else {
            return "-" + value + "$ type: withdraw";
        }
    }
}
