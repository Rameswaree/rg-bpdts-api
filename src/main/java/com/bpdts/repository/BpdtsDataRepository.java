package com.bpdts.repository;

import com.bpdts.domain.Bpdts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BpdtsDataRepository extends JpaRepository<Bpdts, Integer> {
    
    Bpdts findByCity(String city);
}
