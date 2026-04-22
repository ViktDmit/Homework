package FinalProject.enumeration;

public enum Manufacturer {
  GREENFIELD("Greenfield"),
  NESCAFE("Nescafe"),
  LAVAZZA("Lavazza"),
  ILLY("Illy"),
  LIPTON("Lipton"),
  MAYSKII("Майский"),
  ZOLOTAIA_CHASHA("Золотая чаша");

  private final String displayName;

  Manufacturer(String displayName) {
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
