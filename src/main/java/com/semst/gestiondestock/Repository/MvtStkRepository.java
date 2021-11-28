package com.semst.gestiondestock.Repository;

import com.semst.gestiondestock.model.MvtStck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<MvtStck,Integer> {
}
