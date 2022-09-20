package com.ForexServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ForexServices.entity.CurrencyRate;

public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Integer> {

}
