package sample;

import java.util.Date;

public class appLetting extends person{

    private int appLettingId;
    private int priceMin;
    private int priceMax;
    private int bed;
    private int adults;
    private int children;
    private boolean doSmoke;
    private boolean isHouseBen;
    private boolean isFurnished;
    private boolean havePets;
    private String homeStyle;
    private String registeringOffice;
    private String townAreas;
    private String additionalOffice;
    private String moveReason;
    private String notes;
    private Date moveBy;



    public appLetting(int personId, String title, String firstName, String lastName, String addA, String addB, String town,
                      String postcode, String country, String homeNumber, String mobNumber, String status, Date registered,
                      Date lastContact, Date nextContact) {

        super(personId, title, firstName, lastName, addA, addB, town, postcode, country, homeNumber, mobNumber, status,
                registered, lastContact, nextContact);
    }

    public int getAppLettingId() {
        return appLettingId;
    }

    public void setAppLettingId(int appLettingId) {
        this.appLettingId = appLettingId;
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

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public boolean isDoSmoke() {
        return doSmoke;
    }

    public void setDoSmoke(boolean doSmoke) {
        this.doSmoke = doSmoke;
    }

    public boolean isHouseBen() {
        return isHouseBen;
    }

    public void setHouseBen(boolean houseBen) {
        isHouseBen = houseBen;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHavePets() {
        return havePets;
    }

    public void setHavePets(boolean havePets) {
        this.havePets = havePets;
    }

    public String getHomeStyle() {
        return homeStyle;
    }

    public void setHomeStyle(String homeStyle) {
        this.homeStyle = homeStyle;
    }

    public String getRegisteringOffice() {
        return registeringOffice;
    }

    public void setRegisteringOffice(String registeringOffice) {
        this.registeringOffice = registeringOffice;
    }

    public String getTownAreas() {
        return townAreas;
    }

    public void setTownAreas(String townAreas) {
        this.townAreas = townAreas;
    }

    public String getAdditionalOffice() {
        return additionalOffice;
    }

    public void setAdditionalOffice(String additionalOffice) {
        this.additionalOffice = additionalOffice;
    }

    public String getMoveReason() {
        return moveReason;
    }

    public void setMoveReason(String moveReason) {
        this.moveReason = moveReason;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getMoveBy() {
        return moveBy;
    }

    public void setMoveBy(Date moveBy) {
        this.moveBy = moveBy;
    }
}
