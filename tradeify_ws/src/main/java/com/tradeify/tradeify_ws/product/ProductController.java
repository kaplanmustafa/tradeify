package com.tradeify.tradeify_ws.product;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tradeify.tradeify_ws.product.services.BrandService;
import com.tradeify.tradeify_ws.product.vm.ProductCoverVM;
import com.tradeify.tradeify_ws.product.vm.ProductSubmitVM;
import com.tradeify.tradeify_ws.shared.GenericResponse;

@RestController
@RequestMapping("/api/1.0")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@Autowired 
	BrandService brandService;
	
	@PostMapping("/products")
	GenericResponse saveProduct(@Valid @RequestBody ProductSubmitVM product) {
		productService.save(product);
		return new GenericResponse("Product saved");
	}
	
	@GetMapping("/products/{generalId}/{subId}")
	Page<ProductCoverVM> getProductsByCategory(@PathVariable String generalId, @PathVariable String subId, 
			@PageableDefault(sort = "id", direction = Direction.DESC) Pageable page) {
		return productService.getProductsByCategory(generalId, subId, page).map(ProductCoverVM::new);
	}
}