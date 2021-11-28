package com.semst.gestiondestock.Repository;

import com.semst.gestiondestock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository< CommandeClient,Integer> {
}
