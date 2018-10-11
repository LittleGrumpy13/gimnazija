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
@Table(name = "prisustvo")

public class Prisustvo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "prisustvo_ID")
	private int prisustvo_ID;

	@Column(name = "opravdano")
	private short opravdano;

	///////////////////////////////////////

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ucenik_ID")
	private Ucenik ucenici;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "cas_ID")
	private Cas casovi;

	///////////////////////////////////////

	public int getPrisustvo_ID() {
		return prisustvo_ID;
	}

	public void setPrisustvo_ID(int prisustvo_ID) {
		this.prisustvo_ID = prisustvo_ID;
	}

	public short getOpravdano() {
		return opravdano;
	}

	public void setOpravdano(short opravdano) {
		this.opravdano = opravdano;
	}

	public Prisustvo() {
		super();
	}

	public Prisustvo(int prisustvo_ID, short opravdano) {
		super();
		this.prisustvo_ID = prisustvo_ID;
		this.opravdano = opravdano;
	}

	
	
	public Ucenik getUcenici() {
		return ucenici;
	}

	public void setUcenici(Ucenik ucenici) {
		this.ucenici = ucenici;
	}
	
	

	public Cas getCasovi() {
		return casovi;
	}

	public void setCasovi(Cas casovi) {
		this.casovi = casovi;
	}

	@Override
	public String toString() {
		return "Prisustvo [prisustvo_ID=" + prisustvo_ID + ", opravdano=" + opravdano + "]";
	}

}
