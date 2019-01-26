package sample;

import java.util.Date;

public class tenant extends person {

    private int tenantId;
    private String tenantStatus;
    private String nextKin;
    private String nextKinNumber;
    private String nextKinAdd;
    private Date rentPeriodStart;
    private Date rentPeriodEnd;
    private double depositAmount;

    public tenant(int personId, String title, String firstName, String lastName, String addA, String addB, String town,
                  String postcode, String country, String homeNumber, String mobNumber, String status, Date registered,
                  Date lastContact, Date nextContact) {

        super(personId, title, firstName, lastName, addA, addB, town, postcode, country, homeNumber, mobNumber, status,
                registered, lastContact, nextContact);
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantStatus() {
        return tenantStatus;
    }

    public void setTenantStatus(String tenantStatus) {
        this.tenantStatus = tenantStatus;
    }

    public String getNextKin() {
        return nextKin;
    }

    public void setNextKin(String nextKin) {
        this.nextKin = nextKin;
    }

    public String getNextKinNumber() {
        return nextKinNumber;
    }

    public void setNextKinNumber(String nextKinNumber) {
        this.nextKinNumber = nextKinNumber;
    }

    public String getNextKinAdd() {
        return nextKinAdd;
    }

    public void setNextKinAdd(String nextKinAdd) {
        this.nextKinAdd = nextKinAdd;
    }

    public Date getRentPeriodStart() {
        return rentPeriodStart;
    }

    public void setRentPeriodStart(Date rentPeriodStart) {
        this.rentPeriodStart = rentPeriodStart;
    }

    public Date getRentPeriodEnd() {
        return rentPeriodEnd;
    }

    public void setRentPeriodEnd(Date rentPeriodEnd) {
        this.rentPeriodEnd = rentPeriodEnd;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
}
