package com.hwealth.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Embeddable
public class Price {
	private float mrp;
	private float final_price;
	private int discount_perc;
}

