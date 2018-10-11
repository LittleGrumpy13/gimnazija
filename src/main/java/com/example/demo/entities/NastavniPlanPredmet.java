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
@Table(name = "nastavni_plan_predmet")

public class NastavniPlanPredmet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "nastavni_plan_predmet_ID")
	private int nastavni_plan_predmet_ID;

	@Column(name = "ime_plana")
	private String ime_plana;

	@Column(name = "razred")
	private String razred;

	@Column(name = "nedeljno_nastave")
	private int nedeljno_nastave;

	@Column(name = "nedeljno_vezbi")
	private int nedeljno_vezbi;

	@Column(name = "ukupno_nedelja")
	private int ukupno_nedelja;

	///////////////////////////////////////

	@OneToMany(cascade = { CascadeType.ALL })
	private List<UcenikPredmet> predmeti;
	
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Angazovanje> angazovanje;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "predmet_ID")
	private Predmet predmet;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "godisnji_plan_ID")
	private GodisnjiPlan godisnjiPlan;
	
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Cas> casovi;

	///////////////////////////////////////

	public int getNastavni_plan_predmet_ID() {
		return nastavni_plan_predmet_ID;
	}

	public void setNastavni_plan_predmet_ID(int nastavni_plan_predmet_ID) {
		this.nastavni_plan_predmet_ID = nastavni_plan_predmet_ID;
	}

	public String getIme_plana() {
		return ime_plana;
	}

	public void setIme_plana(String ime_plana) {
		this.ime_plana = ime_plana;
	}

	public String getRazred() {
		return razred;
	}

	public void setRazred(String razred) {
		this.razred = razred;
	}

	public int getNedeljno_nastave() {
		return nedeljno_nastave;
	}

	public void setNedeljno_nastave(int nedeljno_nastave) {
		this.nedeljno_nastave = nedeljno_nastave;
	}

	public int getNedeljno_vezbi() {
		return nedeljno_vezbi;
	}

	public void setNedeljno_vezbi(int nedeljno_vezbi) {
		this.nedeljno_vezbi = nedeljno_vezbi;
	}

	public int getUkupno_nedelja() {
		return ukupno_nedelja;
	}

	public void setUkupno_nedelja(int ukupno_nedelja) {
		this.ukupno_nedelja = ukupno_nedelja;
	}

	public NastavniPlanPredmet() {
		super();
	}

	public NastavniPlanPredmet(int nastavni_plan_predmet_ID, String ime_plana, String razred, int nedeljno_nastave,
			int nedeljno_vezbi, int ukupno_nedelja) {
		super();
		this.nastavni_plan_predmet_ID = nastavni_plan_predmet_ID;
		this.ime_plana = ime_plana;
		this.razred = razred;
		this.nedeljno_nastave = nedeljno_nastave;
		this.nedeljno_vezbi = nedeljno_vezbi;
		this.ukupno_nedelja = ukupno_nedelja;
	}
	
	

	public List<UcenikPredmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<UcenikPredmet> predmeti) {
		this.predmeti = predmeti;
	}
	
	

	public List<Angazovanje> getAngazovanje() {
		return angazovanje;
	}

	public void setAngazovanje(List<Angazovanje> angazovanje) {
		this.angazovanje = angazovanje;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public GodisnjiPlan getGodisnjiPlan() {
		return godisnjiPlan;
	}

	public void setGodisnjiPlan(GodisnjiPlan godisnjiPlan) {
		this.godisnjiPlan = godisnjiPlan;
	}
	
	

	public List<Cas> getCasovi() {
		return casovi;
	}

	public void setCasovi(List<Cas> casovi) {
		this.casovi = casovi;
	}

	@Override
	public String toString() {
		return "NastavniPlanPredmet [nastavni_plan_predmet_ID=" + nastavni_plan_predmet_ID + ", ime_plana=" + ime_plana
				+ ", razred=" + razred + ", nedeljno_nastave=" + nedeljno_nastave + ", nedeljno_vezbi=" + nedeljno_vezbi
				+ ", ukupno_nedelja=" + ukupno_nedelja + "]";
	}

}
