package com.example.bsb_ked.domain.repository;

import com.example.bsb_ked.domain.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long>, JpaSpecificationExecutor<Event>{

    List<Event> findAllByOrderByIdDesc();

}
