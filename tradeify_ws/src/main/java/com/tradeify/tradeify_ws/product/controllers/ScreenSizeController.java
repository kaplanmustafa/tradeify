package com.tradeify.tradeify_ws.product.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tradeify.tradeify_ws.product.entities.ScreenSize;
import com.tradeify.tradeify_ws.product.services.ScreenSizeService;
import com.tradeify.tradeify_ws.product.vm.ProductAttributeVM;

@RestController
public class ScreenSizeController {

	@Autowired
	ScreenSizeService screenSizeService;
	
	@GetMapping("/api/1.0/screenSizes/{id}/{generalId}")
	List<ProductAttributeVM> getCategories(@PathVariable(name = "id") Long id, @PathVariable(name = "generalId") Long generalId) {
		List<ProductAttributeVM> attributeVM = new ArrayList<>();
		
		List<ScreenSize> screenSizes = screenSizeService.getScreenSizes(id, generalId);
		for(ScreenSize size: screenSizes) {
			attributeVM.add(new ProductAttributeVM(size));
		}
		
		return attributeVM;
	}
}
	