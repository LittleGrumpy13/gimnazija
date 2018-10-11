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
@Table(name = "zaduzenja")

public class Zaduzenja {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "zaduzenje_ID")
	private int zaduzenje_ID;

	@Column(name = "iznos_zaduzenja")
	private double iznos_zaduzenja;

	@Column(name = "rok_za_placanje")
	private Date rok_za_placanje;

	@Column(name = "popust_iznos")
	private double popust_iznos;

	@Column(name = "napomena")
	private String napomena;

	@Column(name = "created_by")
	private int created_by;

	@Column(name = "date_created")
	private Date date_created;

	@Column(name = "modified_by")
	private int modified_by;

	@Column(name = "date_modified")
	private Date date_modified;

	///////////////////////////////////////

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "cenovnik_ID")
	private Cenovnik cenovnici;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "upis_ID")
	private Upis upis;
	
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Uplate> uplate;

	///////////////////////////////////////

	public int getZaduzenje_ID() {
		return zaduzenje_ID;
	}

	public void setZaduzenje_ID(int zaduzenje_ID) {
		this.zaduzenje_ID = zaduzenje_ID;
	}

	public double getIznos_zaduzenja() {
		return iznos_zaduzenja;
	}

	public void setIznos_zaduzenja(double iznos_zaduzenja) {
		this.iznos_zaduzenja = iznos_zaduzenja;
	}

	public Date getRok_za_placanje() {
		return rok_za_placanje;
	}

	public void setRok_za_placanje(Date rok_za_placanje) {
		this.rok_za_placanje = rok_za_placanje;
	}

	public double getPopust_iznos() {
		return popust_iznos;
	}

	public void setPopust_iznos(double popust_iznos) {
		this.popust_iznos = popust_iznos;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public int getModified_by() {
		return modified_by;
	}

	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}

	public Date getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
	}

	public Zaduzenja() {
		super();
	}

	public Zaduzenja(int zaduzenje_ID, double iznos_zaduzenja, Date rok_za_placanje, double popust_iznos,
			String napomena, int created_by, Date date_created, int modified_by, Date date_modified) {
		super();
		this.zaduzenje_ID = zaduzenje_ID;
		this.iznos_zaduzenja = iznos_zaduzenja;
		this.rok_za_placanje = rok_za_placanje;
		this.popust_iznos = popust_iznos;
		this.napomena = napomena;
		this.created_by = created_by;
		this.date_created = date_created;
		this.modified_by = modified_by;
		this.date_modified = date_modified;
	}
	
	

	public Cenovnik getCenovnici() {
		return cenovnici;
	}

	public void setCenovnici(Cenovnik cenovnici) {
		this.cenovnici = cenovnici;
	}

	public Upis getUpis() {
		return upis;
	}

	public void setUpis(Upis upis) {
		this.upis = upis;
	}

	
	
	public List<Uplate> getUplate() {
		return uplate;
	}

	public void setUplate(List<Uplate> uplate) {
		this.uplate = uplate;
	}

	@Override
	public String toString() {
		return "Zaduzenja [zaduzenje_ID=" + zaduzenje_ID + ", iznos_zaduzenja=" + iznos_zaduzenja + ", rok_za_placanje="
				+ rok_za_placanje + ", popust_iznos=" + popust_iznos + ", napomena=" + napomena + ", created_by="
				+ created_by + ", date_created=" + date_created + ", modified_by=" + modified_by + ", date_modified="
				+ date_modified + "]";
	}

}
