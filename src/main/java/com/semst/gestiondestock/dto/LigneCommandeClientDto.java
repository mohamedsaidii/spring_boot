package com.semst.gestiondestock.dto;


import com.semst.gestiondestock.model.Entreprise;
import com.semst.gestiondestock.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeClientDto {
    private Integer id;

    private ArticleDto articleDto;

    private CommandeClientDto commandeClientDto;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient)
    {
        if(ligneCommandeClient == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .build();

    }

    //category <--- categoryDto

    public LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto)
    {
        if(ligneCommandeClientDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(ligneCommandeClientDto.getId());
        ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDto.getPrixUnitaire());
        ligneCommandeClient.setQuantite(ligneCommandeClientDto.getQuantite());



        return ligneCommandeClient;

    }
}
