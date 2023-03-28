package com.example.bsb_ked.service;

import com.example.bsb_ked.domain.entity.Storage;
import com.example.bsb_ked.domain.repository.StorageRepository;
import com.example.bsb_ked.dto.StorageDto;
import com.example.bsb_ked.dto.TestsDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class StorageService {
    private StorageRepository storageRepository;

    public StorageService(StorageRepository storageRepository){
        this.storageRepository = storageRepository;
    }

    @Transactional
    public StorageDto getZ1Th(){

        Storage storage = storageRepository.getZone1Th().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }
    @Transactional
    public StorageDto getZ1Co2(){

        Storage storage = storageRepository.getZone1Co2().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }
    @Transactional
    public StorageDto getZ1Co(){

        Storage storage = storageRepository.getZone1Co().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }
    @Transactional
    public StorageDto getZ1H2(){

        Storage storage = storageRepository.getZone1H2().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }


    @Transactional
    public StorageDto getZ2Th(){

        Storage storage = storageRepository.getZone2Th().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }
    @Transactional
    public StorageDto getZ2Co2(){

        Storage storage = storageRepository.getZone2Co2().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }
    @Transactional
    public StorageDto getZ2Co(){

        Storage storage = storageRepository.getZone2Co().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }
    @Transactional
    public StorageDto getZ2H2(){

        Storage storage = storageRepository.getZone2H2().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }


    @Transactional
    public StorageDto getZ3Th(){

        Storage storage = storageRepository.getZone3Th().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }
    @Transactional
    public StorageDto getZ3Co2(){

        Storage storage = storageRepository.getZone3Co2().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }
    @Transactional
    public StorageDto getZ3Co(){

        Storage storage = storageRepository.getZone3Co().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }
    @Transactional
    public StorageDto getZ3H2(){

        Storage storage = storageRepository.getZone3H2().get(0);

        StorageDto storageDto = StorageDto.builder()
                .id(storage.getId())
                .senscode(storage.getSenscode())
                .data1(storage.getData1())
                .data2(storage.getData2())
                .position(storage.getPosition())
                .build();

        return storageDto;
    }

}
