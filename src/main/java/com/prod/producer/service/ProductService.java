package com.prod.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cou.consumer.model.Coupon;
import com.prod.producer.fiegn.client.CouponFeignclient;
import com.prod.producer.model.Product;
import com.prod.producer.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private CouponFeignclient cop;
	
	public Integer saveProduct(Product prod) {
		
		String str=prod.getCouponCode();
		System.out.println(str);
		Double tempCost=prod.getProdCost();
	if(str!=null) {
		Coupon coupon=cop.getCopByCode(str);
		System.out.println(coupon);
		if(coupon!=null) {
		Double dis=coupon.getDisAmt();
		prod.setFinalAmt(tempCost-(dis*tempCost)/100);
		Product product=productRepo.save(prod);
		return product.getProdId();
		}
		else {
			prod.setFinalAmt(prod.getProdCost());
			Product product=productRepo.save(prod);
			return product.getProdId();	
		}
	}
	else {
		prod.setFinalAmt(prod.getProdCost());
		Product product=productRepo.save(prod);
	return product.getProdId();	
		}
	}
}