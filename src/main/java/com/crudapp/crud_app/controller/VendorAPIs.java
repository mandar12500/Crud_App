package com.crudapp.crud_app.controller;

import com.crudapp.crud_app.model.Vendor;
import com.crudapp.crud_app.service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorAPIs {

//    Vendor vendor;

    VendorService vendorService;

    public VendorAPIs(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("/{vendorId}")
    public Vendor getVendorDetails(@PathVariable("vendorId") String vendorId) {
//        return "Mandar";
        System.out.println("Querying DB for Vendor Details");
//        return new Vendor("V1", "Vishal", "Pune", "9897856789");
//        return new Vendor(vendorId, vendorId, "Pune", "9897856789");
        return vendorService.getVendor(vendorId);
//        return vendor;
    }

    @GetMapping
    public List<Vendor> getAllVendors() {
        System.out.println("Sending all Vendors");
        return vendorService.getAllVendors();
    }

    @PostMapping
    public String createNewVendor(@RequestBody Vendor vendor) {
        vendorService.createVendor(vendor);
        return "New Vendor created Successfully";
    }

    @PutMapping
    public String updateVendor(@RequestBody Vendor vendor) {
        vendorService.updateVendor(vendor);
        return "Vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") String vendorId) {
        vendorService.deleteVendor(vendorId);
        return "Vendor deleted successfully";
    }

}
