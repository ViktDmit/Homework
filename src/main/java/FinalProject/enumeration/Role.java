package FinalProject.enumeration;

public enum Role {
  CUSTOMER("Покупатель"),
  ADMIN("Администратор");

  private final String displayName;

  Role(String displayName) {
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
