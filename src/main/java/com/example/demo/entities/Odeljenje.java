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
@Table(name = "odeljenje")
public class Odeljenje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "odeljenje_ID")
	private int odeljenje_ID;

	@Column(name = "oznaka")
	private int oznaka;

	@Column(name = "razred")
	private String razred;

	///////////////////////////////////////

	@OneToMany(cascade = { CascadeType.ALL })
	private List<Upis> upis;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "skolska_godina_ID")
	private SkolskaGodina skolskaGodina;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "nastavnik_ID")
	private Nastavnik nastavnici;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	private List<Angazovanje> angazovanja;

	@JoinTable(joinColumns = @JoinColumn(name = "odeljenje_ID"), inverseJoinColumns = @JoinColumn(name = "angazovanje_ID"))

	///////////////////////////////////////

	public int getOdeljenje_ID() {
		return odeljenje_ID;
	}

	public void setOdeljenje_ID(int odeljenje_ID) {
		this.odeljenje_ID = odeljenje_ID;
	}

	public int getOznaka() {
		return oznaka;
	}

	public void setOznaka(int oznaka) {
		this.oznaka = oznaka;
	}

	public String getRazred() {
		return razred;
	}

	public void setRazred(String razred) {
		this.razred = razred;
	}

	public Odeljenje() {
		super();
	}

	public Odeljenje(int odeljenje_ID, int oznaka, String razred) {
		super();
		this.odeljenje_ID = odeljenje_ID;
		this.oznaka = oznaka;
		this.razred = razred;
	}

	public List<Upis> getUpis() {
		return upis;
	}

	public void setUpis(List<Upis> upis) {
		this.upis = upis;
	}

	public SkolskaGodina getSkolskaGodina() {
		return skolskaGodina;
	}

	public void setSkolskaGodina(SkolskaGodina skolskaGodina) {
		this.skolskaGodina = skolskaGodina;
	}
	
	

	public Nastavnik getNastavnici() {
		return nastavnici;
	}

	public void setNastavnici(Nastavnik nastavnici) {
		this.nastavnici = nastavnici;
	}
	
	

	public List<Angazovanje> getAngazovanja() {
		return angazovanja;
	}

	public void setAngazovanja(List<Angazovanje> angazovanja) {
		this.angazovanja = angazovanja;
	}

	@Override
	public String toString() {
		return "Odeljenje [odeljenje_ID=" + odeljenje_ID + ", oznaka=" + oznaka + ", razred=" + razred + "]";
	}

}
