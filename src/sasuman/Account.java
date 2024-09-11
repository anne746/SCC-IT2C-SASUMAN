package sasuman;

import java.util.Scanner;

public class Account {
    Accounts accountManager = new Accounts();

    public void getAccounts() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts to add: ");
        int numAccounts = sc.nextInt();

        for (int i = 0; i < numAccounts; i++) {
            System.out.print("First Name: ");
            String firstName = sc.next();
            System.out.print("Last Name: ");
            String lastName = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Username: ");
            String username = sc.next();
            System.out.print("Password: ");
            String password = sc.next();

            accountManager.addAccount(firstName, lastName, email, username, password);
        }

        accountManager.viewAccounts();
    }
}
