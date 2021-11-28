package com.semst.gestiondestock.dto;
import com.semst.gestiondestock.dto.ArticleDto;
import com.semst.gestiondestock.model.MvtStck;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStckDto {
    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;


    private ArticleDto articleDto ;

    public MvtStckDto fromEntity(MvtStck mvtStck)
    {
        if(mvtStck == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return MvtStckDto.builder()
                .id(mvtStck.getId())
                .quantite(mvtStck.getQuantite())
                .dateMvt(mvtStck.getDateMvt())
                .build();
    }

    //category <--- categoryDto

    public MvtStck toEntity(MvtStckDto mvtStckDto)
    {
        if(mvtStckDto == null)
        {
            return null;
            //to do throw an exception
        }
        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        MvtStck mvtStck = new MvtStck();
        mvtStck.setId(mvtStckDto.getId());
        mvtStck.setQuantite(mvtStckDto.getQuantite());
        mvtStck.setDateMvt(mvtStckDto.getDateMvt());
        return mvtStck;

    }
}
