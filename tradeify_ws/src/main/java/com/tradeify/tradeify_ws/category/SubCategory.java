package com.tradeify.tradeify_ws.category;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tradeify.tradeify_ws.product.Product;
import com.tradeify.tradeify_ws.product.entities.BatteryPower;
import com.tradeify.tradeify_ws.product.entities.Brand;
import com.tradeify.tradeify_ws.product.entities.CameraResolution;
import com.tradeify.tradeify_ws.product.entities.CaseDiameter;
import com.tradeify.tradeify_ws.product.entities.Color;
import com.tradeify.tradeify_ws.product.entities.DisplayTechnology;
import com.tradeify.tradeify_ws.product.entities.FrontCameraResolution;
import com.tradeify.tradeify_ws.product.entities.GraphicsCard;
import com.tradeify.tradeify_ws.product.entities.InternalMemory;
import com.tradeify.tradeify_ws.product.entities.OperatingType;
import com.tradeify.tradeify_ws.product.entities.PanelType;
import com.tradeify.tradeify_ws.product.entities.ProcessorModel;
import com.tradeify.tradeify_ws.product.entities.ProcessorType;
import com.tradeify.tradeify_ws.product.entities.Ram;
import com.tradeify.tradeify_ws.product.entities.ScreenRefreshRate;
import com.tradeify.tradeify_ws.product.entities.ScreenResolution;
import com.tradeify.tradeify_ws.product.entities.ScreenSize;
import com.tradeify.tradeify_ws.product.entities.Ssd;
import com.tradeify.tradeify_ws.product.entities.WarrantyType;

import lombok.Data;

@Data 
@Entity
public class SubCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<Product> products;
	
	private long subPrivateId;
	
	@NotNull
	@Size(min = 1, max= 255)
	private String categoryName;
	
	@ManyToOne
	private GeneralCategory generalCategory;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<Brand> brands;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<Color> colors;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<OperatingType> operatingTypes;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<CaseDiameter> caseDiameters;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<WarrantyType> warrantyTypes;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<InternalMemory> internalMemories;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<BatteryPower> batteryPowers;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<ScreenSize> screenSizes;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<FrontCameraResolution> frontCameraResolutions;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<CameraResolution> cameraResolutions;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<DisplayTechnology> displayTechnologies;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<ScreenResolution> screenResolutions;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<ProcessorType> processorTypes;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<Ram> rams;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<GraphicsCard> graphicsCards;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<Ssd> ssd;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<ProcessorModel> processorModels;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<ScreenRefreshRate> screenRefreshRates;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.REMOVE)
	private List<PanelType> panelTypes;

	public SubCategory() {
		super();
	}

	public SubCategory(long id) {
		super();
		this.id = id;
	}
}
