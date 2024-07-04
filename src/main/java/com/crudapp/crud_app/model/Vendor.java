package com.crudapp.crud_app.model;

public class Vendor {
    private String vendorId;
    private String vendorName;
    private String vendorLocation;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorLocation() {
        return vendorLocation;
    }

    public void setVendorLocation(String vendorLocation) {
        this.vendorLocation = vendorLocation;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorId='" + vendorId + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", vendorLocation='" + vendorLocation + '\'' +
                ", vendorPhoneNumber='" + vendorPhoneNumber + '\'' +
                '}';
    }

    public Vendor(String vendorId, String vendorName, String vendorLocation, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorLocation = vendorLocation;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    private String vendorPhoneNumber;
}
