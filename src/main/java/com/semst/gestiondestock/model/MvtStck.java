package com.semst.gestiondestock.model;


import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "mvtStck")
public class MvtStck extends AbstractEntity {



    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "typemvt")
    private TypeMvtStk typeMvt;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article ;

}
