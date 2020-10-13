import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class Transfer extends GenericTransaction  {
    public Account sender;
    public Account receiver;


    public Transfer(double value,  Account originAccount, Account destinationAccount){
        super(value);
        this.receiver=destinationAccount;
        sender=originAccount;
        originAccount.transferTo(this);
        destinationAccount.transferFrom(this);

    }
    public void printSenderReceiver(){
        System.out.println("sender is "+this.sender.name+" receiver is "+this.receiver.name);
    }

    public void print() {
        super.print();
        System.out.print(this.date + " - the amount of transfer is "+ this.value + " - sender:" + sender.name + " - receiver: " + receiver.name);
    }

}
