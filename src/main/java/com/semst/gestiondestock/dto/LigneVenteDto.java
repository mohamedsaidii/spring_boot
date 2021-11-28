package com.semst.gestiondestock.dto;


import com.semst.gestiondestock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {
    private Integer id;

    private ArticleDto articleDto ;

    private BigDecimal quantite;

    private VentesDto ventesDto ;

    public LigneVenteDto fromEntity(LigneVente ligneVente)
    {
        if(ligneVente == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .build();

    }

    //category <--- categoryDto

    public LigneVente toEntity(LigneVenteDto ligneVenteDto)
    {
        if(ligneVenteDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());



        return ligneVente;

    }
}
