package com.tradeify.tradeify_ws.product.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tradeify.tradeify_ws.product.entities.Color;
import com.tradeify.tradeify_ws.product.services.ColorService;
import com.tradeify.tradeify_ws.product.vm.ProductAttributeVM;

@RestController
public class ColorController {

	@Autowired
	ColorService colorService;
	
	@GetMapping("/api/1.0/colors/{id}/{generalId}")
	List<ProductAttributeVM> getCategories(@PathVariable(name = "id") Long id, @PathVariable(name = "generalId") Long generalId) {
		List<ProductAttributeVM> attributeVM = new ArrayList<>();
		
		List<Color> colorList = colorService.getBrands(id, generalId);
		for(Color item: colorList) {
			attributeVM.add(new ProductAttributeVM(item.getId(), item.getColorName(), item.getGeneralCategory().getId(), 
					item.getSubCategory().getId()));
		}
		
		return attributeVM;
	}
}
	