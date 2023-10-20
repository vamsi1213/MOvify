package com.marolix.springboot.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ReviewUs {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer reviewId;
private Float  rating;
private String comment;
private String reviewedBy;
 
	@CreationTimestamp
	private Date dateTime;
	
	@JoinColumn(name="artistId")
	
	@ManyToOne(cascade=CascadeType.ALL)
	private ArtistRegistration artistId;
	

	public ArtistRegistration getArtistId() {
		return artistId;
	}

	public void setArtistId(ArtistRegistration artistId) {
		this.artistId = artistId;
	}

	public ReviewUs() {
		
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getReviewedBy() {
		return reviewedBy;
	}

	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

//	@Override
//	public String toString() {
//		return "ReviewUs [reviewId=" + reviewId + ", rating=" + rating + ", comment=" + comment + ", reviewedBy="
//				+ reviewedBy + ", dateTime=" + dateTime + ", artistRegistration=" + artistRegistration + "]";
//	}

	
	
		
	}

