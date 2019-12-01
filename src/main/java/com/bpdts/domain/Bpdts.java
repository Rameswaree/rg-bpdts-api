package com.bpdts.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tblBpdts")
public class Bpdts implements Serializable {
  
  private static final long serialVersionUID = 7280549021416983975L;
  
    @Column(name = "intBpdtsId", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(name = "firstName", nullable = true)
    private String firstName;
  
   @Column(name = "lastName", nullable = true)
    private String lastName;
  
  @Column(name = "email", nullable = true)
    private String email;
  
  @Column(name = "ip_address", nullable = true)
    private String ip_address;
  
  @Column(name = "latitude", nullable = true)
    private double latitude;
  
  @Column(name = "longitude", nullable = true)
    private double longitude;
  
  @Column(name = "city", nullable = true)
    private String city;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getIp_address() {
    return ip_address;
  }

  public void setIp_address(String ip_address) {
    this.ip_address = ip_address;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bpdts bpdts = (Bpdts) o;
    return Double.compare(bpdts.latitude, latitude) == 0 &&
            Double.compare(bpdts.longitude, longitude) == 0 &&
            Objects.equals(id, bpdts.id) &&
            Objects.equals(firstName, bpdts.firstName) &&
            Objects.equals(lastName, bpdts.lastName) &&
            Objects.equals(email, bpdts.email) &&
            Objects.equals(ip_address, bpdts.ip_address) &&
            Objects.equals(city, bpdts.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, ip_address, latitude, longitude, city);
  }

  @Override
  public String toString() {
    return "Bpdts{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", ip_address='" + ip_address + '\'' +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", city='" + city + '\'' +
            '}';
  }
}
