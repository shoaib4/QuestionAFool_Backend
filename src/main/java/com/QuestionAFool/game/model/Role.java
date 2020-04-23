package com.QuestionAFool.game.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
public class Role extends Auditable{
	@NotBlank
	@Getter @Setter
	@Column(unique = true)
	private String name;
	
	@NotBlank
	@Getter @Setter
	private String description;
}
