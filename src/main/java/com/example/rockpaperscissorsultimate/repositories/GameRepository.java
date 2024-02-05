package com.example.rockpaperscissorsultimate.repositories;

import com.example.rockpaperscissorsultimate.models.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, String> {
}
