package com.dev.dslist.dto;

import com.dev.dslist.projections.GameMinProjection;

public class GameMinPositionDTO {
	
	private Long id;
	private String title;	
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	private Integer position;
	
	public GameMinPositionDTO() {
		
	}
	
	public GameMinPositionDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
		position = projection.getPosition();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}
	
	


}