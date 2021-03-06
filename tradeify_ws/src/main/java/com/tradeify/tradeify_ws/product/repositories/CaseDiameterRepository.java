package com.tradeify.tradeify_ws.product.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tradeify.tradeify_ws.product.entities.CaseDiameter;


public interface CaseDiameterRepository extends JpaRepository<CaseDiameter, Long>{

	List<CaseDiameter> findAllBySubCategoryIdAndGeneralCategoryIdOrderById(Long subCategoryId, Long generalCategoryId);
	
	List<CaseDiameter> findAllByOrderById();
	
	CaseDiameter findBySubCategoryIdAndGeneralCategoryIdAndPrivateId(Long subCategoryId, Long generalCategoryId, Long privateId);
}
