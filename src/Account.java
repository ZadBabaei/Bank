import java.util.ArrayList;
import java.util.Iterator;

public class Account {

    String name;
    double openingBalance;
    double balance;
    public ArrayList<GenericTransaction> transactions;

    public Account(java.lang.String name, double openingBalance) {
        this.name = name;
        this.openingBalance = openingBalance;
        this.balance=openingBalance;
        transactions=new ArrayList<GenericTransaction>();
    }


    public void makeTransaction(Transaction transaction) {

        // line 1: add transaction to transactions list
        // line 2: adjust balance using a function in transaction. Rules: transaction should not adjust the balance
        // this.balance = transaction.calculateNewBalance(this.balance)
        // this.balance = this.balance + transaction.getDifference()
        transactions.add(transaction); // store in list
        this.balance=transaction.calculateNewBalance(balance);
    }

    public void transferTo(Transfer newTransfer){

        this.balance=balance-newTransfer.value;
        transactions.add(newTransfer);

    }
    public void transferFrom(Transfer newTransfer){
        this.balance=this.balance+newTransfer.value;
        transactions.add(newTransfer);
    }

       public void print()
       {

           System.out.println("");
           System.out.println("");
           System.out.println("Account : "+name);
           System.out.println("");
        System.out.println("opening balance : "+openingBalance+"$");
           System.out.println("");

        for(int i = 0; i < transactions.size(); i++)
        {
            transactions.get(i).print();
            System.out.println("");
        }


        System.out.println("Ending balance : "+balance+"$");
           System.out.println("");

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

