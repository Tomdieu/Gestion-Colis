package com.example.tpinfo3055.demo.Colis;

import com.example.tpinfo3055.demo.Users.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Expedition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    private Colis colis;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User receiver;

    @Column(name = "register_date")
    private Date registerDate;

    @Column(name = "send_date")
    private Date sendDate;

    @Column(name = "recieve_date")
    private Date recieveDate;

    @Column(name = "withdraw_date")
    private String withdrawDate;

    public Expedition() {
    }

    public Expedition(int id, Colis colis, User sender, User receiver, Date registerDate, Date sendDate,
            Date recieveDate, String withdrawDate) {
        this.id = id;
        this.colis = colis;
        this.sender = sender;
        this.receiver = receiver;
        this.registerDate = registerDate;
        this.sendDate = sendDate;
        this.recieveDate = recieveDate;
        this.withdrawDate = withdrawDate;
    }

    public Expedition(Colis colis, User sender, User receiver, Date registerDate, Date sendDate, Date recieveDate,
            String withdrawDate) {
        this.colis = colis;
        this.sender = sender;
        this.receiver = receiver;
        this.registerDate = registerDate;
        this.sendDate = sendDate;
        this.recieveDate = recieveDate;
        this.withdrawDate = withdrawDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public Colis getColis() {
        return colis;
    }

    public void setColis(Colis colis) {
        this.colis = colis;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getRecieveDate() {
        return recieveDate;
    }

    public void setRecieveDate(Date recieveDate) {
        this.recieveDate = recieveDate;
    }

    public String getWithdrawDate() {
        return withdrawDate;
    }

    public void setWithdrawDate(String withdrawDate) {
        this.withdrawDate = withdrawDate;
    }

}
