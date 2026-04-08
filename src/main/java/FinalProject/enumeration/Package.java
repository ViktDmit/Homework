package FinalProject.enumeration;

public enum Package {
  PAPER("Бумажная"),
  STEEL("Стальная"),
  TETRAPAK("Тетрапак"),
  CARDBOARD("Картонная");


  private final String displayName;

  Package(String displayName) {
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
