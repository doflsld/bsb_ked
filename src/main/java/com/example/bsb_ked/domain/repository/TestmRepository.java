package com.example.bsb_ked.domain.repository;

import com.example.bsb_ked.domain.entity.Testm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TestmRepository extends JpaRepository<Testm, Long>, JpaSpecificationExecutor<Testm>{

    List<Testm> findAllByOrderByIdDesc();
    List<Testm> findAllByOrderByIdAsc();

}
