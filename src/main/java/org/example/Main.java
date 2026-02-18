package org.example;

public class Main {
    public static void main(String[] args) {
        // Первое задание
        Person person1 = new Person();
        person1.name = "Димасик";
        person1.age = 33;

        Person person2 = new Person();
        person2.name = "Костик";
        person2.age = 61;

        System.out.printf("Первый человек: имя = %s, возраст = %d%n", person1.name, person1.age);
        System.out.printf("Второй человек: имя = %s, возраст = %d%n", person2.name, person2.age);


        // Второе задание
        Rectangle rect1 = new Rectangle();
        rect1.setWidth(5.0);
        rect1.setHeight(3.0);

        Rectangle rect2 = new Rectangle();
        rect2.setWidth(7.5);
        rect2.setHeight(4.2);



        rect1.printInfo();
        rect2.printInfo();


        //Третье задание
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
    }
}