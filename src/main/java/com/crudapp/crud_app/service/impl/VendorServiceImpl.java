package com.crudapp.crud_app.service.impl;

import com.crudapp.crud_app.exceptions.VendorNotFoundException;
import com.crudapp.crud_app.model.Vendor;
import com.crudapp.crud_app.service.VendorService;
import org.springframework.stereotype.Service;
import com.crudapp.crud_app.repository.VendorRepository;

import java.util.List;


@Service
public class VendorServiceImpl implements VendorService {

//    @Autowired
    private final VendorRepository vendorRepository;

    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public String createVendor(Vendor vendor) {
        vendorRepository.save(vendor);
        return "Successful";
    }

    @Override
    public String updateVendor(Vendor vendor) {
        vendorRepository.save(vendor);
        return "Successful";
    }

    @Override
    public String deleteVendor(String vendorId) {
        vendorRepository.deleteById(vendorId);
        return "";
    }

    @Override
    public Vendor getVendor(String vendorId) {

        if (vendorRepository.findById(vendorId).isEmpty())
            throw new VendorNotFoundException("The Vendor you are looking for does not exist");

        return vendorRepository.findById(vendorId).get();
//        vendorRepository.findB
//        return "Successful";
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    @Override
    public List<Vendor> getByVendorName(String vendorName) {
        return vendorRepository.findByVendorName(vendorName);
    }
}
