package com.shwe.faketube.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@JsonAlias(value = "dbId")
	private String id;
	
	@NotNull
	private String name;
	
//	private String email;
//	
//	private String address;

}
