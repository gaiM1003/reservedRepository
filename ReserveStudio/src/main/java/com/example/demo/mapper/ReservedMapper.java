package com.example.demo.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Studio;

@Repository
@Mapper
public interface ReservedMapper {
	public Studio view(long id);
}