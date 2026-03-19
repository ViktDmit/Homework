package ExerciseThree;

public class BankAccount {
    private int accountBalance;

    public void deposit(int amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Внесено: " + amount + ". Новый баланс: " + accountBalance);
        } else {
            System.out.println("Сумма для внесения должна быть положительной");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            if (accountBalance >= amount) {
                accountBalance -= amount;
                System.out.println("Снято: " + amount + ". Новый баланс: " + accountBalance);
            } else {
                System.out.println("Недостаточно средств. Текущий баланс: " + accountBalance);
            }
        } else {
            System.out.println("Сумма для снятия должна быть положительной");
        }
    }

    public void printBalance() {
        System.out.println("Текущий баланс: " + accountBalance);
    }

    protected int getBalance() {
        return accountBalance;
    }

}

