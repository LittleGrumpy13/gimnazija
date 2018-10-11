package com.example.demo.entities;

import java.util.Date;
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
import javax.persistence.Table;

@Entity
@Table(name = "ucenik_predmet")
public class UcenikPredmet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ucenik_predmet_ID")
	private int ucenik_predmet_ID;

	@Column(name = "ocena")
	private int ocena;

	@Column(name = "tip_ocene")
	private String tip_ocene;

	@Column(name = "polugodiste")
	private int polugodiste;

	@Column(name = "datum_unosa")
	private Date datum_unosa;

	@Column(name = "napomena")
	private String napomena;

	///////////////////////////////////////

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ucenik_ID")
	private Ucenik ucenik;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "nastavnik_ID")
	private Nastavnik nastavnici;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "nastavni_plan_predmet_ID")
	private NastavniPlanPredmet planovi;

	///////////////////////////////////////

	public int getUcenik_predmet_ID() {
		return ucenik_predmet_ID;
	}

	public void setUcenik_predmet_ID(int ucenik_predmet_ID) {
		this.ucenik_predmet_ID = ucenik_predmet_ID;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getTip_ocene() {
		return tip_ocene;
	}

	public void setTip_ocene(String tip_ocene) {
		this.tip_ocene = tip_ocene;
	}

	public int getPolugodiste() {
		return polugodiste;
	}

	public void setPolugodiste(int polugodiste) {
		this.polugodiste = polugodiste;
	}

	public Date getDatum_unosa() {
		return datum_unosa;
	}

	public void setDatum_unosa(Date datum_unosa) {
		this.datum_unosa = datum_unosa;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public UcenikPredmet() {
		super();
	}

	public UcenikPredmet(int ucenik_predmet_ID, int ocena, String tip_ocene, int polugodiste, Date datum_unosa,
			String napomena) {
		super();
		this.ucenik_predmet_ID = ucenik_predmet_ID;
		this.ocena = ocena;
		this.tip_ocene = tip_ocene;
		this.polugodiste = polugodiste;
		this.datum_unosa = datum_unosa;
		this.napomena = napomena;
	}

	public Ucenik getUcenik() {
		return ucenik;
	}

	public void setUcenik(Ucenik ucenik) {
		this.ucenik = ucenik;
	}
	
	

	public Nastavnik getNastavnici() {
		return nastavnici;
	}

	public void setNastavnici(Nastavnik nastavnici) {
		this.nastavnici = nastavnici;
	}
	
	

	public NastavniPlanPredmet getPlanovi() {
		return planovi;
	}

	public void setPlanovi(NastavniPlanPredmet planovi) {
		this.planovi = planovi;
	}

	@Override
	public String toString() {
		return "UcenikPredmet [ucenik_predmet_ID=" + ucenik_predmet_ID + ", ocena=" + ocena + ", tip_ocene=" + tip_ocene
				+ ", polugodiste=" + polugodiste + ", datum_unosa=" + datum_unosa + ", napomena=" + napomena + "]";
	}

}
