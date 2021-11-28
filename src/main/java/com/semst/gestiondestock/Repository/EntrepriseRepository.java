package com.semst.gestiondestock.Repository;

import com.semst.gestiondestock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository< Entreprise,Integer> {
}
