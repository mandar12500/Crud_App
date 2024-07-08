//package repository;
package com.crudapp.crud_app.repository;

import com.crudapp.crud_app.model.Vendor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorRepository extends JpaRepository<Vendor, String> {
    List<Vendor> findByVendorName(String vendorName);
}