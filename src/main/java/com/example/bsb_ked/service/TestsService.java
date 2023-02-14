package com.example.bsb_ked.service;

import com.example.bsb_ked.domain.entity.Tests;
import com.example.bsb_ked.domain.repository.TestsRepository;
import com.example.bsb_ked.dto.TestsDto;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TestsService {
    private TestsRepository testsRepository;

    public TestsService(TestsRepository testsRepository){
        this.testsRepository = testsRepository;
    }

    @Transactional
//    @Scheduled(cron = "5 * * * * *")
    public TestsDto getTests(){

        Tests tests = testsRepository.findAllByOrderByIdDesc().get(0);

        TestsDto testsDto = TestsDto.builder()
                .id(tests.getId())
                .temp(tests.getTemp())
                .humi(tests.getHumi())
                .co(tests.getCo())
                .h2(tests.getH2())
                .regtime(tests.getRegtime())
                .build();

        return testsDto;
    }

}
