package com.semst.gestiondestock.dto;

import com.semst.gestiondestock.model.Address;
import com.semst.gestiondestock.model.Article;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private BigDecimal prixUnitaireHt;

    private String photo;

    private CategoryDto categoryDto;

    public ArticleDto fromEntity(Article article)
    {
        if(article == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .tauxTva(article.getTauxTva())
                .photo(article.getPhoto())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .build();

    }

    //category <--- categoryDto

    public Article toEntity(ArticleDto articleDto)
    {
        if(articleDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        Article article = new Article();
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setId(articleDto.getId());
        article.setPhoto(articleDto.getPhoto());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setTauxTva(articleDto.getTauxTva());
        return article;

    }
}
