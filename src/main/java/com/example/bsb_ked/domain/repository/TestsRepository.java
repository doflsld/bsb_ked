package com.example.bsb_ked.domain.repository;

import com.example.bsb_ked.domain.entity.Tests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TestsRepository extends JpaRepository<Tests, Long>, JpaSpecificationExecutor<Tests>{

    List<Tests> findAllByOrderByIdDesc();

}
