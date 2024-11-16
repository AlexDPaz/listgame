package com.alexsandro.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexsandro.dslist.dto.GameDTO;
import com.alexsandro.dslist.dto.GameMinDTO;
import com.alexsandro.dslist.entities.Game;
import com.alexsandro.dslist.projection.GameMinProjection;
import com.alexsandro.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long Id) {
		Game result = gameRepository.findById(Id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findBList(Long ListsId) {
		List<GameMinProjection> result = gameRepository.searchByList(ListsId);
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
