package com.shoppingmall.shopmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingmall.shopmanagement.entity.Shop;
import com.shoppingmall.shopmanagement.service.ShopService;

@RestController
@RequestMapping("/api/shops")

public class ShopController {
	private final ShopService shopService;
	public ShopController(ShopService shopService) {
		this.shopService = shopService;
		}
	// Add new shop
	@PostMapping 
	public Shop addShop(@RequestBody Shop shop) {
		return shopService.addShop(shop);
		} 
	// Get all shops
	@GetMapping
	public List<Shop> getAllShops() {
		return shopService.getAllShops(); 
		}
	// Get shop by ID
	@GetMapping("/{shopId}")
	public Optional<Shop> getShopById(@PathVariable Long shopId) {
		return shopService.getShopById(shopId);
		}
	// Update shop
	@PutMapping("/{shopId}")
	public Shop updateShop( @PathVariable Long shopId, @RequestBody Shop shop) {
		return shopService.updateShop(shopId, shop);
		}
	// Delete shop
	
     @DeleteMapping("/{shopId}")
    public String deleteShop(@PathVariable Long shopId) {
	shopService.deleteShop(shopId);
	return "Shop deleted successfully";
	}
	}

