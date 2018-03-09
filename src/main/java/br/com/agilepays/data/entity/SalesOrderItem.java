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
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author morpheus
 */
@Entity
@Table(name = "sales_order_item")
public class SalesOrderItem extends GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4264788047238708595L;
	@Size(max = 2147483647)
	@Column(name = "observation")
	private String observation;
	@Basic(optional = false)
	@NotNull
	@Column(name = "quantity")
	private int quantity;
	@Transient
	// @JoinColumn(name = "carte_itens", referencedColumnName = "id")
	// @ManyToOne(optional = false, fetch = FetchType.EAGER)
	private CarteItem carteItem;

	public SalesOrderItem() {
	}


	/**
	 * @return the observation
	 */
	public String getObservation() {
		return observation;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the carteItem
	 */
	public CarteItem getCarteItem() {
		return carteItem;
	}

	/**
	 * @param observation
	 *            the observation to set
	 */
	public void setObservation(String observation) {
		this.observation = observation;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param carteItem
	 *            the carteItem to set
	 */
	public void setCarteItem(CarteItem carteItem) {
		this.carteItem = carteItem;
	}

}
