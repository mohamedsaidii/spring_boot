package com.semst.gestiondestock.Repository;

import com.semst.gestiondestock.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Ventes,Integer> {
}
