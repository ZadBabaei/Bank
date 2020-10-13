public class Printer {




    public Printer(){

    }

    public void printAllAccountInformation(Account account, User user) {
        System.out.println("User ID: "+user.getUserId());
        System.out.println("");
        System.out.println("UserName :"+user.getUserName()+" "+ user.getUserLastName());
        System.out.println("");
        System.out.println("Account : "+account.name);
        System.out.println("");
        System.out.println("opening balance : "+account.openingBalance+"$");
        System.out.println("");

        for(int i = 0; i < account.transactions.size(); i++)
        {
            account.transactions.get(i).print();
            System.out.println("");
        }



        System.out.println("Ending balance : "+account.balance+"$");
        System.out.println("");

    }

    }


