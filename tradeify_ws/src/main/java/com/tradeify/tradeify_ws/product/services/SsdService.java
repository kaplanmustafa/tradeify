package com.tradeify.tradeify_ws.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeify.tradeify_ws.product.entities.Ssd;
import com.tradeify.tradeify_ws.product.repositories.SsdRepository;

@Service
public class SsdService {
	
	@Autowired
	SsdRepository ssdRepository;
	
	public List<Ssd> getSsd(Long id, Long generalId) {
		
		return ssdRepository.findAllBySubCategoryIdAndGeneralCategoryIdOrderById(id, generalId);
	}		
}