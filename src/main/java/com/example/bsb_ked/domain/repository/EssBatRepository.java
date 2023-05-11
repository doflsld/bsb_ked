package com.example.bsb_ked.domain.repository;

import com.example.bsb_ked.domain.entity.EssBat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface EssBatRepository extends JpaRepository<EssBat, Long>, JpaSpecificationExecutor<EssBat>{

    List<EssBat> findAllByOrderByIdDesc();

}
