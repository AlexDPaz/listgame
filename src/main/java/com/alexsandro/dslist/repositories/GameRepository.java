package com.alexsandro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsandro.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
