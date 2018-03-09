/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agilepays.data.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author morpheus
 */
@Entity
@Table(name = "sales_order_closure")
public class SalesOrderClosure extends GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6739796560153953971L;
	@Basic(optional = false)
	@NotNull
	@Column(name = "total")
	private double total;
	@Basic(optional = false)
	@NotNull
	@Column(name = "datetime_closure")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTimeClosure;
	@Size(max = 2147483647)
	@Column(name = "observation")
	private String observation;

	@OneToOne
	@JoinColumn(name = "payment_id")
	@RestResource(path = "salesOrderAddress", rel = "payment")
	private PaymentRegistry payment;

	public SalesOrderClosure() {
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the dateTimeClosure
	 */
	public Date getDateTimeClosure() {
		return dateTimeClosure;
	}

	/**
	 * @param dateTimeClosure
	 *            the dateTimeClosure to set
	 */
	public void setDateTimeClosure(Date dateTimeClosure) {
		this.dateTimeClosure = dateTimeClosure;
	}

	/**
	 * @return the observation
	 */
	public String getObservation() {
		return observation;
	}

	/**
	 * @param observation
	 *            the observation to set
	 */
	public void setObservation(String observation) {
		this.observation = observation;
	}

	/**
	 * @return the payment
	 */
	public PaymentRegistry getPayment() {
		return payment;
	}

	/**
	 * @param payment
	 *            the payment to set
	 */
	public void setPayment(PaymentRegistry payment) {
		this.payment = payment;
	}

}
