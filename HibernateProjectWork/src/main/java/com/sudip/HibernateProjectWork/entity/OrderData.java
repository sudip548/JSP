package com.sudip.HibernateProjectWork.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_data")
public class OrderData implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="productName",nullable=false,unique=true)
	private String productName;
	@Column(nullable= false)
    private Integer quantity;
    @Column(name="productType",nullable= false)
    private String productType;
    
    
	public OrderData() {
		
	}
	public OrderData(Integer id, String productName, Integer quantity, String productType) {
		super();
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "OrderData [id=" + id + ", productName=" + productName + ", quantity=" + quantity + ", productType="
				+ productType + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
    
}
