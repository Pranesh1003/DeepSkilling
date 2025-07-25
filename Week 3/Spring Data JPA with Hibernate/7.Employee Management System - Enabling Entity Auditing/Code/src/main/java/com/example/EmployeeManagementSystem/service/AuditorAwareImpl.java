package com.example.EmployeeManagementSystem.service;

import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // Return hardcoded user or extract from SecurityContext if using Spring Security
        return Optional.of("admin");
    }
}
