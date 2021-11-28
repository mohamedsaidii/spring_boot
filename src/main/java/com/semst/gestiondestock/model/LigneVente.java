package com.semst.gestiondestock.model;


import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity {


    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article ;

    private BigDecimal quantite;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idVente")
    private Ventes vente ;

}
