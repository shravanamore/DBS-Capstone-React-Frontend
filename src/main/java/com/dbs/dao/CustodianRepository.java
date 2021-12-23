package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dbs.entity.Custodian;

@Repository
public interface CustodianRepository extends JpaRepository<Custodian, String>{
	
}

