import java.util.ArrayList;
import java.util.Date;

public class Account {
    String name;
    double openingBalance;
    double balance;
    double deposit;
    double withdraw;
    public ArrayList<Date> depositDates;
    public ArrayList<Date> withdrawDate;
    public ArrayList<Double>depositValue;
    public ArrayList<Double>withdrawValue;


    public Account(String name, double openingBalance) {
        this.name = name;
        this.openingBalance = openingBalance;
        depositValue=new ArrayList<Double>();
        depositDates=new ArrayList<Date>();
        withdrawValue=new ArrayList<Double>();
        withdrawDate=new ArrayList<Date>();

    }



    public void setDeposit(double deposit) {


        this.depositValue.add(deposit); // store in list
        this.balance=balance+deposit;
        this.depositDates.add(new Date());
    }

    public void setWithdraw(double withdraw) {

        this.withdrawValue.add(withdraw); // store in list
        this.balance=balance-withdraw;
        this.withdrawDate.add(new Date());


    }

    public double getBalance() {
        return balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void print() {


        for(int i = 0; i < depositValue.size(); i++) {
        System.out.println("the amount of deposit is +"+depositValue.get(i));
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

