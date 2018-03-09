/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agilepays.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Ernane
 */
@Entity
@Table(name = "contact")
public class Contact extends GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -572836307884600162L;

	@Size(max = 2147483647)
	@Column(name = "email_primary")
	private String emailPrimary;

	@Size(max = 2147483647)
	@Column(name = "email_secondary")
	private String emailSecondary;

	@Size(max = 2147483647)
	@Column(name = "mobile_phone")
	private String mobilePhone;

	@Size(max = 2147483647)
	@Column(name = "comercial_phone")
	private String comercialPhone;

	@Size(max = 2147483647)
	@Column(name = "residential_phone")
	private String residentialPhone;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Contact() {
	}

	public String getEmailPrimary() {
		return emailPrimary;
	}

	public void setEmailPrimary(String emailPrimary) {
		this.emailPrimary = emailPrimary;
	}

	public String getEmailSecondary() {
		return emailSecondary;
	}

	public void setEmailSecondary(String emailSecondary) {
		this.emailSecondary = emailSecondary;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getComercialPhone() {
		return comercialPhone;
	}

	public void setComercialPhone(String comercialPhone) {
		this.comercialPhone = comercialPhone;
	}

	public String getResidentialPhone() {
		return residentialPhone;
	}

	public void setResidentialPhone(String residentialPhone) {
		this.residentialPhone = residentialPhone;
	}

}
