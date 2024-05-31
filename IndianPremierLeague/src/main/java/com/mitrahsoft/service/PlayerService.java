package com.mitrahsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.mitrahsoft.entity.Player;
import com.mitrahsoft.repository.PlayRep;
//businesslogic for players
@Service
public class PlayerService {
   
	@Autowired
	PlayRep playerRepository;
	
	public Player createPlayer(Player ply) //create player
	{
		Player createplayer = playerRepository.save(ply);
		return createplayer;
	}
	
	public Player searchPlayer(@PathVariable int pno) //search player 
	{
		return playerRepository.findById(pno).orElse(null);
	}
	
	public Player updatePlayerById(@PathVariable int pno,Player player) //updating player details
	{
		Player play = (Player)playerRepository.findById(pno).orElse(null);
		if(play==null)
		{
			return null;
		}
		else
		{
		play.setName(player.getName());
		play.setTeamname(player.getTeamname());
		playerRepository.save(play);
		return play;
		}
	}
	
	public Player deletePlayer(@PathVariable int pno) //removing the player
	{
		Player play = playerRepository.findById(pno).orElse(null);
		if(play!=null)
		{
			playerRepository.delete(play);
			return play;
		}
		else
		{
			return null;
		}
	}
	
	public List<Player> getAllPlayers()  //to get all players
	{
		return playerRepository.findAll();
	}
	
}
