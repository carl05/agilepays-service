/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agilepays.data.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author ernane
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class GenericEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "enabled", columnDefinition = "boolean default true")
//    private Boolean enabled;
//    @Column(name = "dt_create")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtCreate;
//    @Column(name = "dt_update")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtUpdate;
//    @Column(name = "dt_delete")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dtDelete;
//    @Size(max = 2147483647)
//    @Column(name = "fk_user_delete")
//    private String fkUserDelete;

//	public Boolean getEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(Boolean enabled) {
//        this.enabled = enabled;
//    }
//
//    public Date getDtCreate() {
//        return dtCreate;
//    }
//
//    public void setDtCreate(Date dtCreate) {
//        this.dtCreate = dtCreate;
//    }
//
//    public Date getDtUpdate() {
//        return dtUpdate;
//    }
//
//    public void setDtUpdate(Date dtUpdate) {
//        this.dtUpdate = dtUpdate;
//    }
//
//    public Date getDtDelete() {
//        return dtDelete;
//    }
//
//    public void setDtDelete(Date dtDelete) {
//        this.dtDelete = dtDelete;
//    }
//
//    public String getFkUserDelete() {
//        return fkUserDelete;
//    }
//
//    public void setFkUserDelete(String fkUserDelete) {
//        this.fkUserDelete = fkUserDelete;
//    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

}
