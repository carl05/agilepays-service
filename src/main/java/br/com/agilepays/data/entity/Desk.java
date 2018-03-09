/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agilepays.data.entity;

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
@Table(name = "desk")
public class Desk extends GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5740339495083087944L;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2147483647)
	@Column(name = "name")
	private String name;
	@Size(max = 2147483647)
	@Column(name = "description")
	private String description;
	@Basic(optional = false)
	@NotNull
	@Column(name = "t_floor")
	private int t_floor;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2147483647)
	@Column(name = "qr_code")
	private String qrCode;

	public Desk() {
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getT_floor() {
		return t_floor;
	}

	public void setT_floor(int t_floor) {
		this.t_floor = t_floor;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (this.getId() != null ? this.getId().hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Table)) {
			return false;
		}
		Desk other = (Desk) object;
		if ((this.getId() == null && other.getId() != null)
				|| (this.getId() != null && !this.getId().equals(other.getId()))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Desk{" + "id=" + this.getId() + ", name=" + getName() + ", description=" + getDescription()
				+ ", t_floor=" + getT_floor() + ", qrCode=" + qrCode + '}';
	}

}
