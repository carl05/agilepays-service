/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agilepays.data.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author morpheus
 */
@Entity
@Table(name = "category_carte_item")
public class CategoryCarteItem extends GenericEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 95911025291294707L;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2147483647)
	@Column(name = "name", unique = true, nullable = false)
	private String name;

	@NotNull
	@Size(min = 1, max = 2147483647)
	@Column(name = "thumb")
	private String thumb;

	public CategoryCarteItem() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

}
