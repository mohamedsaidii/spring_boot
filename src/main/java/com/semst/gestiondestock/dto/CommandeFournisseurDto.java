package com.semst.gestiondestock.dto;

import com.semst.gestiondestock.model.CommandeClient;
import com.semst.gestiondestock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeFournisseurDto {
    private Integer id;

    private String code;

    private Instant dateCommande;

    private FournisseurDto fournisseurDto;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurDtos;

    public CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur)
    {
        if(commandeFournisseur == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .build();

    }

    //category <--- categoryDto

    public CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto)
    {
        if(commandeFournisseurDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(commandeFournisseurDto.getId());
        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
        commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
        return commandeFournisseur;

    }
}
