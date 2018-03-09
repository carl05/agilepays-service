/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agilepays.data.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author morpheus
 */
@Entity
@Table(name = "establishment")
public class Establishment extends GenericEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3842561751960214714L;

	@Column(name = "stars")
	private Integer stars;

	@Column(name = "rating")
	private Integer rating;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2147483647)
	@Column(name = "name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_establishment", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "establishment_id", referencedColumnName = "id"))
	private List<User> users;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "carte_establishment", joinColumns = @JoinColumn(name = "carte_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "establishment_id", referencedColumnName = "id"))
	private List<Carte> cartes;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "desk_establishment", joinColumns = @JoinColumn(name = "desk_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "establishment_id", referencedColumnName = "id"))
	private List<Desk> establishmentDesks;

	@OneToOne(optional = false, fetch = FetchType.EAGER)
	private Address address;

	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

//	private List<FormaPagamento> formasPagamento;

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Desk> getEstablishmentDesks() {
		return establishmentDesks;
	}

	public void setEstablishmentDesks(List<Desk> establishmentDesks) {
		this.establishmentDesks = establishmentDesks;
	}

}
