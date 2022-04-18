
public class YourFirstAccount {

    public static void main(String[] args) {
        Account dylansAccount = new Account("Dylan's account", 100.0);
        dylansAccount.deposit(20);
        System.out.println("The balance of Dylan's account is now: " 
                + dylansAccount);
    }
    

}

