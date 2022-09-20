package com.ForexServices.Service;

import com.ForexServices.Exception.CurrencyRateNotFoundException;
import com.ForexServices.entity.CurrencyRate;
import com.ForexServices.entity.CurrencyRateDTO;

public interface CurrencyRateService {
	public CurrencyRate insertCurrencyRate(CurrencyRate currencyRate) throws CurrencyRateNotFoundException;
    public CurrencyRate updateCurrencyRate(CurrencyRateDTO currencyRateDTO) throws CurrencyRateNotFoundException;
    public String deleteCurrencyRate(Integer CurrencyId) throws CurrencyRateNotFoundException;


}

