package ExersiceSix;

public class Car {

  private String marka;
  private String carClass;
  private Driver driver;
  private Engine engine;

  public String getMarka() {
    return marka;
  }

  public void setMarka(String marka) {
    this.marka = marka;
  }

  public String getCarClass() {
    return carClass;
  }

  public void setCarClass(String carClass) {
    this.carClass = carClass;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void start() {
    System.out.println("Поехали");
  }

  public void stop() {
    System.out.println("Останавливаемся");
  }

  public void turnRight() {
    System.out.println("Поворот направо");
  }

  public void turnLeft() {
    System.out.println("Поворот налево");
  }

  @Override
  public String toString() {
    return "ExersiceSix.Car{" +
        "marka='" + marka + '\'' +
        ", carClass='" + carClass + '\'' +
        ", driver=" + driver +
        ", engine=" + engine +
        '}';
  }
}
