package com.example.tpinfo3055.demo.Colis;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@DynamicUpdate
public class Colis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String description;

    @Column
    private String senderIdCard;

    @Column
    private String senderName;

    @Column
    private String receiverName;

    @Column
    private String recieverIdCard;

    @Column
    private String senderPhoneNumber;

    @Column
    private String receiverPhoneNumber;

    @Column
    private String state;

    public Colis() {
    }

    public Colis(long id, String description, String senderIdCard, String senderName, String receiverName,
            String recieverIdCard, String senderPhoneNumber, String receiverPhoneNumber, String state) {
        this.id = id;
        this.description = description;
        this.senderIdCard = senderIdCard;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.recieverIdCard = recieverIdCard;
        this.senderPhoneNumber = senderPhoneNumber;
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.state = state;
    }

    public Colis(String description, String senderIdCard, String senderName, String receiverName, String recieverIdCard,
            String senderPhoneNumber, String receiverPhoneNumber, String state) {
        this.description = description;
        this.senderIdCard = senderIdCard;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.recieverIdCard = recieverIdCard;
        this.senderPhoneNumber = senderPhoneNumber;
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSenderIdCard() {
        return senderIdCard;
    }

    public void setSenderIdCard(String senderIdCard) {
        this.senderIdCard = senderIdCard;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getRecieverIdCard() {
        return recieverIdCard;
    }

    public void setRecieverIdCard(String recieverIdCard) {
        this.recieverIdCard = recieverIdCard;
    }

    public String getSenderPhoneNumber() {
        return senderPhoneNumber;
    }

    public void setSenderPhoneNumber(String senderPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
