package com.example.vendor_portal.repository;

import com.example.vendor_portal.entity.Integration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntegrationRepository extends JpaRepository<Integration, Long> {
}
