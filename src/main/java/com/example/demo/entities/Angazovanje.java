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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "angazovanje")
public class Angazovanje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "angazovanje_ID")
	private int angazovanje_ID;

	@Column(name = "pocetak")
	private Date pocetak;

	@Column(name = "kraj")
	private Date kraj;
	
	public Angazovanje() {
		super();
	}
	
	public Angazovanje(int angazovanje_ID, Date pocetak, Date kraj) {
		super();
		this.angazovanje_ID = angazovanje_ID;
		this.pocetak = pocetak;
		this.kraj = kraj;
	}
	
	///////////////////////////////////////

	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "nastavnik_ID")
	private Nastavnik nastavnici;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "nastavni_plan_predmet_ID")
	private NastavniPlanPredmet nastavniPlanPredmet;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	private List<Odeljenje> odeljenja;

	@JoinTable(joinColumns = @JoinColumn(name = "angazovanje_ID"), inverseJoinColumns = @JoinColumn(name = "odeljenje_ID"))

	///////////////////////////////////////
	
	

	public int getAngazovanje_ID() {
		return angazovanje_ID;
	}

	public void setAngazovanje_ID(int angazovanje_ID) {
		this.angazovanje_ID = angazovanje_ID;
	}

	public Date getPocetak() {
		return pocetak;
	}

	public void setPocetak(Date pocetak) {
		this.pocetak = pocetak;
	}

	public Date getKraj() {
		return kraj;
	}

	public void setKraj(Date kraj) {
		this.kraj = kraj;
	}
	
	public List<Odeljenje> getOdeljenja() {
		return odeljenja;
	}

	public void setOdeljenja(List<Odeljenje> odeljenja) {
		this.odeljenja = odeljenja;
	}
	
	

	public Nastavnik getNastavnici() {
		return nastavnici;
	}

	public void setNastavnici(Nastavnik nastavnici) {
		this.nastavnici = nastavnici;
	}

	public NastavniPlanPredmet getNastavniPlanPredmet() {
		return nastavniPlanPredmet;
	}

	public void setNastavniPlanPredmet(NastavniPlanPredmet nastavniPlanPredmet) {
		this.nastavniPlanPredmet = nastavniPlanPredmet;
	}

	@Override
	public String toString() {
		return "Angazovanje [angazovanje_ID=" + angazovanje_ID + ", pocetak=" + pocetak + ", kraj=" + kraj + "]";
	}

}
