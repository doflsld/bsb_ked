package com.example.bsb_ked.service;

import com.example.bsb_ked.domain.entity.Batinfo;
import com.example.bsb_ked.domain.entity.Status;
import com.example.bsb_ked.domain.repository.BatinfoRepository;
import com.example.bsb_ked.domain.repository.StatusRepository;
import com.example.bsb_ked.dto.BatinfoDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BatinfoService {

    private BatinfoRepository batinfoRepository;

    public BatinfoService(BatinfoRepository batinfoRepository){this.batinfoRepository = batinfoRepository;}

    @Transactional()
    public List<Batinfo> getBatinfo(String batnum){
        List<Batinfo> batinfo = batinfoRepository.findAllByBatnum(batnum);
        return batinfo;
    }

    @Transactional
    public List<String> getBatnum(){
        List<String> batnums = batinfoRepository.findName();
        return batnums;
    }

}
