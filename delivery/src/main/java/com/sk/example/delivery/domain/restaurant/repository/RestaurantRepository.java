package com.sk.example.delivery.domain.restaurant.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.sk.example.delivery.domain.restaurant.model.Menu;
import com.sk.example.delivery.domain.restaurant.model.Restaurant;

@RepositoryRestResource
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long>, QueryDslPredicateExecutor<Restaurant>{
	
}
