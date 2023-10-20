package com.marolix.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marolix.springboot.entity.ReviewUs;

@Repository
public interface ReviewUsRepo extends JpaRepository<ReviewUs, Integer> {
	
	public ReviewUs findByReviewId(Integer reviewId);

	@Query(value="select r from ReviewUs r where r.artistId.artistId = :artistId")
	public List<ReviewUs> findByArtistId(@Param(value="artistId") Integer artistId);

}
