package model;

import java.util.Date;

public class appPurchaser {

    private int appPurchaserid;
    private int priceMin;
    private int priceMax;
    private int beds;
    private String homeStyle;
    private String OwnPropertyStatus;
    private String purchasetype;
    private String parking;
    private boolean isFirstTimeBuyer;
    private boolean isFinanciallyQualified;
    private Date moveBy;

    public int getAppPurchaserid() {
        return appPurchaserid;
    }

    public void setAppPurchaserid(int appPurchaserid) {
        this.appPurchaserid = appPurchaserid;
    }

    public int getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(int priceMin) {
        this.priceMin = priceMin;
    }

    public int getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(int priceMax) {
        this.priceMax = priceMax;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public String getHomeStyle() {
        return homeStyle;
    }

    public void setHomeStyle(String homeStyle) {
        this.homeStyle = homeStyle;
    }

    public String getOwnPropertyStatus() {
        return OwnPropertyStatus;
    }

    public void setOwnPropertyStatus(String ownPropertyStatus) {
        OwnPropertyStatus = ownPropertyStatus;
    }

    public String getPurchasetype() {
        return purchasetype;
    }

    public void setPurchasetype(String purchasetype) {
        this.purchasetype = purchasetype;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public boolean isFirstTimeBuyer() {
        return isFirstTimeBuyer;
    }

    public void setFirstTimeBuyer(boolean firstTimeBuyer) {
        isFirstTimeBuyer = firstTimeBuyer;
    }

    public boolean isFinanciallyQualified() {
        return isFinanciallyQualified;
    }

    public void setFinanciallyQualified(boolean financiallyQualified) {
        isFinanciallyQualified = financiallyQualified;
    }

    public Date getMoveBy() {
        return moveBy;
    }

    public void setMoveBy(Date moveBy) {
        this.moveBy = moveBy;
    }
}
