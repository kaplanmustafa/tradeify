package com.tradeify.tradeify_ws.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryService {
	
	@Autowired
	SubCategoryRepository subCategoryRepository;
	
	public List<SubCategory> getCategories(Long id) {
		
		return subCategoryRepository.findAllByGeneralCategoryIdOrderById(id);
	}	
	
	public List<SubCategory> getAllCategories() {
		
		return subCategoryRepository.findAllByOrderById();
	}	
}
