package com.stockApp.companyDetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockApp.companyDetails.module.IPO;

@Repository
public interface IPORepo extends JpaRepository<IPO, String> {
	

}
