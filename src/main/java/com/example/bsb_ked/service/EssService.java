package com.example.bsb_ked.service;

import com.example.bsb_ked.domain.entity.Ess;
import com.example.bsb_ked.domain.entity.Storage;
import com.example.bsb_ked.domain.repository.EssRepository;
import com.example.bsb_ked.domain.repository.StorageRepository;
import com.example.bsb_ked.dto.EssDto;
import com.example.bsb_ked.dto.StorageDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EssService {
    private EssRepository essRepository;

    public EssService(EssRepository essRepository){
        this.essRepository = essRepository;
    }

    @Transactional
    public EssDto getTh(){

        Ess ess = essRepository.getEssTh().get(0);

        EssDto essDto = EssDto.builder()
                .id(ess.getId())
                .senscode(ess.getSenscode())
                .data1(ess.getData1())
                .data2(ess.getData2())
                .build();

        return essDto;
    }

    @Transactional
    public EssDto getCo(){

        Ess ess = essRepository.getEssCo().get(0);

        EssDto essDto = EssDto.builder()
                .id(ess.getId())
                .senscode(ess.getSenscode())
                .data1(ess.getData1())
                .data2(ess.getData2())
                .build();

        return essDto;
    }

    @Transactional
    public EssDto getCo2(){

        Ess ess = essRepository.getEssCo2().get(0);

        EssDto essDto = EssDto.builder()
                .id(ess.getId())
                .senscode(ess.getSenscode())
                .data1(ess.getData1())
                .data2(ess.getData2())
                .build();

        return essDto;
    }

    @Transactional
    public EssDto getH2(){

        Ess ess = essRepository.getEssH2().get(0);

        EssDto essDto = EssDto.builder()
                .id(ess.getId())
                .senscode(ess.getSenscode())
                .data1(ess.getData1())
                .data2(ess.getData2())
                .build();

        return essDto;
    }

    @Transactional
    public EssDto getVoc(){

        Ess ess = essRepository.getEssVoc().get(0);

        EssDto essDto = EssDto.builder()
                .id(ess.getId())
                .senscode(ess.getSenscode())
                .data1(ess.getData1())
                .data2(ess.getData2())
                .build();

        return essDto;
    }

}
