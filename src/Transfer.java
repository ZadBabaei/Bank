import java.util.Date;

public class Transfer {
    public Date transferDate;
    public Account sender;
    public Account receiver;
    public double transferValue;



    public Transfer(double transferValue, Account originAccount, Account destinationAccount){
        transferDate=new Date();
        this.transferValue=transferValue;
        this.receiver=destinationAccount;
        sender=originAccount;
        originAccount.transferTo(this,destinationAccount);

    }
    public void printSenderReceiver(){
        System.out.println("sender is "+this.sender+" receiver is "+this.receiver);
    }


}
