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
import javax.validation.constraints.Size;

@Entity
@Table(name = "ucenik")
public class Ucenik {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ucenik_ID")
	private int ucenik_ID;

	@Size(max = 256)
	@Column(name = "broj_knjizice")
	private String broj_knjizice;

	@Size(max = 256)
	@Column(name = "ime_roditelja")
	private String ime_roditelja;

	@Size(max = 256)
	@Column(name = "osnovna_skola")
	private String osnovna_skola;

	public Ucenik() {
		super();
	}

	///////////////////////////////////////

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "user_ID")
	private User user;

	@ManyToMany(cascade = { CascadeType.ALL })
	private List<Roditelj> roditelji;

	@JoinTable(joinColumns = @JoinColumn(name = "ucenik_ID"), inverseJoinColumns = @JoinColumn(name = "roditelj_ID"))

	@OneToMany(cascade = { CascadeType.ALL })
	private List<UcenikPredmet> predmeti;
	
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Upis> upis;
	
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Prisustvo> prisustva;

	///////////////////////////////////////

	public int getUcenik_ID() {
		return ucenik_ID;
	}

	public void setUcenik_ID(int ucenik_ID) {
		this.ucenik_ID = ucenik_ID;
	}

	public String getBroj_knjizice() {
		return broj_knjizice;
	}

	public void setBroj_knjizice(String broj_knjizice) {
		this.broj_knjizice = broj_knjizice;
	}

	public String getIme_roditelja() {
		return ime_roditelja;
	}

	public void setIme_roditelja(String ime_roditelja) {
		this.ime_roditelja = ime_roditelja;
	}

	public String getOsnovna_skola() {
		return osnovna_skola;
	}

	public void setOsnovna_skola(String osnovna_skola) {
		this.osnovna_skola = osnovna_skola;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Ucenik(int ucenik_ID, @Size(max = 256) String broj_knjizice, @Size(max = 256) String ime_roditelja,
			@Size(max = 256) String osnovna_skola, User user) {
		super();
		this.ucenik_ID = ucenik_ID;
		this.broj_knjizice = broj_knjizice;
		this.ime_roditelja = ime_roditelja;
		this.osnovna_skola = osnovna_skola;
		this.user = user;
	}

	public List<Roditelj> getRoditelji() {
		return roditelji;
	}

	public void setRoditelji(List<Roditelj> roditelji) {
		this.roditelji = roditelji;
	}

	public List<UcenikPredmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<UcenikPredmet> predmeti) {
		this.predmeti = predmeti;
	}
	
	

	public List<Upis> getUpis() {
		return upis;
	}

	public void setUpis(List<Upis> upis) {
		this.upis = upis;
	}
	
	

	public List<Prisustvo> getPrisustva() {
		return prisustva;
	}

	public void setPrisustva(List<Prisustvo> prisustva) {
		this.prisustva = prisustva;
	}

	@Override
	public String toString() {
		return "Ucenik [ucenik_ID=" + ucenik_ID + ", broj_knjizice=" + broj_knjizice + ", ime_roditelja="
				+ ime_roditelja + ", osnovna_skola=" + osnovna_skola + "]";
	}
}
