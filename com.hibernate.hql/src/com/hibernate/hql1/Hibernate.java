package com.hibernate.hql1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hibernate")
public class Hibernate {
	
	public Hibernate(){
		
	}
	
	public Hibernate(int user_id, String user_fname, String user_lname, String user_email) {
		
		this.user_id = user_id;
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.user_email = user_email;
	}

	
	@Id
	@Column(name="user_id")
	int user_id;
	
	@Column(name="user_fname")
	String user_fname;
	
	@Column(name="user_lname")
	String user_lname;
	
	@Column(name="user_email")
	String user_email;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_fname() {
		return user_fname;
	}

	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}

	public String getUser_lname() {
		return user_lname;
	}

	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	@Override
	public String toString() {
		return "Hibernate [user_id=" + user_id + ", user_fname=" + user_fname + ", user_lname=" + user_lname
				+ ", user_email=" + user_email + "]";
	}
	
	

}
