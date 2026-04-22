package FinalProject;

import FinalProject.enumeration.Country;
import FinalProject.enumeration.Manufacturer;
import FinalProject.enumeration.Package;
import java.math.BigDecimal;

public abstract class Drink {

  private final String name;

  private final BigDecimal price;

  private final Float weight;

  private final Manufacturer manufacturer;

  private final Country country;

  private final Package Package;

  protected Drink(String name, BigDecimal price, Float weight,
      Manufacturer manufacturer, Country country, Package Package) {
    this.name = name;
    this.price = price;
    this.weight = weight;
    this.manufacturer = manufacturer;
    this.country = country;
    this.Package = Package;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public Float getWeight() {
    return weight;
  }

  public Manufacturer getManufacturer() {
    return manufacturer;
  }

  public Country getCountry() {
    return country;
  }

  public Package getaPackage() {
    return Package;
  }


}
