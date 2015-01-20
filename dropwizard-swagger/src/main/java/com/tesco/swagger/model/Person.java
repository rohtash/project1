package com.tesco.swagger.model;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel( value = "Person", description = "Person resource representation" )
public class Person {
	@ApiModelProperty( value = "Person's e-mail address ", required = true ) 
	private String emailId;
	@ApiModelProperty( value = "Person's first name", required = true ) 
	private String firstName;
	@ApiModelProperty( value = "Person's last name", required = true )
	private String lastName;
		
	public Person() {
	}
	
		
	public Person( final String emailId,final String firstName,final String lastName ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId=emailId;
		
	}

	public String getEmailId() {
		return emailId;
	}
		
	public void setEmailId( final String email ) {
		this.emailId = email;
	}
		
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
		
	public void setFirstName( final String firstName ) {
		this.firstName = firstName;
	}
		
	public void setLastName( final String lastName ) {
		this.lastName = lastName;
	}		
}