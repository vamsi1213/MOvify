package com.marolix.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marolix.springboot.dto.ReviewUsDto;
import com.marolix.springboot.service.ReviewUsServiceInterface;

@RestController
public class ReviewUsController {
	
	@Autowired
	private ReviewUsServiceInterface reviewUsServiceInterface;
	
	 @PostMapping("/savereview")
	public String saveReviewToArtist(@RequestBody ReviewUsDto reviewUsDto) {
		return reviewUsServiceInterface.createReviews(reviewUsDto);
		
	}
	
		 
	 @GetMapping("/get/reviewer/{reviewerId}")
	 public ReviewUsDto getReviewById(@PathVariable Integer reviewerId) 
	 {
		 return reviewUsServiceInterface.getByReviewId(reviewerId);
	 }
	 
	 @GetMapping("/get/artist/{artistId}")
	 public List<ReviewUsDto> getReviewByArtistId(@PathVariable Integer artistId) {
		 return reviewUsServiceInterface.getByArtistId(artistId);
	 }
	 
	 }


