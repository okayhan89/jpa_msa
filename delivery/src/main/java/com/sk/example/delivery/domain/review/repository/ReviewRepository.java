package com.sk.example.delivery.domain.review.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.example.delivery.domain.review.model.Review;


@RepositoryRestResource
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long>, QueryDslPredicateExecutor<Review>{
	
}
