package com.merchant.repo;

import org.springframework.data.repository.CrudRepository;

import com.merchant.dbmodel.Locationn;

public interface LocationRepo extends CrudRepository<Locationn, Integer> {

}
