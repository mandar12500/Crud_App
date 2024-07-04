package com.crudapp.crud_app.controller;

import com.crudapp.crud_app.model.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorAPIs {

    Vendor vendor;

    @GetMapping("/{vendorId}")
    public Vendor getVendorDetails(String vendorId) {
//        return "Mandar";
//        return new Vendor("V1", "Vishal", "Pune", "9897856789");
//        return new Vendor(vendorId, vendorId, "Pune", "9897856789");
        return vendor;
    }

    @PostMapping
    public String createNewVendor(@RequestBody Vendor vendor) {
        this.vendor = vendor;
        return "New Vendor created Successfully";
    }

}
