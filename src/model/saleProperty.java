package model;

import java.util.Date;

public class saleProperty extends property {

    private int salePropertyId;
    private int price;
    private String priceType; //asking price, guide price, offers in region of etc

    public saleProperty(int propertyId, String addA, String addB, String town, String county, String postcode,
                        String country, String homeStyle, String parking, int bed, Date registered, int salePropertyId,
                        int price, String priceType) {

        super(propertyId, addA, addB, town, county, postcode, country, homeStyle, parking, bed, registered);


    }

    public int getSalePropertyId() {
        return salePropertyId;
    }

    public void setSalePropertyId(int salePropertyId) {
        this.salePropertyId = salePropertyId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }
}
