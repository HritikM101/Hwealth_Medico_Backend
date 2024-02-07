package com.hwealth.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Embeddable
public class Manufacturer {
	private String manufacturerName;
	private String url;
}
