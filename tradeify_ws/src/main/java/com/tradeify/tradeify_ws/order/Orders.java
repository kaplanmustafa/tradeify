package com.tradeify.tradeify_ws.order;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.tradeify.tradeify_ws.cart.Cart;

import lombok.Data;

@Data
@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE)
	private List<Cart> carts;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;
	
	private String address;
	
	private int orderStatus;
}
