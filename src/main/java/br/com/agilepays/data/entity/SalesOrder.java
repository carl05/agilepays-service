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
import javax.persistence.ManyToOne;
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
@Table(name = "sales_order")
public class SalesOrder extends GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 771867890546660705L;
	@Column(name = "order_number")
	private Integer orderNumber;
	@Size(max = 2147483647)
	@Column(name = "costumer_name")
	private String costumerName;
	@Basic(optional = false)
	@NotNull
	@Column(name = "datetime_begin")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTimeBegin;
	@Basic(optional = false)
	@NotNull
	@Column(name = "datetime_end")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTimeEnd;
	@Basic(optional = false)
	@NotNull
	@Column(name = "done")
	private Boolean done;
	@Size(max = 2147483647)
	@Column(name = "observation")
	private String observation;
	@Size(max = 2147483647)
	@Column(name = "description")
	private String description;
	@Column(name = "rating")
	private Integer rating;
	@Size(max = 2147483647)
	@Column(name = "commentary")
	private String commentary;

	@OneToOne
    @JoinColumn(name = "payment_id")
    @RestResource(path = "salesPayment", rel="payment")
    private PaymentRegistry payment;
	
	@ManyToOne
    @JoinColumn(name="user_id")
	private User user;

	public SalesOrder() {
	}

	/**
	 * @return the orderNumber
	 */
	public Integer getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the costumerName
	 */
	public String getCostumerName() {
		return costumerName;
	}

	/**
	 * @param costumerName
	 *            the costumerName to set
	 */
	public void setCostumerName(String costumerName) {
		this.costumerName = costumerName;
	}

	/**
	 * @return the dateTimeBegin
	 */
	public Date getDateTimeBegin() {
		return dateTimeBegin;
	}

	/**
	 * @param dateTimeBegin
	 *            the dateTimeBegin to set
	 */
	public void setDateTimeBegin(Date dateTimeBegin) {
		this.dateTimeBegin = dateTimeBegin;
	}

	/**
	 * @return the dateTimeEnd
	 */
	public Date getDateTimeEnd() {
		return dateTimeEnd;
	}

	/**
	 * @param dateTimeEnd
	 *            the dateTimeEnd to set
	 */
	public void setDateTimeEnd(Date dateTimeEnd) {
		this.dateTimeEnd = dateTimeEnd;
	}

	/**
	 * @return the done
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * @param done
	 *            the done to set
	 */
	public void setDone(boolean done) {
		this.done = done;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	/**
	 * @return the commentary
	 */
	public String getCommentary() {
		return commentary;
	}

	/**
	 * @param commentary
	 *            the commentary to set
	 */
	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

	public PaymentRegistry getPayment() {
		return payment;
	}

	public void setPayment(PaymentRegistry payment) {
		this.payment = payment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}
