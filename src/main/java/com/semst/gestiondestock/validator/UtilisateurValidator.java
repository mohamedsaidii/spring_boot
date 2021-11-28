package com.semst.gestiondestock.validator;


import com.semst.gestiondestock.dto.UtilisateurDto;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public static List<String> validate(UtilisateurDto utilisateurDto)
    {
        List<String> errors = new ArrayList<>();
        if(utilisateurDto == null)
        {
            errors.add("Veuillez renseigner le nom de l'utilisateur ");
            errors.add("Veuillez renseigner le prenom de l'utilisateur");
            errors.add("Veuillez renseigner l'addresse de l'utilisateur");
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
            return errors;

        }


        if(utilisateurDto.getNom().isEmpty()){
            errors.add("Veuillez renseigner le nom de l'utilisateur ");
        }
        if(utilisateurDto.getPrenom().isEmpty()){
            errors.add("Veuillez renseigner le prenom de l'utilisateur");
        }
        if(utilisateurDto.getAddressDto()== null){
            errors.add("Veuillez renseigner l'addresse de l'utilisateur");
        }
        if(utilisateurDto.getMotDePasse()==null){
            errors.add("Veuillez renseigner le modepasse de l'utilisateur");
        }
        if(utilisateurDto.getAddressDto().getAdresse1().isEmpty()){
            errors.add("le champs addresse1  est obligatoire");
        }
        if(utilisateurDto.getAddressDto().getAdresse2().isEmpty()){
            errors.add("le champs addresse2 est obligatoire ");
        }
        if(utilisateurDto.getAddressDto().getVille().isEmpty()){
            errors.add("le champs ville est obligatoire ");
        }
        if(utilisateurDto.getAddressDto().getPays().isEmpty()){
            errors.add("le champs pays est obligatoire ");
        }
        if(utilisateurDto.getAddressDto().getCodePostale().isEmpty()){
            errors.add("le champs codePostale est obligatoire");
        }





        return errors;

    }
}
