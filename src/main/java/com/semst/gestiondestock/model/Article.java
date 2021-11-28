package com.semst.gestiondestock.model;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "article")
public class Article extends AbstractEntity {


    @Column(name = "codearticle")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name = "tauxtva")
    private BigDecimal tauxTva;

    @Column(name = "prixUnitairettc")
    private BigDecimal prixUnitaireTtc;

    @Column(name = "prixUnitaireht")
    private BigDecimal prixUnitaireHt;

    @Column(name = "photo")
    private String photo;

    @Column(name = "identreprise")
    private Integer idEntreprise;
    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;


}
