package com.QuestionAFool.game.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User extends Auditable{
	
	@NotBlank
	@Email
	@Getter @Setter
	@Column(unique = true)
	private String email;
	
	@NotBlank
	@Getter @Setter
	private String saltedHashedPasswords;
	
	@Getter @Setter
	@ManyToMany
	Set<Role> roles = new HashSet<>(); 	

}
