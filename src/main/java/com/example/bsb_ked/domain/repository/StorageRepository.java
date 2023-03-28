package com.example.bsb_ked.domain.repository;

import com.example.bsb_ked.domain.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface StorageRepository extends JpaRepository<Storage, Long>, JpaSpecificationExecutor<Storage>{

    @Query("select s from Storage s where s.senscode = 'th' and s.position = 'zone1' order by s.id desc")
    List<Storage> getZone1Th();

    @Query("select s from Storage s where s.senscode = 'co2' and s.position = 'zone1' order by s.id desc")
    List<Storage> getZone1Co2();

    @Query("select s from Storage s where s.senscode = 'co' and s.position = 'zone1' order by s.id desc")
    List<Storage> getZone1Co();

    @Query("select s from Storage s where s.senscode = 'h2' and s.position = 'zone1' order by s.id desc")
    List<Storage> getZone1H2();

    @Query("select s from Storage s where s.senscode = 'th' and s.position = 'zone2' order by s.id desc")
    List<Storage> getZone2Th();

    @Query("select s from Storage s where s.senscode = 'co2' and s.position = 'zone2' order by s.id desc")
    List<Storage> getZone2Co2();

    @Query("select s from Storage s where s.senscode = 'co' and s.position = 'zone2' order by s.id desc")
    List<Storage> getZone2Co();

    @Query("select s from Storage s where s.senscode = 'h2' and s.position = 'zone2' order by s.id desc")
    List<Storage> getZone2H2();

    @Query("select s from Storage s where s.senscode = 'th' and s.position = 'zone3' order by s.id desc")
    List<Storage> getZone3Th();

    @Query("select s from Storage s where s.senscode = 'co2' and s.position = 'zone3' order by s.id desc")
    List<Storage> getZone3Co2();

    @Query("select s from Storage s where s.senscode = 'co' and s.position = 'zone3' order by s.id desc")
    List<Storage> getZone3Co();

    @Query("select s from Storage s where s.senscode = 'h2' and s.position = 'zone3' order by s.id desc")
    List<Storage> getZone3H2();

}
