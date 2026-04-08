package ExersiceSix;

public class ExersiceSixLaunch {

  public static void main(String[] args) {
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
  }

}
