package com.semst.gestiondestock.dto;


import com.semst.gestiondestock.model.Address;
import com.semst.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AddressDto {
    private Integer id;

    private String adresse1;

    private String adresse2;

    private String codePostale;

    private String ville;

    private String pays;


    public AddressDto fromEntity(Address address)
    {
        if(address == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return AddressDto.builder()
                .adresse1(address.getAdresse1())
                .adresse2(address.getAdresse2())
                .codePostale(address.getCodePostale())
                .ville(address.getVille())
                .pays(address.getPays())
                .build();

    }

    //category <--- categoryDto

    public Address toEntity(AddressDto addressDto)
    {
        if(addressDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        Address address = new Address();
        address.setAdresse1(addressDto.getAdresse1());
        address.setAdresse2(addressDto.getAdresse2());
        address.setCodePostale(addressDto.getCodePostale());
        address.setPays(addressDto.getPays());
        address.setVille(addressDto.getVille());
        return address;

    }

}
