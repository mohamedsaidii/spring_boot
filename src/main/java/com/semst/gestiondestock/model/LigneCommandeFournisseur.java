package com.semst.gestiondestock.model;


import lombok.*;


import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {



    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idfommandefournisseur")
    private CommandeFournisseur commandeFournisseur;
}
