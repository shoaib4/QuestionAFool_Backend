package com.QuestionAFool.game.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stats")
public class Stat extends Auditable {
	@Getter @Setter
	private long getPsychedCount;
	
	@Getter @Setter
	private long psychedOtheresCount;
	
	@Getter @Setter
	private long correctAnswerCount;
}
