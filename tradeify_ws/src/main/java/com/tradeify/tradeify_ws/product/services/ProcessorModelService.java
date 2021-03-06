package com.tradeify.tradeify_ws.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeify.tradeify_ws.product.entities.ProcessorModel;
import com.tradeify.tradeify_ws.product.repositories.ProcessorModelRepository;

@Service
public class ProcessorModelService {
	
	@Autowired
	ProcessorModelRepository processorModelRepository;
	
	public List<ProcessorModel> getProcessorModels(Long id, Long generalId) {
		
		return processorModelRepository.findAllBySubCategoryIdAndGeneralCategoryIdOrderById(id, generalId);
	}	
	
	public ProcessorModel getProcessorModelByCategory(String general, String sub, String brand) {
		return processorModelRepository.findBySubCategoryIdAndGeneralCategoryIdAndPrivateId(Long.valueOf(sub), 
				Long.valueOf(general), Long.valueOf(brand));
	}
	
	public ProcessorModel getById(Long id) {
		
		return processorModelRepository.getOne(id);
	}
}
