package ExerciceNine;

public class Car {

  private final String model;
  private final Integer year;

  public Car(String model, Integer year) {

    this.model = (model != null) ? model : "Unknown";

    this.year = (year != null) ? year : 0;
  }

  public String getModel() {
    return model;
  }

  public Integer getYear() {
    return year;
  }

  @Override
  public String toString() {
    return "Car{model='" + model + "', year=" + year + "}";
  }
}
