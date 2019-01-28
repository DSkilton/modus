package model;

public class tenancy {

    private int tenancyId;
    private int rentPropertyId;
    private int landlordId;
    private int tenantId;
    private int tenancyLength;
    private boolean isPeriodic;

    public tenancy(int tenancyId, int rentPropertyId, int landlordId, int tenantId, int tenancyLength, boolean isPeriodic) {
        this.tenancyId = tenancyId;
        this.rentPropertyId = rentPropertyId;
        this.landlordId = landlordId;
        this.tenantId = tenantId;
        this.tenancyLength = tenancyLength;
        this.isPeriodic = isPeriodic;
    }

    public int getTenancyId() {
        return tenancyId;
    }

    public void setTenancyId(int tenancyId) {
        this.tenancyId = tenancyId;
    }

    public int getRentPropertyId() {
        return rentPropertyId;
    }

    public void setRentPropertyId(int rentPropertyId) {
        this.rentPropertyId = rentPropertyId;
    }

    public int getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(int landlordId) {
        this.landlordId = landlordId;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public int getTenancyLength() {
        return tenancyLength;
    }

    public void setTenancyLength(int tenancyLength) {
        this.tenancyLength = tenancyLength;
    }

    public boolean isPeriodic() {
        return isPeriodic;
    }

    public void setPeriodic(boolean periodic) {
        isPeriodic = periodic;
    }
}
