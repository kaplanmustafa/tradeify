package com.tradeify.tradeify_ws.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeify.tradeify_ws.product.entities.InternalMemory;
import com.tradeify.tradeify_ws.product.repositories.InternalMemoryRepository;

@Service
public class InternalMemoryService {
	
	@Autowired
	InternalMemoryRepository internalMemoryRepository;
	
	public List<InternalMemory> getInternalMemories(Long id, Long generalId) {
		
		return internalMemoryRepository.findAllBySubCategoryIdAndGeneralCategoryIdOrderById(id, generalId);
	}	
	
	public InternalMemory getInternalMemoryByCategory(String general, String sub, String brand) {
		return internalMemoryRepository.findBySubCategoryIdAndGeneralCategoryIdAndPrivateId(Long.valueOf(sub), 
				Long.valueOf(general), Long.valueOf(brand));
	}
	
	public InternalMemory getById(Long id) {
		
		return internalMemoryRepository.getOne(id);
	}
}
