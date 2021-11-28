package com.semst.gestiondestock.validator;

import com.semst.gestiondestock.dto.CategoryDto;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {


    public static List<String> validate(CategoryDto categoryDto)
    {
        List<String> errors = new ArrayList<>();

        if( categoryDto == null || categoryDto.getCode().isEmpty())
        {
            errors.add("Veuillez renseigner le code de la categorie");
        }
        return errors;

    }
}
