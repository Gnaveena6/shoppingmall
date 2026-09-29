package com.shoppingmall.shopmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingmall.shopmanagement.entity.Shop;

public interface ShopRepository extends JpaRepository<Shop,Long> {

}
