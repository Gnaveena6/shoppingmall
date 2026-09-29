package com.shoppingmall.shopmanagement.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shopId;
	private String shopName;
	private String location;
	private String contactNumber;
	
	
	public Shop() {
		super();
	}
	public Shop(Long shopId, String shopName, String location, String contactNumber) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.location = location;
		this.contactNumber = contactNumber;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}