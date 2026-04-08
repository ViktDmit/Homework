package FinalProject;

import java.math.BigDecimal;

public class CartItem {

  private final Drink drink;

  private Short count;

  public CartItem(Drink drink, short count) {
    if (drink == null) {
      throw new IllegalArgumentException("Напиток не выбран");
    }
    if (count < 1) {
      throw new IllegalArgumentException("Должен быть минимум 1");
    }
    this.drink = drink;
    this.count = count;
  }

  public Drink getDrink() {
    return drink;
  }


  public Short getCount() {
    return count;
  }

  public void setCount(short count) {
    if (count < 1) {
      throw new IllegalArgumentException("Должен быть положительным");
    }
    this.count = count;
  }

  public BigDecimal getSubtotal() {
    return drink.getPrice().multiply(BigDecimal.valueOf(count));
  }
}
