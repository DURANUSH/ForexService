package com.ForexServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ForexServices.Exception.CurrencyRateNotFoundException;
import com.ForexServices.Service.CurrencyRateService;
import com.ForexServices.entity.CurrencyRate;
import com.ForexServices.entity.CurrencyRateDTO;

@RestController
public class CurrencyRateController {
	@Autowired
	private CurrencyRateService currencyRateService;
	
	@PostMapping("currencyRate")
	public CurrencyRate insertCurrencyRate(@RequestBody CurrencyRateDTO currencyRateDTO) throws CurrencyRateNotFoundException {
		CurrencyRate currencyRate=new CurrencyRate(null,currencyRateDTO.getAmount(), currencyRateDTO.getDDLFrom(), currencyRateDTO.getPreExchange(), currencyRateDTO.getCurExchange(), currencyRateDTO.getDate(), currencyRateDTO.getDDLTo());
		return this.currencyRateService.insertCurrencyRate(currencyRate);
		
	}
	@PutMapping("currencyRate")
	public CurrencyRate updateCurrencyRate(@RequestBody CurrencyRateDTO currencyRateDTO) throws CurrencyRateNotFoundException{
		
		return this.currencyRateService.updateCurrencyRate(currencyRateDTO);
		
	}
	@DeleteMapping("currencyRate/{id}")
		public String deleteCurrencyRate(@PathVariable("id") Integer CurrencyId) throws CurrencyRateNotFoundException{
			return this.currencyRateService.deleteCurrencyRate(CurrencyId);
		
	}
    

}
