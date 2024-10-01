import java.util.ArrayList;

public class Main7 {
  public static void main(String[] args) {
    Bank bank = new Bank();

    Account account = new Account("Suraj", 807151, 100);

    bank.addAccount(account);
    bank.deposit(account, 101);
    System.out.println(account.getBalance());

    bank.withdraw(account, 1);
    System.out.println(account.getBalance());
  }
}

class Bank { // can be singleton
  private ArrayList<Account> accounts = new ArrayList<>();

  public void addAccount(Account account) {
    accounts.add(account);
  }

  public void removeAccount(Account account) {
    accounts.remove(account);
  }

  public void deposit(Account account, int amount) {
    account.deposit(amount);
  }

  public void withdraw(Account account, int amount) {
    account.withdraw(amount);
  }
}

class Account {
  private String name;
  private int accountNumber;
  private int balance;

  public Account(String name, int accountNumber, int amount) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = amount;
  }

  public void deposit(int amount) {
    this.balance += amount;
  }

  public void withdraw(int amount) {
    this.balance -= amount;
  }

  public int getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }
}