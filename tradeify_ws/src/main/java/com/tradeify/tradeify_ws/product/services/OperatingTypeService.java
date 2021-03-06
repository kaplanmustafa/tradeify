package com.tradeify.tradeify_ws.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeify.tradeify_ws.product.entities.OperatingType;
import com.tradeify.tradeify_ws.product.repositories.OperatingTypeRepository;

@Service
public class OperatingTypeService {
	
	@Autowired
	OperatingTypeRepository operatingTypeRepository;
	
	public List<OperatingType> getOperatingTypes(Long id, Long generalId) {
		
		return operatingTypeRepository.findAllBySubCategoryIdAndGeneralCategoryIdOrderById(id, generalId);
	}	
	
	public OperatingType getOperatingTypeByCategory(String general, String sub, String brand) {
		return operatingTypeRepository.findBySubCategoryIdAndGeneralCategoryIdAndPrivateId(Long.valueOf(sub), 
				Long.valueOf(general), Long.valueOf(brand));
	}
	
	public OperatingType getById(Long id) {
		
		return operatingTypeRepository.getOne(id);
	}
}
