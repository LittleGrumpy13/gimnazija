package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
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

import org.joda.time.DateTime;

@Entity
@Table(name = "cenovnik")
public class Cenovnik {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "cenovnik_ID")
	private int cenovnik_ID;

	@Column(name = "naziv_stavke")
	private String naziv_stavke;

	@Column(name = "cena_stavke")
	private float cena_stavke;

	@Column(name = "sifra")
	private int sifra;

	@Column(name = "valuta")
	private String valuta;

	@Column(name = "date_created")
	private Date date_created;

	@Column(name = "created_by")
	private int created_by;

	@Column(name = "date_modified")
	private Date date_modified;

	@Column(name = "modified_by")
	private int modified_by;

	public Cenovnik() {
		super();
	}

	public Cenovnik(int cenovnik_ID, String naziv_stavke, float cena_stavke, int sifra, String valuta,
			Date date_created, int created_by, Date date_modified, int modified_by, List<Zaduzenja> zaduzenja,
			SkolskaGodina skolskaGodina, ModeliPlacanjaIStipendije modeli) {
		super();
		this.cenovnik_ID = cenovnik_ID;
		this.naziv_stavke = naziv_stavke;
		this.cena_stavke = cena_stavke;
		this.sifra = sifra;
		this.valuta = valuta;
		this.date_created = date_created;
		this.created_by = created_by;
		this.date_modified = date_modified;
		this.modified_by = modified_by;
		this.zaduzenja = zaduzenja;
		this.skolskaGodina = skolskaGodina;
		this.modeli = modeli;
	}

	///////////////////////////////////////

	@OneToMany(cascade = { CascadeType.ALL })
	private List<Zaduzenja> zaduzenja;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH,
				CascadeType.REFRESH, CascadeType.PERSIST})
	@JoinColumn(name = "skolska_godina_ID")
	private SkolskaGodina skolskaGodina;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH,
			   CascadeType.REFRESH, CascadeType.PERSIST})
	@JoinColumn(name = "model_placanja_ID")
	private ModeliPlacanjaIStipendije modeli;

	///////////////////////////////////////

	public int getCenovnik_ID() {
		return cenovnik_ID;
	}

	public void setCenovnik_ID(int cenovnik_ID) {
		this.cenovnik_ID = cenovnik_ID;
	}

	public String getNaziv_stavke() {
		return naziv_stavke;
	}

	public void setNaziv_stavke(String naziv_stavke) {
		this.naziv_stavke = naziv_stavke;
	}

	public float getCena_stavke() {
		return cena_stavke;
	}

	public void setCena_stavke(float cena_stavke) {
		this.cena_stavke = cena_stavke;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public Date getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
	}

	public int getModified_by() {
		return modified_by;
	}

	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public List<Zaduzenja> getZaduzenja() {
		return zaduzenja;
	}

	public void setZaduzenja(List<Zaduzenja> zaduzenja) {
		this.zaduzenja = zaduzenja;
	}

	public SkolskaGodina getSkolskaGodina() {
		return skolskaGodina;
	}

	public void setSkolskaGodina(SkolskaGodina skolskaGodina) {
		this.skolskaGodina = skolskaGodina;
	}

	public ModeliPlacanjaIStipendije getModeli() {
		return modeli;
	}

	public void setModeli(ModeliPlacanjaIStipendije modeli) {
		this.modeli = modeli;
	}

	@Override
	public String toString() {
		return "Cenovnik [cenovnik_ID=" + cenovnik_ID + ", naziv_stavke=" + naziv_stavke + ", cena_stavke="
				+ cena_stavke + ", valuta=" + valuta + ", date_created=" + date_created + ", created_by=" + created_by
				+ ", date_modified=" + date_modified + ", modified_by=" + modified_by + "]";
	}

}
