import java.util.ArrayList;

public class User {
    private String userName="";
    private String userLastName="";

    public ArrayList<Account> accounts;
    public int accountCounter = 0;



    public User(String name, String LastName){
        this.userName=name;
        this.userLastName=LastName;
        accounts = new ArrayList<Account>();
    }

   public void setUserName(String name){
        this.userName=name;
   }
   public void setUserLastName(String LastName){
        this.userLastName=LastName;
   }



    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }


    public void addAccount(Account newAccount) {
        this.accounts.add(newAccount);
    }
    public void makeDposit(int accountNumber, double deposit){
        this.accounts.get(accountNumber).setDeposit(deposit);
    }

    public void printAccounts() {

        System.out.println(this.accounts.get(0).name);
        System.out.println(this.accounts.get(0).balance);
        String r=this.accounts.get(0).name;
        System.out.println("..............................");
        System.out.println(r);
    }
}
