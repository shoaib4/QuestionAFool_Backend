package com.QuestionAFool.game.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "rounds")
public class Round extends Auditable{
	
	@ManyToOne
	private Game game;
}
// for one to many relatioship u dont need to create a new table. Just add a new coloum in eather
// JPA automaticly adds indexing by the new coloum u just added(like game_id) 
