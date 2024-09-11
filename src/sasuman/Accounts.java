package sasuman;

import java.util.ArrayList;

public class Accounts {
    ArrayList<AccountDetails> accountList = new ArrayList<>();

    public void addAccount(String firstName, String lastName, String email, String username, String password) {
        accountList.add(new AccountDetails(firstName, lastName, email, username, password));
    }

    public void viewAccounts() {
        for (AccountDetails account : accountList) {
            System.out.println(account);
        }
    }
}

class AccountDetails {
    static int lastId = 0;
    int id;
    String firstName, lastName, email, username, password;

    public AccountDetails(String firstName, String lastName, String email, String username, String password) {
        this.id = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "ID: " + id + ", " + firstName + " " + lastName + ", Email: " + email + ", Username: " + username +
                ", Password: " + password;
    }
}
