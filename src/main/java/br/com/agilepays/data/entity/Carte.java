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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author morpheus
 */
@Entity
@Table(name = "carte")
public class Carte extends GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1963413229421023333L;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2147483647)
	@Column(name = "name")
	private String name;
	@Column(name = "show")
	private Boolean show;
	@Size(max = 2147483647)
	@Column(name = "image_link")
	private String imageLink;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "carte_carteItems", joinColumns = @JoinColumn(name = "carte_item_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "carte_id", referencedColumnName = "id"))
	private List<CarteItem> carteItens;

	@ManyToMany(mappedBy = "cartes")
	private List<Establishment> establishments;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public List<CarteItem> getCarteItens() {
		return carteItens;
	}

	public void setCarteItens(List<CarteItem> carteItens) {
		this.carteItens = carteItens;
	}

	public List<Establishment> getEstablishments() {
		return establishments;
	}

	public void setEstablishments(List<Establishment> establishments) {
		this.establishments = establishments;
	}

	

}
