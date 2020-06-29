package com.tictac.tictac.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	private String id;
	
	@Field(name = "first")
	private String firstName;
	
	private String lastName;
	
	private Long contactNo;
	
	private Boolean active;
}
