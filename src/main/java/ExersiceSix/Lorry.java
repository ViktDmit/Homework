package ExersiceSix;

public final class Lorry extends Car {

  private int carrying;

  public int getCarrying() {
    return carrying;
  }

  public void setCarrying(int carrying) {
    this.carrying = carrying;
  }

  @Override
  public String toString() {
    return "ExersiceSix.Lorry{" +
        "marka='" + getMarka() + '\'' +
        ", carClass='" + getCarClass() + '\'' +
        ", driver=" + getDriver() +
        ", engine=" + getEngine() +
        ", carrying=" + carrying +
        '}';
  }
}
