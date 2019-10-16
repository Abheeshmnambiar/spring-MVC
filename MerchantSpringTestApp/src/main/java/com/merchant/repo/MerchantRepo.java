package com.merchant.repo;

import org.springframework.data.repository.CrudRepository;

import com.merchant.dbmodel.Merchant;

public interface MerchantRepo extends CrudRepository<Merchant, Integer> {

}
