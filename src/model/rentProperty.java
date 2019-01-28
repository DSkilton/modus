package model;

import java.util.Date;

public class rentProperty extends property {

    private int rentPropertyId;
    private int rentHi;
    private int rentLow;
    private boolean isFurnished;
    private boolean letBefore;
    private boolean currentlyOTM; //OTM = on the market
    private String reasonToRent;

    public rentProperty(int propertyId, String addA, String addB, String town, String county, String postcode,
                        String country, String homeStyle, String parking, int bed, Date registered) {

        super(propertyId, addA, addB, town, county, postcode, country, homeStyle, parking, bed, registered);
    }

    public int getRentPropertyId() {
        return rentPropertyId;
    }

    public void setRentPropertyId(int rentPropertyId) {
        this.rentPropertyId = rentPropertyId;
    }

    public int getRentHi() {
        return rentHi;
    }

    public void setRentHi(int rentHi) {
        this.rentHi = rentHi;
    }

    public int getRentLow() {
        return rentLow;
    }

    public void setRentLow(int rentLow) {
        this.rentLow = rentLow;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isLetBefore() {
        return letBefore;
    }

    public void setLetBefore(boolean letBefore) {
        this.letBefore = letBefore;
    }

    public boolean isCurrentlyOTM() {
        return currentlyOTM;
    }

    public void setCurrentlyOTM(boolean currentlyOTM) {
        this.currentlyOTM = currentlyOTM;
    }

    public String getReasonToRent() {
        return reasonToRent;
    }

    public void setReasonToRent(String reasonToRent) {
        this.reasonToRent = reasonToRent;
    }
}
