import FinalProject.Address;
import FinalProject.CartItem;
import FinalProject.Coffee;
import FinalProject.Order;
import FinalProject.Tea;
import FinalProject.User;
import FinalProject.enumeration.Aroma;
import FinalProject.enumeration.CoffeeType;
import FinalProject.enumeration.Country;
import FinalProject.enumeration.Manufacturer;
import FinalProject.enumeration.Package;
import FinalProject.enumeration.Roasting;
import FinalProject.enumeration.Role;
import FinalProject.enumeration.Status;
import FinalProject.enumeration.TeaType;
import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {

    // 1. Пользователь
    User user = new User("Вася", "Пупкин", "+7 123 456-78-90", "VasyaPupkin@rt.com",
        "VasyaPupkin", "MoshniiParol", Role.CUSTOMER);

    // 2. Адрес
    Address address = new Address(Country.RUSSIA, "Московская область", "Москва",
        "Тверская", "15", "42", "123456");

    // 3. Напитки
    Coffee coffee = new Coffee("Lavazza Qualita Oro", BigDecimal.valueOf(750.00), 0.25f,
        Manufacturer.LAVAZZA, Country.ITALY, Package.TETRAPAK,
        CoffeeType.GROUND, Roasting.MEDIUM_ROAST);

    Tea tea = new Tea("Иван-Чай", BigDecimal.valueOf(200.00), 0.25f,
        Manufacturer.ZOLOTAIA_CHASHA, Country.RUSSIA, Package.CARDBOARD,
        TeaType.IVAN_CHAI_GOIDA, Aroma.FLOWER);

    // 4. Корзина
    CartItem coffeeItem = new CartItem(coffee, (short) 2);
    CartItem teaItem = new CartItem(tea, (short) 1);

    CartItem[] cartItems = {coffeeItem, teaItem};

    // 5. Заказ
    Order order = new Order(user, address, cartItems, Status.NEW);

    // 6. Вывод информации
    System.out.println("=== Информация о заказе ===");
    System.out.println("Дата: " + order.getOrderDate());
    System.out.println(
        "Покупатель: " + order.getUser().getName() + " " + order.getUser().getLastName());
    System.out.println("Адрес: " + order.getAddress().getCountry() + ", " +
        order.getAddress().getCity() + ", " + order.getAddress().getStreet() + " " +
        order.getAddress().getHouse() + ", кв. " + order.getAddress().getAppartment());
    System.out.println("Статус: " + order.getStatus());
    System.out.println("Состав заказа:");
    for (CartItem item : order.getCartItemArray()) {
      System.out.printf("  - %s x%d = %.2f руб.%n",
          item.getDrink().getName(),
          item.getCount(),
          item.getSubtotal().doubleValue());
    }
    System.out.printf("Итого: %.2f руб.%n", order.getTotalPrice().doubleValue());
  }
}