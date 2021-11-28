package com.semst.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.semst.gestiondestock.model.Client;
import com.semst.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeClientDto {
    private Integer id;

    private String code ;

    private Instant dateCommande;


    private ClientDto clientDto;



    @JsonIgnore
    private List<LigneCommandeClientDto> ligneCommandeClientDtos;

    public CommandeClientDto fromEntity(CommandeClient commandeClient)
    {
        if(commandeClient == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .build();

    }

    //category <--- categoryDto

    public CommandeClient toEntity(CommandeClientDto commandeClientDto)
    {
        if(commandeClientDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        return commandeClient;

    }
}
