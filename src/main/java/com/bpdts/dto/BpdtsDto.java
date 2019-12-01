package com.bpdts.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "first_name", "last_name", "email", "ip_address", "latitude", "longitude", "city"})
@JsonPropertyOrder({"id", "first_name", "last_name", "email", "ip_address", "latitude", "longitude", "city"})
@XmlRootElement(name = "instructions", namespace = "##default")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BpdtsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String first_name;

    private String last_name;

    private String email;

    private String ip_address;

    private String latitude;

    private  String longitude;

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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
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
        if (this == o)
            return true;
        if (o == null)
            return false;
        if(!(o instanceof BpdtsDto))
            return false;

        BpdtsDto bpdtsDto = (BpdtsDto) o;
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        equalsBuilder.append(id, bpdtsDto.getId());
        equalsBuilder.append(first_name, bpdtsDto.getFirst_name());
        equalsBuilder.append(last_name, bpdtsDto.getLast_name());
        equalsBuilder.append(email, bpdtsDto.getEmail());
        equalsBuilder.append(ip_address, bpdtsDto.getIp_address());
        equalsBuilder.append(latitude, bpdtsDto.getLatitude());
        equalsBuilder.append(longitude, bpdtsDto.getLongitude());
        equalsBuilder.append(city, bpdtsDto.getCity());
        return equalsBuilder.isEquals();
    }

    @Override
    public int hashCode() {

        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        hashCodeBuilder.append(id);
        hashCodeBuilder.append(first_name);
        hashCodeBuilder.append(last_name);
        hashCodeBuilder.append(email);
        hashCodeBuilder.append(ip_address);
        hashCodeBuilder.append(latitude);
        hashCodeBuilder.append(longitude);
        hashCodeBuilder.append(city);
        return hashCodeBuilder.toHashCode();
    }

    @Override
    public String toString() {

        ToStringBuilder builder = new ToStringBuilder(this);

        builder.append("id", id);
        builder.append("first_name", first_name);
        builder.append("last_name", last_name);
        builder.append("email", email);
        builder.append("ip_address", ip_address);
        builder.append("latitude", latitude);
        builder.append("longitude", longitude);
        builder.append("city", city);
        return builder.toString();
    }
}
