package com.example.bsb_ked.service;

import com.example.bsb_ked.domain.entity.Testm;
import com.example.bsb_ked.domain.repository.TestmRepository;
import com.example.bsb_ked.dto.TestmDto;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TestmService {
    private TestmRepository testmRepository;

    public TestmService(TestmRepository testmRepository){
        this.testmRepository = testmRepository;
    }

    @Transactional
//    @Scheduled(cron = "5 * * * * *")
    public TestmDto getTestm(){

        Testm testm = testmRepository.findAllByOrderByIdDesc().get(0);

        TestmDto testmDto = TestmDto.builder()
                .id(testm.getId())
                .lat(testm.getLat())
                .lng(testm.getLng())
                .build();

        return testmDto;
    }

    public List<Testm> getTest(){

        List<Testm> testm = testmRepository.findAllByOrderByIdAsc();

        return testm;
    }

}
