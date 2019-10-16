package com.merchant.repo;

import org.springframework.data.repository.CrudRepository;

import com.merchant.dbmodel.MerchantPrimary;

public interface MerchantPrimaryRepo extends CrudRepository<MerchantPrimary, Integer> {
	
	

}
