package model;

import java.util.Date;

public abstract class property {

    private int propertyId;
    private String addA;
    private String addB;
    private String town;
    private String county;
    private String postcode;
    private String country;
    private String homeStyle;
    private String parking;
    private int bed;
    private Date registered;

    public property(int propertyId, String addA, String addB, String town, String county, String postcode, String country,
                    String homeStyle, String parking, int bed, Date registered) {

        this.propertyId = propertyId;
        this.addA = addA;
        this.addB = addB;
        this.town = town;
        this.county = county;
        this.postcode = postcode;
        this.country = country;
        this.homeStyle = homeStyle;
        this.parking = parking;
        this.bed = bed;
        this.registered = registered;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getAddA() {
        return addA;
    }

    public void setAddA(String addA) {
        this.addA = addA;
    }

    public String getAddB() {
        return addB;
    }

    public void setAddB(String addB) {
        this.addB = addB;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeStyle() {
        return homeStyle;
    }

    public void setHomeStyle(String homeStyle) {
        this.homeStyle = homeStyle;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }
}
