import java.util.Date;

public class GenericTransaction {
    public Date date;
    public double value;
    protected String test;

    GenericTransaction(double value){
        date=new Date();
        this.value = value;
    }

    // TODO: print()
}
