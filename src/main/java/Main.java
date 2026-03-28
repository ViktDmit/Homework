import ExerciseFive.Aspirant;
import ExerciseFive.Student;
import ExerciseFour.Calculator;
import ExerciseOne.Person;
import ExerciseSeven.Phone;
import ExerciseThree.BankAccount;
import ExerciseThree.SavingsAccount;
import ExerciseTwo.Rectangle;
import ExersiceSix.*;
import FinalProject.*;
import FinalProject.enumeration.*;
import FinalProject.enumeration.Package;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

        System.out.println();

        // Второе задание
        Rectangle rect1 = new Rectangle();
        rect1.setWidth(5.0);
        rect1.setHeight(3.0);

        Rectangle rect2 = new Rectangle();
        rect2.setWidth(7.5);
        rect2.setHeight(4.2);

        rect1.printInfo();
        rect2.printInfo();

        System.out.println();

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

        System.out.println();

        //Четвертое задание
        Calculator calc = new Calculator();

        calc.multiply(5, 3);
        calc.multiply(2, 3.14);
        calc.multiply(1.5, 2.5);

        System.out.println();

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

        System.out.println();

        //Седьмое задание
        Phone phone1 = new Phone("123-45-67", "iPhone Z", 0.164);
        Phone phone2 = new Phone("987-65-43", "Samsung S25", 0.169);

        System.out.println("Информация о телефонах:");
        System.out.println(phone1);
        System.out.println(phone2);

        System.out.println("\nТест 1: phone1 звонит phone2");
        phone1.receiveCall(phone2);

        System.out.println("\nТест 2: phone1 звонит сам себе");
        phone1.receiveCall(phone1);

        System.out.println();

        //Восьмое задание
        ExerciseEight.Person person3 = new ExerciseEight.Person();

        ExerciseEight.Person person4 = new ExerciseEight.Person("Иван Петров", 25);

        System.out.println("Объект person3 (конструктор по умолчанию):");
        person3.move();
        person3.talk();

        System.out.println();

        System.out.println("Объект person4 (параметризованный конструктор):");
        person4.move();
        person4.talk();

        System.out.println();

        //Девятое задание

        ExerciceNine.Car car1 = new ExerciceNine.Car("Toyota Camry", 2022);

        ExerciceNine.Car car2 = new ExerciceNine.Car(null, null);

        System.out.println("Информация о первом автомобиле:");
        System.out.println(car1.toString());

        System.out.println();

        System.out.println("Информация о втором автомобиле (с null в конструкторе):");
        System.out.println(car2.toString());

        System.out.println();

        //Десятое задание

        ExerciseTen.Rectangle rect3 = new ExerciseTen.Rectangle(5, 10);

        ExerciseTen.Rectangle rect4 = new ExerciseTen.Rectangle(rect3);

        System.out.println("Первый прямоугольник: " + rect3);
        System.out.println("Второй прямоугольник (копия): " + rect4);

        System.out.println("rect3 == rect4? " + (rect3 == rect4));
        System.out.println("rect3.equals(rect4)? " + rect3.equals(rect4));

        System.out.println();

        //Финальное задание
        // 1. Пользователь
        User user = new User();
        user.setName("Вася");
        user.setLastName("Пупкин");
        user.setPhone("+7 123 456-78-90");
        user.setMail("VasyaPupkin@rt.com");
        user.setLogin("VasyaPupkin");
        user.setPassword("MoshniiParol");
        user.setRole(Role.CUSTOMER);

        // 2. Адрес
        Address address = new Address();
        address.setCountry(Country.RUSSIA);
        address.setRegion("Московская область");
        address.setCity("Москва");
        address.setStreet("Тверская");
        address.setHouse("15");
        address.setAppartment("42");
        address.setIndex("123456");

        // 3. Напитки
        Coffee coffee = new Coffee();
        coffee.setName("Lavazza Qualita Oro");
        coffee.setPrice(BigDecimal.valueOf(750.00));
        coffee.setWeight(0.25f);
        coffee.setManufacturer(Manufacturer.LAVAZZA);
        coffee.setCountry(Country.ITALY);
        coffee.setaPackage(Package.TETRAPAK);
        coffee.setCoffeeType(CoffeeType.GROUND);
        coffee.setRoasting(Roasting.MEDIUM_ROAST);

        Tea tea = new Tea();
        tea.setName("Иван-Чай");
        tea.setPrice(BigDecimal.valueOf(200.00));
        tea.setWeight(0.25f);
        tea.setManufacturer(Manufacturer.ZOLOTAIA_CHASHA);
        tea.setCountry(Country.RUSSIA);
        tea.setaPackage(Package.CARDBOARD);
        tea.setTeaType(TeaType.IVAN_CHAI_GOIDA);
        tea.setAroma(Aroma.FLOWER);

        // 4. Корзина
        CartItem coffeeItem = new CartItem();
        coffeeItem.setDrink(coffee);
        coffeeItem.setCount((short) 2);

        CartItem teaItem = new CartItem();
        teaItem.setDrink(tea);
        teaItem.setCount((short) 1);

        CartItem[] cartItems = {coffeeItem, teaItem};

        // 5. Заказ
        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        order.setUser(user);
        order.setAddress(address);
        order.setStatus(Status.NEW);

        BigDecimal total = BigDecimal.ZERO;
        for (CartItem item : cartItems) {
            BigDecimal itemPrice = item.getDrink().getPrice().multiply(BigDecimal.valueOf(item.getCount()));
            total = total.add(itemPrice);
        }
        order.setTotalPrice(total);
        order.setCartItemArray(cartItems);

        // 6. Вывод информации
        System.out.println("=== Информация о заказе ===");
        System.out.println("Дата: " + order.getOrderDate());
        System.out.println("Покупатель: " + order.getUser().getName() + " " + order.getUser().getLastName());
        System.out.println("Адрес: " + order.getAddress().getCountry() + ", " +
                order.getAddress().getCity() + ", " + order.getAddress().getStreet() + " " +
                order.getAddress().getHouse() + ", кв. " + order.getAddress().getAppartment());
        System.out.println("Статус: " + order.getStatus());
        System.out.println("Состав заказа:");
        for (CartItem item : order.getCartItemArray()) {
            System.out.printf("  - %s x%d = %.2f руб.%n",
                    item.getDrink().getName(),
                    item.getCount(),
                    item.getDrink().getPrice().doubleValue() * item.getCount());
        }
        System.out.printf("Итого: %.2f руб.%n", order.getTotalPrice().doubleValue());
    }
}