package com.dev.dslist.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dslist.dto.GameListDTO;
import com.dev.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListControler {
	
	@Autowired 
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
 
}
