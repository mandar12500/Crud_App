package com.crudapp.crud_app.repository;

import com.crudapp.crud_app.model.Vendor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class VendorRepositoryTest {

    @Autowired
    private VendorRepository vendorRepository;
    Vendor vendor;

    @BeforeEach
    void setUp() {
        vendor = new Vendor("1", "TestVendor", "TestLocation", "79218702173");
        vendorRepository.save(vendor);
    }

    @AfterEach
    void tearDown() {
        vendor = null;
        vendorRepository.deleteAll();
    }

    @Test
    void testFindByVendorName() {
        List<Vendor> vendorList = vendorRepository.findByVendorName("TestVendor");
        assertThat(vendorList.get(0).getVendorId()).isEqualTo(vendor.getVendorId());
        assertThat(vendorList.get(0).getVendorLocation()).isEqualTo(vendor.getVendorLocation());
    }

    @Test
    void testFindByVendorName_UnSuccessful() {
        List<Vendor> vendorList = vendorRepository.findByVendorName("TestVendor2");
        assertThat(vendorList.isEmpty()).isTrue();
//        assertThat(vendorList.isEmpty()).isFalse();
    }

}
