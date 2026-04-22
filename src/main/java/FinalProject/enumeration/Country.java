package FinalProject.enumeration;

public enum Country {
  RUSSIA("Россия"),
  ITALY("Италия"),
  CHINA("Китай"),
  INDIA("Индия"),
  BRAZIL("Бразилия"),
  JAPAN("Япония");

  private final String displayName;

  Country(String displayName) {
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
