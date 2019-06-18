package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	private Integer prodId;
	private String prodCode;
	private String prodModel;
	private String prodVendor;
	private Double prodCost;
	public Product() {
		super();
	}
	public Product(String prodCode, String prodModel, String prodVendor, Double prodCost) {
		super();
		this.prodCode = prodCode;
		this.prodModel = prodModel;
		this.prodVendor = prodVendor;
		this.prodCost = prodCost;
	}
	public Product(Integer prodId, String prodCode, String prodModel, String prodVendor, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodModel = prodModel;
		this.prodVendor = prodVendor;
		this.prodCost = prodCost;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdModel() {
		return prodModel;
	}
	public void setProdModel(String prodModel) {
		this.prodModel = prodModel;
	}
	public String getProdVendor() {
		return prodVendor;
	}
	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodModel=" + prodModel + ", prodVendor="
				+ prodVendor + ", prodCost=" + prodCost + "]";
	}
	
	
	
	
}
