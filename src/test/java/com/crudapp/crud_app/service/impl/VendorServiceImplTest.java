package com.crudapp.crud_app.service.impl;

import com.crudapp.crud_app.model.Vendor;
import com.crudapp.crud_app.repository.VendorRepository;
import com.crudapp.crud_app.repository.VendorRepositoryTest;
import com.crudapp.crud_app.service.VendorService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoSettings;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class VendorServiceImplTest {

    @Mock
    private VendorRepository vendorRepository;
    private VendorService vendorService;
    AutoCloseable autoCloseable;
    Vendor vendor;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        vendorService = new VendorServiceImpl(vendorRepository);
        vendor = new Vendor("1", "TestVendor", "TestLocation", "79218702173");
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void testCreateVendor() {
        mock(Vendor.class, Mockito.CALLS_REAL_METHODS);
        mock(VendorRepository.class);

        when(vendorRepository.save(vendor)).thenReturn(vendor);
        assertThat(vendorService.createVendor(vendor)).isEqualTo("Successful");
    }

    @Test
    void testUpdateVendor() {
        mock(Vendor.class);
        mock(VendorRepository.class);

        when(vendorRepository.save(vendor)).thenReturn(vendor);
        assertThat(vendorService.updateVendor(vendor)).isEqualTo("Successful");
    }

    @Test
    void deleteVendor() {
    }

    @Test
    void testGetVendor() {
        mock(Vendor.class);
        mock(VendorRepository.class);

        when(vendorRepository.findById("1")).thenReturn(Optional.ofNullable(vendor));
        assertThat(vendorService.getVendor("1").getVendorName()).isEqualTo(vendor.getVendorName());
    }

    @Test
    void getAllVendors() {
    }

    @Test
    void getByVendorName() {
    }
}