package com.marolix.springboot.service;

import java.util.List;

import com.marolix.springboot.dto.ReviewUsDto;

public interface ReviewUsServiceInterface {
     
	public String createReviews(ReviewUsDto reviewUsDto);
	
	public ReviewUsDto getByReviewId(Integer id);

	public List<ReviewUsDto> getByArtistId(Integer artistId);	
}
