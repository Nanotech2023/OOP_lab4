package com.service;

import java.util.List;
import java.util.Optional;

import com.entity.Product;
import com.entity.Shop;

public interface ShopService {
  List<Product> possibleToBuyProductsOn(Shop shop, Integer amountOfMoney);

  // it's possible to make specific price for each product
  List<Product> deliverToShop(Shop shop, List<Product> products,
      Boolean newPrice);

  // and there's we can buy not only one, but many products
  Optional<Integer> buyProduct(Shop shop, Product product);

  Optional<Shop> whereToBuyAtProfit(List<Product> products);
}