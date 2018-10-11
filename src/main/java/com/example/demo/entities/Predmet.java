package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="predmet")
public class Predmet {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column (name="predmet_ID")
	private int predmet_ID;
	
	@Column (name="sifra")
	private String sifra;
	
	@Column (name="pun_naziv")
	private String pun_naziv;
	
	///////////////////////////////////////
	
	@OneToMany(cascade = { CascadeType.ALL })
	private List<NastavniPlanPredmet> nastavniPlanPredmet;
	
	///////////////////////////////////////

	public int getPredmet_ID() {
		return predmet_ID;
	}

	public void setPredmet_ID(int predmet_ID) {
		this.predmet_ID = predmet_ID;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getPun_naziv() {
		return pun_naziv;
	}

	public void setPun_naziv(String pun_naziv) {
		this.pun_naziv = pun_naziv;
	}

	public Predmet() {
		super();
	}

	public Predmet(int predmet_ID, String sifra, String pun_naziv) {
		super();
		this.predmet_ID = predmet_ID;
		this.sifra = sifra;
		this.pun_naziv = pun_naziv;
	}
	
	

	public List<NastavniPlanPredmet> getNastavniPlanPredmet() {
		return nastavniPlanPredmet;
	}

	public void setNastavniPlanPredmet(List<NastavniPlanPredmet> nastavniPlanPredmet) {
		this.nastavniPlanPredmet = nastavniPlanPredmet;
	}

	@Override
	public String toString() {
		return "Predmet [predmet_ID=" + predmet_ID + ", sifra=" + sifra + ", pun_naziv=" + pun_naziv + "]";
	}
	
	
	

}
