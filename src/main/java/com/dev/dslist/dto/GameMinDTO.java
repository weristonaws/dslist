package com.dev.dslist.dto;

import com.dev.dslist.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;	
	private Integer gameYear;
	private String imgUrl;
	private String shortDescription;

	
	public GameMinDTO() {
		
	}
	
	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		gameYear = entity.getGameYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getGameYear() {
		return gameYear;
	}

	public void setGameYear(Integer gameYear) {
		this.gameYear = gameYear;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
