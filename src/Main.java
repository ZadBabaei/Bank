import java.util.UUID;

public class Main {

    public  void printEverything(){

    }

    static public void main(String args[]){
       //printEverything();
//        UUID uuid = UUID.randomUUID();
        User user1=new User("zad","babaei");
        Account account1 = new Account("Checking", 100);
        Account account2 = new Account("Checking", 200);
        Account account3 = new Account("Checking", 300);
        user1.addAccount(account1);
        user1.addAccount(account2);
        user1.addAccount(account3);
        user1.printAccounts();




        System.out.println(user1.getUserName());
        System.out.println(user1.getUserLastName());



//        uuid = UUID.randomUUID();
        User user2=new User("soodi","ghorbani");


    }
}
