package com.merchant.services;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.merchant.dbmodel.Category_1;
//import com.merchant.dbmodel.Category_2;

import com.merchant.dbmodel.Locationn;
import com.merchant.dbmodel.MatchDetails;
//import com.merchant.dbmodel.Mcc;
import com.merchant.dbmodel.Merchant;
import com.merchant.dbmodel.MerchantPrimary;
import com.merchant.repo.CategoryRepo;
import com.merchant.repo.LocationRepo;
import com.merchant.repo.MatchDetailsRepo;
import com.merchant.repo.MerchantPrimaryRepo;
import com.merchant.repo.MerchantRepo;
import com.merchant.requestModel.MerchantRequest;
import com.merchant.rsponseModel.MerchantMain;
import com.merchant.token.MerchantToken;

@Service
public class MerchantServices {

	@Autowired
	MerchantPrimaryRepo merchantPrimaryRepo;
	@Autowired
	MatchDetailsRepo matchDetailsRepo;
	@Autowired
	LocationRepo locationRepo;
	@Autowired
	MerchantRepo merchantRepo;
	@Autowired
	CategoryRepo categoryRepo;
	
//	@Autowired
//	MerchantMain merchantMain;

	@Autowired
	private MerchantTokenServices merchantTokenServices;

	public MerchantMain createMErchants(MerchantRequest merchantRqst) throws UnsupportedEncodingException {
		
		MerchantMain merchantMain = new MerchantMain();
		MerchantToken merchantToken = merchantTokenServices.getMerchantTOken();
		String BearerToken = merchantToken.getToken();

		RestTemplate restTemplate = new RestTemplate();

		String url = "https://dataservices-stage.segmint.net/merchant/v1/partners/87562756/merchant?parser=VISA";

		

		HttpHeaders headers = new HttpHeaders();
		// headers.add("Authorization", "Basic " + encodedKey);
		headers.add("Authorization", "Bearer " + BearerToken);
		headers.add("Content-Type", "application/json");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<MerchantRequest> entity = new HttpEntity<MerchantRequest>(merchantRqst, headers);
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(merchantRqst));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
		String responseEntity1 = responseEntity.getBody();
		System.out.println(responseEntity1);
		if (responseEntity != null) {
			
			
			 try {
				merchantMain=	mapper.readValue(responseEntity1, MerchantMain.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
			

			
			
			
			
		}

		return merchantMain;
	}
	

	public void createMerchantTAble(MerchantMain merchantMain) {
		
		MerchantPrimary merchant=new MerchantPrimary();
		merchant.setAcquirer_id(merchantMain.getAcquirerId());
		merchant.setMatch_type(merchantMain.getMatchType());
		merchant.setMatch_score(merchantMain.getMatchScore());
		MatchDetails matchDetails=new MatchDetails();
		
		Category_1 mcc=new Category_1();
		mcc.setClassification(merchantMain.getMatchDetail().getMcc().getClassification());
		mcc.setLogoUrl(merchantMain.getMatchDetail().getMcc().getLogoUrl());
		
		Category_1 c=new Category_1();
		c.setClassification(merchantMain.getMatchDetail().getCategory1().getClassification());
		if(merchantMain.getMatchDetail().getCategory1().getLogoUrl()!=null) {
			c.setLogoUrl(merchantMain.getMatchDetail().getCategory1().getLogoUrl().toString());
		}
		Category_1 c2=new Category_1();
		c2.setClassification(merchantMain.getMatchDetail().getCategory2().getClassification());

		if(merchantMain.getMatchDetail().getCategory2().getLogoUrl()!=null) {
        c2.setLogoUrl(merchantMain.getMatchDetail().getCategory2().getLogoUrl().toString());
		}	
		
		
		
		
		Locationn l=new Locationn();
		l.setCity(merchantMain.getMatchDetail().getMerchant().getLocation().getCity());
		l.setState(merchantMain.getMatchDetail().getMerchant().getLocation().getState());
		l.setCountry(merchantMain.getMatchDetail().getMerchant().getLocation().getCountry());
		if(merchantMain.getMatchDetail().getMerchant().getLocation().getZip()!=null) {
		l.setZip(merchantMain.getMatchDetail().getMerchant().getLocation().getZip().toString());
		}
		locationRepo.save(l);

		Merchant m=new Merchant();
		m.setClassification(merchantMain.getMatchDetail().getMerchant().getClassification());
		m.setLogoUrl(merchantMain.getMatchDetail().getMerchant().getLogoUrl());
	
        m.setLocation(l);
        merchantRepo.save(m);
    	
		matchDetails.setMcc(mcc);
		matchDetails.setCategory_1(c);
		matchDetails.setCategory_2(c2);
		matchDetails.setMerchant(m);
		
		
		
		categoryRepo.save(c);
		categoryRepo.save(c2);
		categoryRepo.save(mcc);
		
		matchDetailsRepo.save(matchDetails);
		
		
		//merchant.setMerchantId(merchantMain.getNetwork());
		merchant.setTrans_id(merchantMain.getTransId());
		merchant.setNetwork(merchantMain.getNetwork());
		
		
		merchantPrimaryRepo.save(merchant);
		
	}
}
