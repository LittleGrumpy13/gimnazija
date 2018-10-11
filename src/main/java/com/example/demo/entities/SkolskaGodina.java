package com.example.demo.entities;

import java.sql.Date;
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
@Table(name = "skolska_godina")

public class SkolskaGodina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "skolska_godina_ID")
	private int skolska_godina_ID;

	@Column(name = "datum_pocetka")
	private Date datum_pocetka;

	@Column(name = "datum_kraja")
	private Date datum_kraja;

	///////////////////////////////////////

	@OneToMany(cascade = { CascadeType.ALL })
	private List<Odeljenje> odeljenja;
	
	@OneToMany(cascade = { CascadeType.ALL })
	private List<GodisnjiPlan> planovi;
	
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH, CascadeType.PERSIST})
	private List<Cenovnik> cenovnici;

	///////////////////////////////////////

	public int getSkolska_godina_ID() {
		return skolska_godina_ID;
	}

	public void setSkolska_godina_ID(int skolska_godina_ID) {
		this.skolska_godina_ID = skolska_godina_ID;
	}

	public Date getDatum_pocetka() {
		return datum_pocetka;
	}

	public void setDatum_pocetka(Date datum_pocetka) {
		this.datum_pocetka = datum_pocetka;
	}

	public Date getDatum_kraja() {
		return datum_kraja;
	}

	public void setDatum_kraja(Date datum_kraja) {
		this.datum_kraja = datum_kraja;
	}

	public SkolskaGodina() {
		super();
	}

	public SkolskaGodina(int skolska_godina_ID, Date datum_pocetka, Date datum_kraja) {
		super();
		this.skolska_godina_ID = skolska_godina_ID;
		this.datum_pocetka = datum_pocetka;
		this.datum_kraja = datum_kraja;
	}

	public List<Odeljenje> getOdeljenja() {
		return odeljenja;
	}

	public void setOdeljenja(List<Odeljenje> odeljenja) {
		this.odeljenja = odeljenja;
	}
	
	

	public List<GodisnjiPlan> getPlanovi() {
		return planovi;
	}

	public void setPlanovi(List<GodisnjiPlan> planovi) {
		this.planovi = planovi;
	}
	
	public List<Cenovnik> getCenovnici() {
		return cenovnici;
	}

	public void setCenovnici(List<Cenovnik> cenovnici) {
		this.cenovnici = cenovnici;
	}

	@Override
	public String toString() {
		return "SkolskaGodina [skolska_godina_ID=" + skolska_godina_ID + ", datum_pocetka=" + datum_pocetka
				+ ", datum_kraja=" + datum_kraja + "]";
	}

}
