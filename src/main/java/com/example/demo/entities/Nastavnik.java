package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nastavnik")
public class Nastavnik {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "nastavnik_ID")
	private int nastavnik_ID;

	@Column(name = "fakultet")
	private String fakultet;

	@Column(name = "razredni")
	private short razredni;
	

	public Nastavnik() {
		super();
	}

	///////////////////////////////////////

	@OneToMany(cascade = { CascadeType.ALL })
	private List<UcenikPredmet> ucenikPredmet;
	
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Odeljenje> odeljenje;
	
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Angazovanje> angazovanje;
	
	@OneToMany(mappedBy = "nastavnik", cascade = { CascadeType.ALL })
	private List<Cas> cas;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "zaposleni_ID")
	private Zaposleni zaposleni;

	///////////////////////////////////////

	public int getNastavnik_ID() {
		return nastavnik_ID;
	}

	public void setNastavnik_ID(int nastavnik_ID) {
		this.nastavnik_ID = nastavnik_ID;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	public short getRazredni() {
		return razredni;
	}

	public void setRazredni(short razredni) {
		this.razredni = razredni;
	}


	public Nastavnik(int nastavnik_ID, String fakultet, short razredni) {
		super();
		this.nastavnik_ID = nastavnik_ID;
		this.fakultet = fakultet;
		this.razredni = razredni;
	}


	public List<UcenikPredmet> getUcenikPredmet() {
		return ucenikPredmet;
	}

	public void setUcenikPredmet(List<UcenikPredmet> ucenikPredmet) {
		this.ucenikPredmet = ucenikPredmet;
	}

	public List<Odeljenje> getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(List<Odeljenje> odeljenje) {
		this.odeljenje = odeljenje;
	}

	public List<Angazovanje> getAngazovanje() {
		return angazovanje;
	}

	public void setAngazovanje(List<Angazovanje> angazovanje) {
		this.angazovanje = angazovanje;
	}
	
	

	public List<Cas> getCas() {
		return cas;
	}

	public void setCas(List<Cas> cas) {
		this.cas = cas;
	}

	public Zaposleni getZaposleni() {
		return zaposleni;
	}

	public void setZaposleni(Zaposleni zaposleni) {
		this.zaposleni = zaposleni;
	}

	@Override
	public String toString() {
		return "Nastavnik [nastavnik_ID=" + nastavnik_ID + ", fakultet=" + fakultet + ", razredni=" + razredni + "]";
	}

}
