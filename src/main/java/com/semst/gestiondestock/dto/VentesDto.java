package com.semst.gestiondestock.dto;


import com.semst.gestiondestock.model.LigneVente;
import com.semst.gestiondestock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class VentesDto {
    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    public VentesDto fromEntity(Ventes ventes)
    {
        if(ventes == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return VentesDto.builder()
                .id(ventes.getId())
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .build();

    }

    //category <--- categoryDto

    public Ventes toEntity(VentesDto ventesDto)
    {
        if(ventesDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        Ventes ventes = new Ventes();
        ventes.setId(ventesDto.getId());
        ventes.setCommentaire(ventesDto.getCommentaire());
        ventes.setDateVente(ventesDto.getDateVente());
        ventes.setCode(ventesDto.getCode());



        return ventes;

    }
}
