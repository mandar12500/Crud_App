package com.crudapp.crud_app.service;

import com.crudapp.crud_app.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface VendorService {

    public String createVendor(Vendor vendor);
    public String updateVendor(Vendor vendor);
    public String deleteVendor(String vendorId);
    public Vendor getVendor(String vendorId);
    public List<Vendor> getAllVendors();
    public List<Vendor> getByVendorName(String vendorName);

}
