package com.prod.producer.fiegn.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cou.consumer.model.Coupon;

@FeignClient("COUPON-APP")
public interface CouponFeignclient {

	@PostMapping("/cop/getBycode")
	public Coupon getCopByCode(@RequestParam("code") String code);
}
