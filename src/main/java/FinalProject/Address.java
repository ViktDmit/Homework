package FinalProject;

import FinalProject.enumeration.Country;

public final class Address {

  private final Country country;

  private final String region;

  private final String city;

  private final String street;

  private final String house;

  private final String appartment;

  private final String index;

  public Address(Country country, String region, String city, String street,
      String house, String appartment, String index) {
    this.country = country;
    this.region = region;
    this.city = city;
    this.street = street;
    this.house = house;
    this.appartment = appartment;
    this.index = index;
  }

  public Country getCountry() {
    return country;
  }

  public String getRegion() {
    return region;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public String getHouse() {
    return house;
  }

  public String getAppartment() {
    return appartment;
  }

  public String getIndex() {
    return index;
  }
}
