import java.util.Date;
import java.util.UUID;

public class Main {

    public  void printEverything(){

    }

    static public void main(String args[]){
        // GET USER COMMANDS
//        String[] command = new String[6];
//        command[0] = "2";
//        command[1] = "deposit";
//        command[2] = "100";
//        command[3] = "1";
//        command[4] = "withdraw";
//        command[5] = "50";
//        command[6] = "1";
//        command[7] = "print";



        //printEverything();
//        UUID uuid = UUID.randomUUID();
        User user1=new User("zad","babaei");
        Account account1 = new Account("Checking", 100);
        Account account2 = new Account("Saving", 200);
        Account account3 = new Account("joint", 300);
        user1.addAccount(account1);
        user1.addAccount(account2);
        user1.addAccount(account3);


        account1.setDeposit(100);
        account1.setDeposit(700);
        account1.setDeposit(600);
        account1.setDeposit(5000);
        account1.setWithdraw(150);
//        user1.makeDposit("joint", 100); // TODO: fix this
        account1.print();



//        user1.printAccounts()
//        System.out.println(user1.getUserName());
//        System.out.println(user1.getUserLastName());


        Date today = new Date();
        System.out.println(today);
    }
}
