
	package com.model;
	 
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.Data;
	 
	@Entity
	@Table(name="User")
	@Data
	public class User {
		@Id
		@Column(name="ID")
		private int ID;
		
		@Column(name="Name")
	    private String Name;
	}

