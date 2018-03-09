/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agilepays.data.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author morpheus
 */
@Entity
@Table(name = "carte_item")
public class CarteItem extends GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5549213649847980024L;

	@Size(max = 2147483647)
	@Column(name = "bar_code")
	private String barCode;

	@Basic(optional = false)
	@NotNull
	@Column(name = "discount")
	private Double discount;

	@Size(max = 2147483647)
	@Column(name = "description")
	private String description;

	@Basic(optional = false)
	@NotNull
	@Column(name = "stock")
	private Boolean stock;

	@Basic(optional = false)
	@NotNull
	@Column(name = "show")
	private Boolean show;

	@Size(max = 2147483647)
	@Column(name = "image_link")
	private String imageLink;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2147483647)
	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private Double price;

	@Column(name = "prep_time_mins")
	private Integer prepTimeMins;

	@ElementCollection
	@CollectionTable(name = "categories_cartre_item")
	@Column(name = "name")
	private List<String> categories;

	public CarteItem() {
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStock() {
		return stock;
	}

	public void setStock(Boolean stock) {
		this.stock = stock;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPrepTimeMins() {
		return prepTimeMins;
	}

	public void setPrepTimeMins(Integer prepTimeMins) {
		this.prepTimeMins = prepTimeMins;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

}
