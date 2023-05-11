package com.example.bsb_ked.service;

import com.example.bsb_ked.domain.entity.Ess;
import com.example.bsb_ked.domain.entity.EssBat;
import com.example.bsb_ked.domain.repository.EssBatRepository;
import com.example.bsb_ked.domain.repository.EssRepository;
import com.example.bsb_ked.dto.EssBatDto;
import com.example.bsb_ked.dto.EssDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EssBatService {
    private EssBatRepository essBatRepository;

    public EssBatService(EssBatRepository essBatRepository){
        this.essBatRepository = essBatRepository;
    }

    @Transactional
    public EssBatDto getBatData(){

        EssBat essBat = essBatRepository.findAllByOrderByIdDesc().get(0);

        EssBatDto essBatDto = EssBatDto.builder()
                .id(essBat.getId())
                .voltage(essBat.getVoltage())
                .current(essBat.getCurrent())
                .charge(essBat.getCharge())
                .discharge(essBat.getDischarge())
                .build();

        return essBatDto;
    }

}
