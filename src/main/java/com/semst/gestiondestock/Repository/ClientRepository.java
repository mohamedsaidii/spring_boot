package com.semst.gestiondestock.Repository;

import com.semst.gestiondestock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository< Client,Integer> {
}
