import java.util.ArrayList;
import java.util.Date;

public class Account {
    String name;
    double openingBalance;
    double balance;
    double deposit;
    double withdraw;

    public ArrayList<Date> withdrawDate;
    public ArrayList<Deposit> deposits;
    public ArrayList<Double> withdrawValue;
    public ArrayList<Double> transferredFromThisAccountValues;
    public ArrayList<Double> transferredToThisAccountValues;
    public ArrayList<String> senders;
    public ArrayList<String> receivers;


    public Account(String name, double openingBalance) {
        this.name = name;
        this.openingBalance = openingBalance;
        this.balance=openingBalance;
        deposits=new ArrayList<Deposit>();

        withdrawValue=new ArrayList<Double>();
        withdrawDate=new ArrayList<Date>();
        transferredFromThisAccountValues = new ArrayList<Double>();
        transferredToThisAccountValues = new ArrayList<Double>();
        senders=new ArrayList<String>();
        receivers =new ArrayList<String >();

    }



    public void setDeposit(Deposit deposit) {
//        this.depositDates.add(new Date());
        deposits.add(deposit); // store in list


        this.balance=balance+deposit.depositValue;

    }

    public void transferTo(double value,Account destination){
        this.balance=balance-value;
        destination.balance=destination.balance+value;
        destination.transferredToThisAccountValues.add(value);
        transferredFromThisAccountValues.add(value);
        destination.senders.add(name);
        receivers.add(destination.name);

    }

    public void setWithdraw(double withdraw) {
        this.withdrawValue.add(withdraw); // store in list
        this.balance=balance-withdraw;
        this.withdrawDate.add(new Date());


    }

       public void print() {
        System.out.println("the amount for opening balance is : "+openingBalance+"$");



        for(int i = 0; i < deposits.size(); i++) {
        System.out.println(deposits.get(i).depositDate   +"   the amount of deposit is +"+deposits.get(i).depositValue+"$");
        }
        System.out.println("");
        for(int i = 0; i < withdrawValue.size(); i++) {
            System.out.println(withdrawDate.get(i)   +"   the amount of withdraw is -"+withdrawValue.get(i)+"$");
        }
        System.out.println("closing balance"+balance);
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

