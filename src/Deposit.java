import java.util.Date;

public class Deposit {
    public double depositValue;
    public Date depositDate;

    public Deposit(double depositValue)
    {
        this.depositValue=depositValue;
        depositDate=new Date();
    }
}
