package com.merchant.services;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.merchant.configuration.MerchantConfiguration;
import com.merchant.token.MerchantToken;

@Service
public class MerchantTokenServices {

	@Autowired
	MerchantConfiguration merchantConfiguration;

	public MerchantToken getMerchantTOken() throws UnsupportedEncodingException {

		MerchantToken merchantToken = null;

		String url = "https://dataservices-stage.segmint.net/auth/v1/token";

		StringBuilder key = new StringBuilder();
		key.append(merchantConfiguration.getHeader().getApplicationAccessKey()).append(":")
				.append(merchantConfiguration.getHeader().getApplicationSecretKey());
		String encodedKey = Base64.getEncoder().encodeToString((key.toString()).getBytes("UTF-8"));

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + encodedKey);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<MerchantToken> entity = new HttpEntity<MerchantToken>(headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

		String responseEntity1 = responseEntity.getBody();

		if (responseEntity != null) {

			merchantToken = new MerchantToken();

			Gson g = new Gson();
			merchantToken = g.fromJson(responseEntity1, MerchantToken.class);

			System.out.println(merchantToken.getToken());

		}

		return merchantToken;

	}

}
