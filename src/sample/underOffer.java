package sample;

public class underOffer {

    private int underOfferId;
    private int purchaserId;
    private int vendorId;

    public underOffer(int underOfferId, int purchaserId, int vendorId) {
        this.underOfferId = underOfferId;
        this.purchaserId = purchaserId;
        this.vendorId = vendorId;
    }

    public int getUnderOfferId() {
        return underOfferId;
    }

    public void setUnderOfferId(int underOfferId) {
        this.underOfferId = underOfferId;
    }

    public int getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(int purchaserId) {
        this.purchaserId = purchaserId;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }
}
