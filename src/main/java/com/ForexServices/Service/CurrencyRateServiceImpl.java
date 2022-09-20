package com.ForexServices.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ForexServices.Exception.CurrencyRateNotFoundException;
import com.ForexServices.Repository.CurrencyRateRepository;
import com.ForexServices.entity.CurrencyRate;
import com.ForexServices.entity.CurrencyRateDTO;
@Service
public class CurrencyRateServiceImpl implements CurrencyRateService{
   @Autowired
   
   private CurrencyRateRepository CurrencyRateRepo;
	@Override
	public CurrencyRate insertCurrencyRate(CurrencyRate currencyRate) throws CurrencyRateNotFoundException {
		return this.CurrencyRateRepo.save(currencyRate);
	}
	@Override
	public CurrencyRate updateCurrencyRate(CurrencyRateDTO currencyRateDTO) throws CurrencyRateNotFoundException {
		Optional<CurrencyRate> currencyRateOpt=this.CurrencyRateRepo.findById(currencyRateDTO.getCurrencyId());
		if(currencyRateOpt.isEmpty())
			throw new CurrencyRateNotFoundException("Currency amount does not exists to update");
		CurrencyRate updateCurrencyRate=currencyRateOpt.get();
		updateCurrencyRate.setAmount(currencyRateDTO.getAmount());
		updateCurrencyRate.setCurExchange(currencyRateDTO.getCurExchange());
		updateCurrencyRate.setPreExchange(currencyRateDTO.getPreExchange());
		updateCurrencyRate.setDate(currencyRateDTO.getDate());
		updateCurrencyRate.setDDLFrom(currencyRateDTO.getDDLFrom());
		updateCurrencyRate.setDDLTo(currencyRateDTO.getDDLTo());
		return this.CurrencyRateRepo.save(updateCurrencyRate);
	}
	@Override
	public String deleteCurrencyRate(Integer CurrencyId) throws CurrencyRateNotFoundException {
		Optional<CurrencyRate> currencyRateOpt=this.CurrencyRateRepo.findById(CurrencyId);
		if(currencyRateOpt.isEmpty())
			throw new CurrencyRateNotFoundException("currencyRate amount does not exists to delete");
		this.CurrencyRateRepo.deleteById(CurrencyId);
		return "CurrencyId deleted successfully";
	}
	

}
