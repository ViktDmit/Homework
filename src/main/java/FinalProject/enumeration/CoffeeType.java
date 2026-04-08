package FinalProject.enumeration;

public enum CoffeeType {
  GROUND("Эспрессо"),
  BEAN("Зерно"),
  INSTANT("Растворимый");


  private final String displayName;

  CoffeeType(String displayName) {
    this.displayName = displayName;
  }

  public String getDisplayName() {
    return displayName;
  }

  @Override
  public String toString() {
    return displayName;
  }


}
