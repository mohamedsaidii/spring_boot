package com.semst.gestiondestock.model;

import lombok.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "typemvt")
public class TypeMvtStk extends AbstractEntity {
    @Column(name = "types")
    private String type;

}
