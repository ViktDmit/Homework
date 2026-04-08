package FinalProject.enumeration;

public enum Aroma {
  TREE("Древесный"),
  FLOWER("Цветочный"),
  FRUIT("Фруктовый");

  private final String displayName;

  Aroma(String displayName) {
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
