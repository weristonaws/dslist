package com.dev.dslist.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dslist.dto.GameListDTO;
import com.dev.dslist.dto.GameMinPositionDTO;
import com.dev.dslist.dto.ReplacementDTO;
import com.dev.dslist.services.GameListService;
import com.dev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListControler {
	
	@Autowired 
	private GameListService gameListService;
	
	@Autowired 
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	
	@GetMapping(value= "/{listId}/games")
	public List<GameMinPositionDTO> findBylist(@PathVariable Long listId){
		
		List<GameMinPositionDTO> result = gameService.findByList(listId);
		return result;
		
	}
	
	@PostMapping(value= "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
		
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
		
	}
	
	
 
}
