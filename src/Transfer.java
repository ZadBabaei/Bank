import java.util.Date;

public class Transfer  { // TODO: extend generic transaction
    public Date transferDate;
    public Account sender;
    public Account receiver;
    public double transferValue;




    public Transfer(double transferValue, Account originAccount, Account destinationAccount){
//        super( value, isDeposit);
        transferDate=new Date();
        this.transferValue=transferValue;
        this.receiver=destinationAccount;
        sender=originAccount;
        originAccount.transferTo(this,destinationAccount);


    }
    public void printSenderReceiver(){
        System.out.println("sender is "+this.sender.name+" receiver is "+this.receiver.name);
    }


}
