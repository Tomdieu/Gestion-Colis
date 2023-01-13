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
public class Expedition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @OneToOne
    private Colis colis;

    @ManyToMany
    private User valideurExp;

    @Column(name = "date_engistrez")
    private Date dateEnregistrer;

    @Column(name="date_envoie")
    private Date dateEnvoie;
    
}
