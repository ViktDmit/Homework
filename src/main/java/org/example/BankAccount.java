package org.example;

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

    protected void setBalance(int balance) {
        this.accountBalance = balance;
    }
}

class SavingsAccount extends BankAccount {

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
