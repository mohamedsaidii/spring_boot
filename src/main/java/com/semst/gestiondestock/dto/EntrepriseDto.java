package com.semst.gestiondestock.dto;


import com.semst.gestiondestock.model.Address;
import com.semst.gestiondestock.model.CommandeFournisseur;
import com.semst.gestiondestock.model.Entreprise;
import com.semst.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Builder
@Data
public class EntrepriseDto {
    private Integer id;

    private String nom ;

    private String description ;

    private Address address;

    private String codeFiscale ;

    private String photo ;

    private String email ;

    private String numTel ;

    private String siteWeb ;

    private List<UtilisateurDto> utilisateurDtos;


    public EntrepriseDto fromEntity(Entreprise entreprise)
    {
        if(entreprise == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .email(entreprise.getEmail())
                .photo(entreprise.getPhoto())
                .siteWeb(entreprise.getSiteWeb())
                .description(entreprise.getDescription())
                .address(entreprise.getAddress())
                .codeFiscale(entreprise.getCodeFiscale())
                .numTel(entreprise.getNumTel())
                .build();

    }

    //category <--- categoryDto

    public Entreprise toEntity(EntrepriseDto entrepriseDto)
    {
        if(entrepriseDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setAddress(entrepriseDto.getAddress());
        entreprise.setCodeFiscale(entrepriseDto.getCodeFiscale());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setNumTel(entrepriseDto.getNumTel());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setSiteWeb(entrepriseDto.getSiteWeb());



        return entreprise;

    }

}
