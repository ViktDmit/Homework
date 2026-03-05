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

        //Четвертое задание
        Calculator calc = new Calculator();

        calc.multiply(5, 3);        // Вывод: 15
        calc.multiply(2, 3.14);     // Вывод: 6.28
        calc.multiply(1.5, 2.5);    // Вывод: 3.75

        //Пятое задание
        Student student = new Student();
        student.firstName = "Вася";
        student.lastName = "Пупкин";
        student.group = "АТ-09";
        student.averageMark = 4.5;

        System.out.println("Имя: " + student.firstName);
        System.out.println("Фамилия: " + student.lastName);
        System.out.println("Группа: " + student.group);
        System.out.println("Средняя оценка: " + student.averageMark);
        System.out.println("Стипендия: " + student.getScholarship() + " руб.");
        System.out.println();

        Aspirant aspirant = new Aspirant();
        aspirant.firstName = "Петя";
        aspirant.lastName = "Жупкин";
        aspirant.group = "АТ-08";
        aspirant.averageMark = 5.0;
        aspirant.scientificWork = "Почему Мосгаз невоспитанные хамло";

        System.out.println("Имя: " + aspirant.firstName);
        System.out.println("Фамилия: " + aspirant.lastName);
        System.out.println("Группа: " + aspirant.group);
        System.out.println("Средняя оценка: " + aspirant.averageMark);
        System.out.println("Научная работа: " + aspirant.scientificWork);
        System.out.println("Стипендия: " + aspirant.getScholarship() + " руб.");
        System.out.println();

        //Шестое задание
        Driver driver = new Driver();
        driver.setFullName("Николай Фоменко");
        driver.setAge(60);
        driver.setDrivingExperience(30);

        Engine engine = new Engine();
        engine.setPower(190);
        engine.setCompany("Toyota");

        Car car = new Car();
        car.setMarka("Toyota Camry");
        car.setCarClass("Седан");
        car.setDriver(driver);
        car.setEngine(engine);

        System.out.println(car);

        Lorry lorry = new Lorry();
        lorry.setMarka("Volvo FH");
        lorry.setCarClass("Грузовик");
        lorry.setDriver(driver);
        lorry.setEngine(engine);
        lorry.setCarrying(40);
        System.out.println(lorry);

        SportCar sportCar = new SportCar();
        sportCar.setMarka("Ferrari F40");
        sportCar.setCarClass("Спорткар");
        sportCar.setDriver(driver);
        sportCar.setEngine(engine);
        sportCar.setMaxSpeed(320.0);
        System.out.println(sportCar);
    }
}