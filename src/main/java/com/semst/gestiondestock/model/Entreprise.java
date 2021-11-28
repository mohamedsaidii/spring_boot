package com.semst.gestiondestock.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity{



    @Column(name = "nom")
    private String nom ;


    @Column(name = "description")
    private String description ;


    @Embedded
    private Address address;

    @Column(name = "codefiscale")
    private String codeFiscale ;


    @Column(name = "photo")
    private String photo ;

    @Column(name = "email")
    private String email ;

    @Column(name = "numtel")
    private String numTel ;

    @Column(name = "siteweb")
    private String siteWeb ;


    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;



}
