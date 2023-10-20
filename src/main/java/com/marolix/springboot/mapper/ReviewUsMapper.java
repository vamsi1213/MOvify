package com.marolix.springboot.mapper;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.marolix.springboot.dto.ReviewUsDto;
import com.marolix.springboot.entity.ReviewUs;

@Component
public class ReviewUsMapper {
	
	ModelMapper modelMapper = new ModelMapper();	
	
	public ReviewUsDto toDto(ReviewUs entity)
	{
		ReviewUsDto dto = modelMapper.map(entity, ReviewUsDto.class);
		return dto;
	}
	
	public List<ReviewUsDto> toDto(List<ReviewUs> entityList)
	{
		List<ReviewUsDto> dtoList = new ArrayList<>();
				//Arrays.asList(new ReviewUsDto[entityList.size()]);
		
		for(ReviewUs entity : entityList){
			dtoList.add(toDto(entity));
		}
		return dtoList;
	}

}
