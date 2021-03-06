package com.tradeify.tradeify_ws.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeify.tradeify_ws.product.entities.FrontCameraResolution;
import com.tradeify.tradeify_ws.product.repositories.FrontCameraResolutionRepository;

@Service
public class FrontCameraResolutionService {
	
	@Autowired
	FrontCameraResolutionRepository frontCameraResolutionRepository;
	
	public List<FrontCameraResolution> getFrontCameraResolutions(Long id, Long generalId) {
		
		return frontCameraResolutionRepository.findAllBySubCategoryIdAndGeneralCategoryIdOrderById(id, generalId);
	}	
	
	public FrontCameraResolution getFrontCameraResolutionByCategory(String general, String sub, String brand) {
		return frontCameraResolutionRepository.findBySubCategoryIdAndGeneralCategoryIdAndPrivateId(Long.valueOf(sub), 
				Long.valueOf(general), Long.valueOf(brand));
	}
	
	public FrontCameraResolution getById(Long id) {
		
		return frontCameraResolutionRepository.getOne(id);
	}
}
