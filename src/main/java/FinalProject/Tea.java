package FinalProject;

import FinalProject.enumeration.Aroma;
import FinalProject.enumeration.Country;
import FinalProject.enumeration.Manufacturer;
import FinalProject.enumeration.TeaType;
import java.math.BigDecimal;

public final class Tea extends Drink {

  private final TeaType teaType;

  private final Aroma aroma;

  public Tea(String name, BigDecimal price, Float weight,
      Manufacturer manufacturer, Country country,
      FinalProject.enumeration.Package Package, TeaType teaType, Aroma aroma) {
    super(name, price, weight, manufacturer, country, Package);
    this.teaType = teaType;
    this.aroma = aroma;
  }

  public TeaType getTeaType() {
    return teaType;
  }


  public Aroma getAroma() {
    return aroma;
  }


}
