package com.hql1.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hql")
public class Hqluser {
	
	
	public Hqluser(int user_id, String user_name, String user_fname, String user_lname, char user_pwd) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.user_pwd = user_pwd;
	}

	@Id
	@Column(name="user_id")
	int user_id;
	
	@Column(name="user_nam")
	String user_name;
	
	@Column(name="user_fname")
	String user_fname;
	
	@Column(name="user_lname")
	String user_lname;
	
	@Column(name="user_pwd")
	char user_pwd;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
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

	public char getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(char user_pwd) {
		this.user_pwd = user_pwd;
	}

}
