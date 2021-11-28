package com.semst.gestiondestock.dto;

import com.semst.gestiondestock.model.Address;
import com.semst.gestiondestock.model.CommandeFournisseur;
import com.semst.gestiondestock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class FournisseurDto {
    private Integer id;

    private String nom;

    private  String prenom;

    private Address address;

    private String photo;

    private String mail ;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;

    public FournisseurDto fromEntity(Fournisseur fournisseur)
    {
        if(fournisseur == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .address(fournisseur.getAddress())
                .mail(fournisseur.getMail())
                .nom(fournisseur.getNom())
                .photo(fournisseur.getPhoto())
                .numTel(fournisseur.getNumTel())
                .prenom(fournisseur.getPrenom())
                .build();

    }

    //category <--- categoryDto

    public Fournisseur toEntity(FournisseurDto fournisseurDto)
    {
        if(fournisseurDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setAddress(fournisseurDto.getAddress());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setNumTel(fournisseurDto.getNumTel());
        return fournisseur;

    }
}
