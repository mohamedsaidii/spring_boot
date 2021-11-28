package com.semst.gestiondestock.dto;


import com.semst.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDto {
    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateurDto;
    public RolesDto fromEntity(Roles roles)
    {
        if(roles == null)
        {
            return null;
            //to do throw an exception
        }
        //category ---> categoryDto
        return RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .build();

    }

    //category <--- categoryDto

    public Roles toEntity(RolesDto rolesDto)
    {
        if(rolesDto == null)
        {
            return null;
            //to do throw an exception
        }

        // on fait comme ca car on ne peux pas acceder a l'id avec builder
        //category <--- categoryDto
        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRoleName(rolesDto.getRoleName());



        return roles;

    }
}
