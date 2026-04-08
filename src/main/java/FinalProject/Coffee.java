package FinalProject;

import FinalProject.enumeration.CoffeeType;
import FinalProject.enumeration.Country;
import FinalProject.enumeration.Manufacturer;
import FinalProject.enumeration.Roasting;
import java.math.BigDecimal;

public final class Coffee extends Drink {

  private final CoffeeType coffeeType;

  private final Roasting roasting;

  public Coffee(String name, BigDecimal price, Float weight,
      Manufacturer manufacturer, Country country,
      FinalProject.enumeration.Package Package, CoffeeType coffeeType, Roasting roasting) {
    super(name, price, weight, manufacturer, country, Package);
    this.coffeeType = coffeeType;
    this.roasting = roasting;
  }

  public CoffeeType getCoffeeType() {
    return coffeeType;
  }

  public Roasting getRoasting() {
    return roasting;
  }


}
