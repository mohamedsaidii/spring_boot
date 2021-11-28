package com.semst.gestiondestock.dto;


import com.semst.gestiondestock.model.Address;
import com.semst.gestiondestock.model.LigneVente;
import com.semst.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class UtilisateurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private Instant motDePasse;

    private AddressDto addressDto;

    private String photo;

    private EntrepriseDto entrepriseDto;

    private List<RolesDto> rolesDtos;
    public UtilisateurDto fromEntity(Utilisateur utilisateur)
    {
        if(utilisateur == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .email(utilisateur.getEmail())
                .motDePasse(utilisateur.getMotDePasse())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .photo(utilisateur.getPhoto())
                .build();

    }

    //category <--- categoryDto

    public Utilisateur toEntity(UtilisateurDto utilisateurDto)
    {
        if(utilisateurDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setDateDeNaissance(utilisateurDto.getDateDeNaissance());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setMotDePasse(utilisateurDto.getMotDePasse());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setPhoto(utilisateurDto.getPhoto());



        return utilisateur;

    }

}
