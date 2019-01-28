package model;

import java.util.Date;

public class vendor extends person {

    private int vendorId;

    public vendor(int personId, String title, String firstName, String lastName, String addA, String addB, String town,
                  String postcode, String country, String homeNumber, String mobNumber, String status, Date registered,
                  Date lastContact, Date nextContact) {

        super(personId, title, firstName, lastName, addA, addB, town, postcode, country, homeNumber, mobNumber, status,
                registered, lastContact, nextContact);
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }
}
