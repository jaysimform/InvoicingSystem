package com.simform.invoicingsystem.repository;

import com.simform.invoicingsystem.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RateRepository extends JpaRepository<Rate, Long> {
    Optional<Rate> findByStack(String stack);
}