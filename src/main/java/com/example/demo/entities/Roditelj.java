package com.example.demo.entities;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roditelj")

public class Roditelj {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "roditelj_ID")
	private int roditelj_ID;

	public Roditelj() {
		super();
	}

	///////////////////////////////////////

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "user_ID")
	private User user;

	@OneToMany(mappedBy = "roditelj", cascade = { CascadeType.ALL })
	private List<RoditeljskiSastanak> sastanci;

	@ManyToMany(cascade = { CascadeType.ALL })
	private List<Ucenik> ucenici;

	@JoinTable(joinColumns = @JoinColumn(name = "roditelj_ID"), inverseJoinColumns = @JoinColumn(name = "ucenik_ID"))

	///////////////////////////////////////

	public int getRoditelj_ID() {
		return roditelj_ID;
	}

	public void setRoditelj_ID(int roditelj_ID) {
		this.roditelj_ID = roditelj_ID;
	}

	public Roditelj(int roditelj_ID) {
		super();
		this.roditelj_ID = roditelj_ID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<RoditeljskiSastanak> getSastanci() {
		return sastanci;
	}

	public void setSastanci(List<RoditeljskiSastanak> sastanci) {
		this.sastanci = sastanci;
	}

	public List<Ucenik> getUcenici() {
		return ucenici;
	}

	public void setUcenici(List<Ucenik> ucenici) {
		this.ucenici = ucenici;
	}

	@Override
	public String toString() {
		return "Roditelj [roditelj_ID=" + roditelj_ID + "]";
	}

}
