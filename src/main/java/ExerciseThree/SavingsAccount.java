package ExerciseThree;

public class SavingsAccount extends BankAccount {

    @Override
    public void withdraw(int amount) {
        if (amount > 0) {
            if (getBalance() - amount >= 100) {
                super.withdraw(amount);
            } else {
                System.out.println("Операция невозможна: баланс не может опуститься ниже 100. Текущий баланс: " + getBalance());
            }
        } else {
            System.out.println("Сумма для снятия должна быть положительной");
        }
    }
}
