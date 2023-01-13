package com.example.tpinfo3055.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Colis {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private long id;

    @Column
    private String description;

    @Column(name = "nom_client")
    private String nomClient;

    @Column(name = "ncni_client")
    private String cniClient;

    @Column(name = "nom_destinataire")
    private String nomDestinataire;

    @Column(name="ncni_destinataire")
    private String cniDestinataire;

    @Column(name="contact_client")
    private String contactClient;

    @Column
    private String etat;

    @Column(name = "code_colis")
    private String code;

    
    public Colis() {
    }

    

    public Colis(String description, String nomClient, String cniClient, String nomDestinataire, String cniDestinataire,
            String contactClient, String etat, String code) {
        this.description = description;
        this.nomClient = nomClient;
        this.cniClient = cniClient;
        this.nomDestinataire = nomDestinataire;
        this.cniDestinataire = cniDestinataire;
        this.contactClient = contactClient;
        this.etat = etat;
        this.code = code;
    }



    public Colis(long id, String description, String nomClient, String cniClient, String nomDestinataire,
            String cniDestinataire, String contactClient, String etat, String code) {
        this.id = id;
        this.description = description;
        this.nomClient = nomClient;
        this.cniClient = cniClient;
        this.nomDestinataire = nomDestinataire;
        this.cniDestinataire = cniDestinataire;
        this.contactClient = contactClient;
        this.etat = etat;
        this.code = code;
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



    public String getNomClient() {
        return nomClient;
    }



    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }



    public String getCniClient() {
        return cniClient;
    }



    public void setCniClient(String cniClient) {
        this.cniClient = cniClient;
    }



    public String getNomDestinataire() {
        return nomDestinataire;
    }



    public void setNomDestinataire(String nomDestinataire) {
        this.nomDestinataire = nomDestinataire;
    }



    public String getCniDestinataire() {
        return cniDestinataire;
    }



    public void setCniDestinataire(String cniDestinataire) {
        this.cniDestinataire = cniDestinataire;
    }



    public String getContactClient() {
        return contactClient;
    }



    public void setContactClient(String contactClient) {
        this.contactClient = contactClient;
    }



    public String getEtat() {
        return etat;
    }



    public void setEtat(String etat) {
        this.etat = etat;
    }



    public String getCode() {
        return code;
    }



    public void setCode(String code) {
        this.code = code;
    }

    

    

}
