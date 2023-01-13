package com.example.tpinfo3055.demo.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Retrait {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @OneToOne
    private Colis colis;
    
    @ManyToMany
    private User valideur;

    @Column(name="date_arriver")
    private Date dateArriver;

    @Column(name="date_retrait")
    private Date dateRetrait;

    

    public Retrait() {
    }

    public Retrait(Colis colis, User valideur, Date dateArriver, Date dateRetrait) {
        this.colis = colis;
        this.valideur = valideur;
        this.dateArriver = dateArriver;
        this.dateRetrait = dateRetrait;
    }

    public Retrait(long id, Colis colis, User valideur, Date dateArriver, Date dateRetrait) {
        this.id = id;
        this.colis = colis;
        this.valideur = valideur;
        this.dateArriver = dateArriver;
        this.dateRetrait = dateRetrait;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Colis getColis() {
        return colis;
    }

    public void setColis(Colis colis) {
        this.colis = colis;
    }

    public User getValideur() {
        return valideur;
    }

    public void setValideur(User valideur) {
        this.valideur = valideur;
    }

    public Date getDateArriver() {
        return dateArriver;
    }

    public void setDateArriver(Date dateArriver) {
        this.dateArriver = dateArriver;
    }

    public Date getDateRetrait() {
        return dateRetrait;
    }

    public void setDateRetrait(Date dateRetrait) {
        this.dateRetrait = dateRetrait;
    }


    
}
