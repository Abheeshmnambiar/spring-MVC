package com.merchant.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.merchant.services.MerchantTokenServices;
import com.merchant.token.MerchantToken;

@RestController
public class MerchantTokenController {
	

	@Autowired
	MerchantTokenServices merchantTokenServices;

	@RequestMapping(value = "/template/tokens", method = RequestMethod.POST, produces = "application/json")
	public MerchantToken getMerchantToken() throws UnsupportedEncodingException {

		return merchantTokenServices.getMerchantTOken();

	}

}
