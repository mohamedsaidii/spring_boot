package com.semst.gestiondestock.validator;

import com.semst.gestiondestock.dto.ClientDto;
import com.semst.gestiondestock.dto.FournisseurDto;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {
    public static List<String> validate(FournisseurDto fournisseurDto) {
        List<String> errors = new ArrayList<>();

        if(fournisseurDto == null)
        {
            errors.add("Veuillez renseigner le nom du fournisseur ");
            errors.add("Veuillez renseigner le prenom du fournisseur");
            errors.add("Veuillez renseigner le numTel  du fournisseur");
            errors.add("Veuillez renseigner le mail du fournisseur");
            return errors;
        }

        if(fournisseurDto.getNom().isEmpty())
        {
            errors.add("Veuillez renseigner le nom du fournisseur ");
        }
        if(fournisseurDto.getPrenom().isEmpty())
        {
            errors.add("Veuillez renseigner le prenom du fournisseur");
        }
        if(fournisseurDto.getNumTel().isEmpty())
        {
            errors.add("Veuillez renseigner le numTel  du fournisseur");
        }
        if(fournisseurDto.getMail().isEmpty())
        {
            errors.add("Veuillez renseigner le mail du fournisseur");
        }

        return  errors;
    }
}
