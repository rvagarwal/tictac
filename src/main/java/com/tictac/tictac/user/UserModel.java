package com.tictac.tictac.user;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4906242834451733189L;

	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private Long contactNo;
	
	private Boolean active;

}
