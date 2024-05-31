package com.mitrahsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitrahsoft.entity.Player;
import com.mitrahsoft.service.PlayerService;

@RestController
@RequestMapping("/ipl")
public class PlayerController {
	
	@Autowired
	PlayerService playerservice;
	
	
	@GetMapping("/display")
	public List<Player> getAllPlayers()
	{
		return playerservice.getAllPlayers();
	}
	@PostMapping("/createplayer")
	public Player createPlayer(@RequestBody Player ply)
	{
		return playerservice.createPlayer(ply);
	}
	
	@GetMapping("/searchplayer/{pno}")
	public Player searchPlayer(@PathVariable int pno)
	{
		return playerservice.searchPlayer(pno);
	}
	
	@PutMapping("/updateplayer/{pno}")
	public Player updatePlayer(@PathVariable int pno,@RequestBody Player updateplayer) {
		return playerservice.updatePlayerById(pno, updateplayer);
	}
	
	@DeleteMapping("/deleteplayer/{pno}")
	public Player deletePlayer(@PathVariable int pno)
	{
		return playerservice.deletePlayer(pno);
	}
}
