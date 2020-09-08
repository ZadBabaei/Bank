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

    public String generateUserId() {
        return this.userName + "_" + this.userLastName + "_" + Math.random()*1000;
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

    public void makeDposit(String accountName, Transaction deposit){
//        boolean found = false;
        for (int i=0; i<=accounts.size();i++)
        {
            if (accounts.get(i).name.equals(accountName))
            {
//                found = true;
                this.accounts.get(i).makeTransaction(deposit);
                return;
            }
        }
        System.out.println("account not found");
    }

    public void printAccounts() {

        System.out.println(this.accounts.get(0).name);
        System.out.println(this.accounts.get(0).balance);
        String r=this.accounts.get(0).name;
        System.out.println("..............................");
        System.out.println(r);
    }
}
