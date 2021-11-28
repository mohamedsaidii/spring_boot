package com.semst.gestiondestock.validator;


import com.semst.gestiondestock.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto articleDto) {
        List<String> errors = new ArrayList<>();
        if(articleDto == null)
        {
            errors.add("Veuillez renseigner le code de l'article");
            errors.add("Veuillez renseigner le PrixUnitaireTtc de l'article");
            errors.add("Veuillez renseigner le Designation de l'article");
            errors.add("Veuillez renseigner le TauxTva de l'article");
            errors.add("Veuillez renseigner le PrixUnitaireHt de l'article");
            errors.add("Veuillez renseigner le CategoryDto de l'article");
            return errors;
        }

        if(articleDto.getCodeArticle().isEmpty())
        {
            errors.add("Veuillez renseigner le code de l'article");
        }
        if(articleDto.getPrixUnitaireTtc()==null)
        {
            errors.add("Veuillez renseigner le PrixUnitaireTtc de l'article");
        }
        if(articleDto.getDesignation().isEmpty())
        {
            errors.add("Veuillez renseigner le Designation de l'article");
        }
        if(articleDto.getTauxTva() == null)
        {
            errors.add("Veuillez renseigner le TauxTva de l'article");
        }
        if(articleDto.getPrixUnitaireHt() == null)
        {
            errors.add("Veuillez renseigner le PrixUnitaireHt de l'article");
        }
        if(articleDto.getCategoryDto() == null)
        {
            errors.add("Veuillez renseigner le CategoryDto de l'article");
        }
        return errors;


    }

}