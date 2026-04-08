package ExerciseThree;

public class ExerciseThreeLaunch {

  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.deposit(500);
    account.printBalance();
    account.deposit(200);
    account.withdraw(100);
    account.withdraw(700);
    account.printBalance();

    SavingsAccount savings = new SavingsAccount();
    savings.deposit(500);
    savings.printBalance();
    savings.deposit(150);
    savings.withdraw(300);
    savings.withdraw(260);
    savings.printBalance();

    System.out.println();
  }

}
