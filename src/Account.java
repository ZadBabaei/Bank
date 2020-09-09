import java.util.ArrayList;

public class Account {

    String name;
    double openingBalance;
    double balance;
    public ArrayList<Transaction> transactions;
    public ArrayList<Transfer> transfers;


    public Account(java.lang.String name, double openingBalance) {
        this.name = name;
        this.openingBalance = openingBalance;
        this.balance=openingBalance;
        transactions=new ArrayList<Transaction>();
        transfers = new ArrayList<Transfer>();
    }


    public void makeTransaction(Transaction transaction) {

        // line 1: add transaction to transactions list
        // line 2: adjust balance using a function in transaction. Rules: transaction should not adjust the balance
        // this.balance = transaction.calculateNewBalance(this.balance)
        // this.balance = this.balance + transaction.getDifference()
        transactions.add(transaction); // store in list
        this.balance=transaction.calculateNewBalance(balance);
    }

    public void transferTo(Transfer newTransfer,Account destination){

        this.balance=balance-newTransfer.transferValue;
        destination.balance=destination.balance+newTransfer.transferValue;
        transfers.add(newTransfer);

    }

       public void print()
       {
           // TODO: merge the deposits and withdraws lists
           System.out.println("");
           System.out.println("");
           System.out.println("Account : "+name);
           System.out.println("");
        System.out.println("opening balance : "+openingBalance+"$");
           System.out.println("");

        for(int i = 0; i < transactions.size(); i++)
        {
        System.out.println(transactions.get(i).date   +"  ----->   the amount of transaction is "+transactions.get(i).getValueForPrinting());
            System.out.println("");
        }
           for(int i = 0; i < transfers.size(); i++) {
               System.out.println(transfers.get(i).transferDate + "  ----->   the amount of transfer is " + transfers.get(i).transferValue);
               System.out.println("");
           }

        System.out.println("Ending balance : "+balance+"$");
           System.out.println("");
           for(int i = 0; i < transfers.size(); i++) {
               transfers.get(i).printSenderReceiver();
           }

    }
}
/*
    Print:

    Account: checking

    Opening balance: $5.00
    25 August - +$25.00 (Deposit)
    25 August - +$25.00 (Deposit)
    25 August - +$25.00 (Deposit)

    25 August - -$10.00 (Withdraw)
    25 August - -$10.00 (Withdraw)
    25 August - -$10.00 (Withdraw)

    25 August - +$10.00 (From Savings)
    25 August - +$10.00 (From Savings)
    25 August - +$10.00 (From Savings)

    25 August - -$15.00 (To joint)
    25 August - -$15.00 (To joint)
    25 August - -$15.00 (To joint)

    Ending balance: $45.00
 */

