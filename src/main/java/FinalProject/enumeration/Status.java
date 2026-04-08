package FinalProject.enumeration;

public enum Status {
  NEW("Новый"),
  PAYED("Оплачен"),
  CANCELED("Отменен"),
  APPROVE("Подтвержден"),
  DONE("Выполнен");

  private final String displayName;

  Status(String displayName) {
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
