package com.semst.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.semst.gestiondestock.model.Article;
import com.semst.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoryDto {
    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articleDtos;

    public CategoryDto fromEntity(Category category)
    {
        if(category == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();

    }

    //category <--- categoryDto

    public Category toEntity(CategoryDto categoryDto)
    {
        if(categoryDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        return category;

    }




}
