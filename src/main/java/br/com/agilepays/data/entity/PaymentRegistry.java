/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agilepays.data.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author morpheus
 */
@Entity
@Table(name = "payment_registry")
public class PaymentRegistry extends GenericEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * PaymentRegistry intent.
     */
    @Column
    private String intent;
    /**
     * ID of the cart to execute the payment.
     */
    @Column
    private String cart;
    /**
     * The state of the payment, authorization, or order transaction. The value
     * is:<ul><li><code>created</code>. The transaction was successfully
     * created.</li><li><code>approved</code>. The buyer approved the
     * transaction.</li><li><code>failed</code>. The transaction request
     * failed.</li></ul>
     */
    @Column
    private String state;
    /**
     * PayPal generated identifier for the merchant's payment experience
     * profile. Refer to
     * [this](https://developer.paypal.com/docs/api/#payment-experience) link to
     * create experience profile ID.
     */
    @Column
    private String experienceProfileId;
    /**
     * free-form field for the use of clients to pass in a message to the payer
     */
    @Column
    private String noteToPayer;
    /**
     * Failure reason code returned when the payment failed for some valid
     * reasons.
     */
    @Column
    private String failureReason;
    /**
     * PaymentRegistry creation time as defined in [RFC 3339 Section
 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
     */
    @Column
    private String createTime;
    /**
     * PaymentRegistry update time as defined in [RFC 3339 Section
 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
     */
    @Column
    private String updateTime;

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getExperienceProfileId() {
        return experienceProfileId;
    }

    public void setExperienceProfileId(String experienceProfileId) {
        this.experienceProfileId = experienceProfileId;
    }

    public String getNoteToPayer() {
        return noteToPayer;
    }

    public void setNoteToPayer(String noteToPayer) {
        this.noteToPayer = noteToPayer;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.getId());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaymentRegistry other = (PaymentRegistry) obj;
        if (!Objects.equals(this.getId(), other.getId())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "id=" + this.getId() + ", intent=" + intent + ", cart=" + cart + ", state=" + state + ", experienceProfileId=" + experienceProfileId + ", noteToPayer=" + noteToPayer + ", failureReason=" + failureReason + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
}
