package FinalProject.enumeration;

public enum Roasting {
  DARK("Темная"),
  MEDIUM_DARK("Средне-темная"),
  MEDIUM_ROAST("Средняя"),
  LIGHT_ROAST("Светлая");

  private final String displayName;

  Roasting(String displayName) {
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
