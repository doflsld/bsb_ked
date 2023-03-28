package com.example.bsb_ked.domain.repository;

import com.example.bsb_ked.domain.entity.Ess;
import com.example.bsb_ked.domain.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EssRepository extends JpaRepository<Ess, Long>, JpaSpecificationExecutor<Ess>{

    @Query("select e from Ess e where e.senscode = 'th' order by e.id desc")
    List<Ess> getEssTh();

    @Query("select e from Ess e where e.senscode = 'co' order by e.id desc")
    List<Ess> getEssCo();

    @Query("select e from Ess e where e.senscode = 'co2' order by e.id desc")
    List<Ess> getEssCo2();

    @Query("select e from Ess e where e.senscode = 'h2' order by e.id desc")
    List<Ess> getEssH2();

    @Query("select e from Ess e where e.senscode = 'voc' order by e.id desc")
    List<Ess> getEssVoc();

}
