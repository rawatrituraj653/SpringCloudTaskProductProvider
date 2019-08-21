package com.prod.producer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "prod_tab")
@Data
public class Product {

	@Id
	@GeneratedValue
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	private String couponCode;
	private Double finalAmt;
}
