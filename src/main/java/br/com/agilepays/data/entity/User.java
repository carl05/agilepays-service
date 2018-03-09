/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agilepays.data.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author morpheus
 */
@Entity
@Table(name = "user_")
public class User extends GenericEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2412525994994369573L;

	@Size(max = 2147483647)
    @Column(name = "email")
    private String email;

    @Size(max = 2147483647)
    @Column(name = "passwd")
    private String passwd;

    @Basic(optional = false)
    @Size(min = 1, max = 2147483647)
    @Column(name = "name")
    private String name;

    @Basic(optional = false)
    @Size(min = 1, max = 2147483647)
    @Column(name = "nickname")
    private String nickname;

    @Size(max = 2147483647)
    @Column(name = "cpf")
    private String cpf;

    @Size(max = 2147483647)
    @Column(name = "rne")
    private String rne;

    @Size(max = 2147483647)
    @Column(name = "passport")
    private String passport;

    @Basic(optional = false)
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Size(max = 2147483647)
    @Column(name = "gender")
    private String gender;

    @Size(max = 2147483647)
    @Column(name = "image_link")
    private String imageLink;

    @Basic(optional = false)
    @Column(name = "login_trials")
    private int loginTrials;

    @OneToMany(mappedBy = "user")
    private List<Contact> contacts;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    private Address address;
    
    @OneToMany(mappedBy = "user")
    private List<SalesOrder> salesOrders;

    
    @ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "profile_user", joinColumns = @JoinColumn(name = "profile_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private List<Profile> profiles;

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRne() {
        return rne;
    }

    public void setRne(String rne) {
        this.rne = rne;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public int getLoginTrials() {
        return loginTrials;
    }

    public void setLoginTrials(int loginTrials) {
        this.loginTrials = loginTrials;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


    public List<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}

	public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

	public List<SalesOrder> getSalesOrders() {
		return salesOrders;
	}

	public void setSalesOrders(List<SalesOrder> salesOrders) {
		this.salesOrders = salesOrders;
	}
    

}
