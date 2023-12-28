package com.example.tictactoeultimate.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Game {
    @Id
    @GeneratedValue
    private UUID id;
    @OneToOne
    private Player cross;
    @OneToOne
    private Player zeros;
    private GameStatus gameStatus;
}