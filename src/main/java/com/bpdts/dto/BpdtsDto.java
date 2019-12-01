package com.bpdts.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "first_name", "last_name", "email", "ip_address", "latitude", "longitude", "city"})
@JsonPropertyOrder({"id", "first_name", "last_name", "email", "ip_address", "latitude", "longitude", "city"})
@XmlRootElement(name = "instructions", namespace = "##default")
public class BpdtsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id = 1;

    private String first_name = "Reemu";

    private String last_name="Ganesh";

    private String email="rameswaree@gmail.com";

    private String ip_address="10.102.14.129";

    private double latitude=50.126485;

    private  double longitude=-51.0326485;

    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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
}
