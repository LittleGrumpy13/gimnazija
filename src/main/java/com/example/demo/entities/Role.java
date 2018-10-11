package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "role_ID")
	private int role_ID;

	@Column(name = "naziv_role")
	private String naziv_role;

	public Role() {
		super();
	}

	public Role(int role_ID, String naziv_role) {
		super();
		this.role_ID = role_ID;
		this.naziv_role = naziv_role;
	}

	///////////////////////////////

	@ManyToMany(cascade = { CascadeType.ALL })
	private List<User> users;

	@JoinTable(joinColumns = @JoinColumn(name = "role_ID"), inverseJoinColumns = @JoinColumn(name = "user_ID"))

	///////////////////////////////

	public int getRole_ID() {
		return role_ID;
	}

	public void setRole_ID(int role_ID) {
		this.role_ID = role_ID;
	}

	public String getNaziv_role() {
		return naziv_role;
	}

	public void setNaziv_role(String naziv_role) {
		this.naziv_role = naziv_role;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void addUser(User theUser) {

		if (users == null) {
			users = new ArrayList<>();
		}
		users.add(theUser);
	}

	@Override
	public String toString() {
		return "Role [role_ID=" + role_ID + ", naziv_role=" + naziv_role + "]";
	}

}
