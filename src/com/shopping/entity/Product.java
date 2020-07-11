package com.shopping.entity;

public class Product {
	public final String id;
	public final String description;
	public final String merchantId;
	public final double price;

	public Product(final String id, 
								 final String description, 
								 final String merchantId, 
								 final double price) {
		this.id = id;
		this.description = description;
		this.merchantId = merchantId;
		this.price = price;
	}
}
