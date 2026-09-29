package com.shoppingmall.shopmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shoppingmall.shopmanagement.entity.Shop;
import com.shoppingmall.shopmanagement.repository.ShopRepository;

@Service
public class ShopService {
	private final ShopRepository shopRepository;

	public ShopService(ShopRepository shopRepository) {
		this.shopRepository = shopRepository;
	}
	// Add a new shop
	public Shop addShop(Shop shop){
		return shopRepository.save(shop);
		}
	// Get all shops 
	public List<Shop> getAllShops() {
		return shopRepository.findAll(); 
		} 
	// Get shop by ID
	public Optional<Shop> getShopById(Long shopId) {
		return shopRepository.findById(shopId);
		}
	// Update shop
	public Shop updateShop(Long shopId, Shop shop) {
		Shop existingShop = shopRepository.findById(shopId) .orElseThrow(() -> new RuntimeException("Shop not found"));
		existingShop.setShopName(shop.getShopName());
		existingShop.setLocation(shop.getLocation()); 
		existingShop.setContactNumber(shop.getContactNumber());
		return shopRepository.save(existingShop); 
		}
	// Delete shop
	public void deleteShop(Long shopId) { 
		shopRepository.deleteById(shopId);
	}

}
