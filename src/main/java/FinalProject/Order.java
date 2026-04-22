package FinalProject;

import FinalProject.enumeration.Status;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {

  private final LocalDateTime orderDate;

  private final User user;

  private final Address address;

  private Status status;

  private final CartItem[] cartItemArray;

  public Order(User user, Address address, CartItem[] cartItemArray, Status status) {
    this.orderDate = LocalDateTime.now();
    this.user = user;
    this.address = address;
    this.cartItemArray = cartItemArray.clone();
    this.status = status;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public User getUser() {
    return user;
  }

  public Address getAddress() {
    return address;
  }

  public Status getStatus() {
    return status;
  }

  public CartItem[] getCartItemArray() {
    return cartItemArray.clone();
  }

  public void setStatus(Status status) {
    this.status = status;
  }


  public BigDecimal getTotalPrice() {
    BigDecimal sum = BigDecimal.ZERO;
    for (CartItem item : cartItemArray) {
      sum = sum.add(item.getSubtotal());
    }
    return sum;
  }
}
