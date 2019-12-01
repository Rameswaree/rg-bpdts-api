package com.bpdts.repository;

import com.bpdts.domain.Bpdts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface BpdtsDataRepository extends JpaRepository<Bpdts, Integer> {
    
    List<Bpdts> findBpdtsByCity(Optional<String> city);
}
