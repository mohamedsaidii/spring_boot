package com.semst.gestiondestock.validator;

import com.semst.gestiondestock.dto.EntrepriseDto;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public static List<String> validate(EntrepriseDto entrepriseDto) {
        List<String> errors = new ArrayList<>();

        if(entrepriseDto == null)
        {
            errors.add("Veuillez renseigner le nom du client ");
            errors.add("Veuillez renseigner le photo du client");
            errors.add("Veuillez renseigner le numTel  du client");
            errors.add("Veuillez renseigner le siteweb du client");
            errors.add("Veuillez renseigner le mail du client");
            errors.add("Veuillez renseigner l'address du client");
            errors.add("Veuillez renseigner la description du client");
            errors.add("Veuillez renseigner le code Fiscale du client");
            return errors;
        }

        if(entrepriseDto.getNom().isEmpty())
        {
            errors.add("Veuillez renseigner le nom du client ");
        }
        if(entrepriseDto.getPhoto().isEmpty())
        {
            errors.add("Veuillez renseigner le photo du client");
        }
        if(entrepriseDto.getNumTel().isEmpty())
        {
            errors.add("Veuillez renseigner le numTel  du client");
        }
        if(entrepriseDto.getSiteWeb().isEmpty())
        {
            errors.add("Veuillez renseigner le siteweb du client");
        }
        if(entrepriseDto.getEmail().isEmpty())
        {
            errors.add("Veuillez renseigner le mail du client");
        }
        if(entrepriseDto.getAddress()==null)
        {
            errors.add("Veuillez renseigner l'address du client");
        }
        if(entrepriseDto.getDescription().isEmpty())
        {
            errors.add("Veuillez renseigner la description du client");
        }
        if(entrepriseDto.getCodeFiscale().isEmpty())
        {
            errors.add("Veuillez renseigner le code Fiscale du client");
        }

        return  errors;
    }
}
