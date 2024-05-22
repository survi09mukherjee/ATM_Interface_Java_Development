import java.util.Scanner;

public class ATM {

  int balance = 10000;
  int withdraw;
  int deposit;

  public void withdraw() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter amount to withdraw:");
    withdraw = sc.nextInt();

    if (withdraw > balance) {
      System.out.println("Insufficient balance!");
    } else {
      balance = balance - withdraw;
      System.out.println("Amount withdrawn successfully! \n Remaining balance = " + balance);
    }
  }

  public void deposit() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter amount to deposit:");
    deposit = sc.nextInt();

    balance = balance + deposit;
    System.out.println("Amount deposited successfully! \n Current balance = " + balance);
  }

  public void checkBalance() {
    System.out.println("Your current balance is: " + balance);
  }

  public static void main(String[] args) {
    ATM atm = new ATM();
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("** Welcome to ATM Interface!**");
      System.out.println("1. Withdraw");
      System.out.println("2. Deposit");
      System.out.println("3. Check Balance");
      System.out.println("4. Exit");
      System.out.println("Enter your choice: ");

      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          atm.withdraw();
          break;
        case 2:
          atm.deposit();
          break;
        case 3:
          atm.checkBalance();
          break;
        case 4:
          System.out.println("Thank you for using ATM! \nExiting...");
          System.exit(0);
        default:
          System.out.println("Invalid choice! Please enter a number between 1 and 4.");
      }
    }
  }
}
