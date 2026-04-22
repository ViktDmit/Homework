package FinalProject;

import FinalProject.enumeration.Role;

public class User {

  private final String name;

  private final String lastName;

  private final String phone;

  private final String mail;

  private final String login;

  private String password;

  private final Role role;

  public User(String name, String lastName, String phone, String mail,
      String login, String password, Role role) {
    this.name = name;
    this.lastName = lastName;
    this.phone = phone;
    this.mail = mail;
    this.login = login;
    this.password = password;
    this.role = role;
  }


  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPhone() {
    return phone;
  }

  public String getMail() {
    return mail;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  public Role getRole() {
    return role;
  }


  public void setPassword(String password) {
    this.password = password;
  }
}
