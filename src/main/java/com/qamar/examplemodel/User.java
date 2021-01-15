package com.qamar.examplemodel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="incoming")
public class User {

	//Transient is defined as someone or something that is temporary or staying for a short amount of time
		@Transient
		public static final String SEQUENCE_NAME = "user_sequence";
	
	@Id
	private long id;
	
	@NotBlank
	@Size(max=100)
	@Indexed(unique = true)
	private String name;
	
	private boolean status;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	
	
	
}
