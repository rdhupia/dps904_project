package com.JPADevelopment.onlinequiz;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsersEntity
 *
 */
@Entity
@Table(name = "Users")
public class UsersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	
	private String email;
	private String password;
	private int role;				// 1 Regular user: learners, 2 Admin / Creator
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy = "user")
	private List<RecordsEntity> records;
	
	public UsersEntity() {
		super();
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<RecordsEntity> getRecords() {
		return records;
	}

	public void setRecords(List<RecordsEntity> records) {
		this.records = records;
	}
   
}
