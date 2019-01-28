package model;

import java.util.Date;

public abstract class person {
    private int personId;
    private String title;
    private String firstName;
    private String lastName;
    private String addA;
    private String addB;
    private String town;
    private String postcode;
    private String country;
    private String homeNumber;
    private String mobNumber;
    private String status;
    private Date registered;
    private Date lastContact;
    private Date nextContact;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public Date getLastContact() {
        return lastContact;
    }

    public void setLastContact(Date lastContact) {
        this.lastContact = lastContact;
    }

    public Date getNextContact() {
        return nextContact;
    }

    public void setNextContact(Date nextContact) {
        this.nextContact = nextContact;
    }

    public person(int personId, String title, String firstName, String lastName, String addA, String addB, String town,
                  String postcode, String country, String homeNumber, String mobNumber, String status, Date registered,
                  Date lastContact, Date nextContact) {
        this.personId = personId;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addA = addA;
        this.addB = addB;
        this.town = town;
        this.postcode = postcode;
        this.country = country;
        this.homeNumber = homeNumber;
        this.mobNumber = mobNumber;
        this.status = status;
        this.registered = registered;
        this.lastContact = lastContact;
        this.nextContact = nextContact;
    }
}
