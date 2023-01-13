package com.example.tpinfo3055.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {

    @OneToOne
    private User user;

    @Column(name = "is_admin")
    private boolean isAdmin;
    
    @Column(name = "is_enreg")
    private boolean isEnreg;

    @Column(name="is_envoi")
    private boolean isEnvoi;

}
