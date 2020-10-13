public class Main {

    public  void printEverything(){

    }

    static public void main(String args[]) throws InterruptedException {
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
        Account account1 =new Account("checking", 100);
        Account account2 = new Account("Saving", 200);
        Account account3 = new Account("joint", 300);
//        AccountInterface acc4 = accountFactory("test", 123);

        user1.addAccount(account1);
//        user1.addAccount(account2);
//        user1.addAccount(account3);


        Transaction deposit1=new Transaction(900,true,account1);
        Transaction withdraw1=new Transaction(300,false,account1);
        Transfer transfer1=new Transfer(200,account1,account3);
//
//        Printer printer = new Printer();


        Printer p1 = new Printer();
        p1.printAllAccountInformation(account1, user1);







//        Date today = new Date();
//        System.out.println(today);
    }

    // factory design pattern:
//    public static AccountInterface accountFactory(String name, double v) {
//        return new Account(name, v);
//    }
}
//interface AccountInterface{
//    void makeTransaction(Transaction transaction);


