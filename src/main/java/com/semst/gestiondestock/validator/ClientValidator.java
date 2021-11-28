package com.semst.gestiondestock.validator;


import com.semst.gestiondestock.dto.ClientDto;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(ClientDto clientDto) {
        List<String> errors = new ArrayList<>();

          if(clientDto == null)
          {
              errors.add("Veuillez renseigner le nom du client ");
              errors.add("Veuillez renseigner le prenom du client");
              errors.add("Veuillez renseigner le numTel  du client");
              errors.add("Veuillez renseigner le mail du client");
              return errors;
          }

          if(clientDto.getNom().isEmpty())
          {
              errors.add("Veuillez renseigner le nom du client ");
          }
          if(clientDto.getPrenom().isEmpty())
            {
                errors.add("Veuillez renseigner le prenom du client");
            }
          if(clientDto.getNumTel().isEmpty())
            {
                errors.add("Veuillez renseigner le numTel  du client");
            }
          if(clientDto.getMail().isEmpty())
            {
                errors.add("Veuillez renseigner le mail du client");
            }

        return  errors;
    }
}
