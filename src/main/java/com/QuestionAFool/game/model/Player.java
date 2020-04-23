package com.QuestionAFool.game.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "players")
public class Player extends Auditable {
	
	
	@NotBlank
	@Getter @Setter
	private String alias;
	
	@Getter @Setter
	private String psychFaceURL;
	
	@Getter @Setter
	private String picURL;
	
	@OneToOne(cascade = CascadeType.ALL)
	@Getter @Setter
	private Stat stats = new Stat();
	
	@ManyToMany(mappedBy = "players")
	@Getter @Setter
	private Set<Game> games = new HashSet<>();
	
}
