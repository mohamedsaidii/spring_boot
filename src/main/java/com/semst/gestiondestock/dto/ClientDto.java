package com.semst.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.semst.gestiondestock.model.Address;
import com.semst.gestiondestock.model.Article;
import com.semst.gestiondestock.model.Client;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Builder
@Data
public class ClientDto {

    private Integer id;

    private String nom;

    private  String prenom;

    private Address address;

    private String photo;

    private String mail ;

    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClientDtos;

    public ClientDto fromEntity(Client client)
    {
        if(client == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .photo(client.getPhoto())
                .numTel(client.getNumTel())
                .mail(client.getMail())
                .prenom(client.getPrenom())
                .address(client.getAddress())
                .build();

    }

    //category <--- categoryDto

    public Client toEntity(ClientDto clientDto)
    {
        if(clientDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setPhoto(clientDto.getPhoto());
        client.setAddress(clientDto.getAddress());
        client.setMail(clientDto.getMail());
        client.setNumTel(clientDto.getNumTel());
        return client;

    }
}
