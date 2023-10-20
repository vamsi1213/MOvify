package com.marolix.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marolix.springboot.dto.ReviewUsDto;
import com.marolix.springboot.entity.ArtistRegistration;
import com.marolix.springboot.entity.ReviewUs;
import com.marolix.springboot.mapper.ReviewUsMapper;
import com.marolix.springboot.repository.ArtistRegistrationRepo;
import com.marolix.springboot.repository.ReviewUsRepo;
@Service
public class ReviewUsServiceInterfaceImpl implements ReviewUsServiceInterface {

	@Autowired
	private ReviewUsRepo reviewUsRepo;

	@Autowired
	private ArtistRegistrationRepo artistRegistrationRepo;
	
	@Autowired
    private ReviewUsMapper reviewUsMapper; 

	@Override
	public String createReviews(ReviewUsDto reviewUsDto) {
		// Retrieve Artist from database (assuming you have the artist's ID)
		// Artist artist =
		// artistRepository.findById(reviewerDTO.getArtist().getId()).orElse(null);
		// if (artist == null) {
		// return ResponseEntity.notFound().build();
//	    }
//	    reviewer.setArtist(artist);

		// Retrieve Artist from database (assuming you have the artist's ID)

		ArtistRegistration artist = artistRegistrationRepo.findById(reviewUsDto.getArtistId()).get();
		if (artist == null) {
			return "Artist Not found";
		}

		ReviewUs reviews = new ReviewUs();
		reviews.setRating(reviewUsDto.getRating());
		reviews.setComment(reviewUsDto.getComment());
		reviews.setReviewedBy(reviewUsDto.getReviewedBy());
		reviews.setDateTime(reviewUsDto.getDateTime());
		reviews.setArtistId(artist);
		reviewUsRepo.save(reviews);
		return "review saved succesfull";
	}

	public ReviewUsDto getByReviewId(Integer reviewerId) {
		
		return	reviewUsMapper.toDto( reviewUsRepo.findByReviewId(reviewerId)) ;
		 
	}

		public List<ReviewUsDto> getByArtistId(Integer artistId) {
		return reviewUsMapper.toDto(reviewUsRepo.findByArtistId(artistId));
		
	}
}		
