package sample;

import java.util.Date;

public class landlord extends person {

    private int landlordId;
    private int rentPropertyId;
    private String registeredAddA;
    private String registeredAddB;
    private String registeredTown;
    private String registeredCounty;
    private String registeredPostcode;
    private String registeredCountry;
    private boolean isOverseas;

    public landlord(int personId, String title, String firstName, String lastName, String addA, String addB, String town,
                    String postcode, String country, String homeNumber, String mobNumber, String status, Date registered,
                    Date lastContact, Date nextContact) {

        super(personId, title, firstName, lastName, addA, addB, town, postcode, country, homeNumber, mobNumber, status,
                registered, lastContact, nextContact);
    }

    public int getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(int landlordId) {
        this.landlordId = landlordId;
    }

    public int getRentPropertyId() {
        return rentPropertyId;
    }

    public void setRentPropertyId(int rentPropertyId) {
        this.rentPropertyId = rentPropertyId;
    }

    public String getRegisteredAddA() {
        return registeredAddA;
    }

    public void setRegisteredAddA(String registeredAddA) {
        this.registeredAddA = registeredAddA;
    }

    public String getRegisteredAddB() {
        return registeredAddB;
    }

    public void setRegisteredAddB(String registeredAddB) {
        this.registeredAddB = registeredAddB;
    }

    public String getRegisteredTown() {
        return registeredTown;
    }

    public void setRegisteredTown(String registeredTown) {
        this.registeredTown = registeredTown;
    }

    public String getRegisteredCounty() {
        return registeredCounty;
    }

    public void setRegisteredCounty(String registeredCounty) {
        this.registeredCounty = registeredCounty;
    }

    public String getRegisteredPostcode() {
        return registeredPostcode;
    }

    public void setRegisteredPostcode(String registeredPostcode) {
        this.registeredPostcode = registeredPostcode;
    }

    public String getRegisteredCountry() {
        return registeredCountry;
    }

    public void setRegisteredCountry(String registeredCountry) {
        this.registeredCountry = registeredCountry;
    }

    public boolean isOverseas() {
        return isOverseas;
    }

    public void setOverseas(boolean overseas) {
        isOverseas = overseas;
    }
}
