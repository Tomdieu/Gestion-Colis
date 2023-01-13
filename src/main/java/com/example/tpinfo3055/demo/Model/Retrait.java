package com.example.tpinfo3055.demo.Model;

import java.time.LocalDateTime;

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
    private LocalDateTime dateArriver;

    @Column(name="date_retrait")
    private LocalDateTime dateRetrait;

    

    public Retrait() {
    }

    public Retrait(Colis colis, User valideur, LocalDateTime dateArriver, LocalDateTime dateRetrait) {
        this.colis = colis;
        this.valideur = valideur;
        this.dateArriver = dateArriver;
        this.dateRetrait = dateRetrait;
    }

    public Retrait(long id, Colis colis, User valideur, LocalDateTime dateArriver, LocalDateTime dateRetrait) {
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

    public LocalDateTime getDateArriver() {
        return dateArriver;
    }

    public void setDateArriver(LocalDateTime dateArriver) {
        this.dateArriver = dateArriver;
    }

    public LocalDateTime getDateRetrait() {
        return dateRetrait;
    }

    public void setDateRetrait(LocalDateTime dateRetrait) {
        this.dateRetrait = dateRetrait;
    }


    
}
