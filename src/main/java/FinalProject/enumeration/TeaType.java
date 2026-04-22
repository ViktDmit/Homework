package FinalProject.enumeration;

public enum TeaType {
  BLACK("Чёрный"),
  GREEN("Зелёный"),
  FLOWER("Цветочный"),
  FRUIT("Фруктовый"),
  IVAN_CHAI_GOIDA("Иван-чай ГООООЙДА");

  private final String displayName;

  TeaType(String displayName) {
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
