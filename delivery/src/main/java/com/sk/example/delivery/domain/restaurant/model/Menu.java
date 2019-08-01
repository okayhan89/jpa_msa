package com.sk.example.delivery.domain.restaurant.model;

import javax.persistence.Entity;

import com.sk.example.delivery.domain.base.AbstractEntity;

import lombok.Data;

@Data
@Entity
public class Menu extends AbstractEntity {
	private String name;
	private Long price;
	private String pictureUrl;
	private String note;
	private MenuType menuType;
}
