package com.alexsandro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsandro.dslist.entities.Game;
import com.alexsandro.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
