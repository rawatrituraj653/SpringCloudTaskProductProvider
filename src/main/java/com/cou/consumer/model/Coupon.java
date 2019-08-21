package com.cou.consumer.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
	
	private Integer cid;
	private String code;
	private  Double disAmt;
	private String expDate; 
}


