package com.QuestionAFool.game.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "games")
public class Game extends Auditable {
	//maped by is written in Player class	
	@ManyToMany
	@Getter @Setter
	private Set<Player> players = new HashSet<>();
	
	@Getter @Setter
	@Enumerated(EnumType.STRING)
	@NotNull
	private GameMode gameMode;
	
	@Getter @Setter
	private int numRounds = 5;
	
	@Getter @Setter
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "game")
	private  List<Round> rounds = new ArrayList<>();
	
	@Getter @Setter
	private boolean hasEllen = false; 
	
	@Getter @Setter
	@NotNull
	@ManyToOne
	private Player leader;
	
	@Getter @Setter
	@ManyToMany(cascade = CascadeType.ALL)
	private Map<Player,Stat> playerStats = new HashMap<>();
	
	@Getter @Setter
	@Enumerated(EnumType.STRING)
	private GameStatus gameStatus;
}
