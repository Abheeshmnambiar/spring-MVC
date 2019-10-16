package com.merchant.controller;

import java.io.UnsupportedEncodingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.merchant.dbmodel.MerchantPrimary;
import com.merchant.requestModel.MerchantRequest;
import com.merchant.rsponseModel.MerchantMain;
import com.merchant.services.MerchantServices;

@RestController
public class MerchantController {

	
	 // @Autowired MerchantMain merchantMain1;
	 
	
	@Autowired
	MerchantServices merchantServices;

	@RequestMapping(value = "/template/merchantRequests", method = RequestMethod.POST, produces = "application/json")
	public MerchantMain createMerchants(@RequestBody MerchantRequest merchantRequest)
			throws UnsupportedEncodingException {
		MerchantMain merchantMain=new MerchantMain();
		merchantMain= merchantServices.createMErchants(merchantRequest);
		createMerchantTable(merchantMain);
    return merchantMain;
	}

	//@RequestMapping(value="/template/merchantUpdate",method = RequestMethod.POST)
	public void createMerchantTable(MerchantMain merchantMain1) {
		
		
		merchantServices.createMerchantTAble(merchantMain1);
		
	}
}