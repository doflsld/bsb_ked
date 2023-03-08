package com.example.bsb_ked.controller;

import com.example.bsb_ked.domain.entity.Testm;
import com.example.bsb_ked.dto.TestmDto;
import com.example.bsb_ked.dto.TestsDto;
import com.example.bsb_ked.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
@Slf4j
public class Controller {

    private TestsService testsService;
    private TestmService testmService;

    public Controller(TestsService testsService, TestmService testmService){
        this.testsService = testsService;
        this.testmService = testmService;
    }

    @GetMapping("/ess")
    public String ess(Model model){
        return "ess";
    }

    @GetMapping("/storage")
    public String storage(Model model){
        return "storage";
    }

    @GetMapping("/")
    public String main(Model model) {
        return "ess";
    }

    @GetMapping("/transport")
    public String transport(Model model) {
        TestsDto testsDto = testsService.getTests();
        model.addAttribute("tests", testsDto);
        TestmDto testmDto = testmService.getTestm();
        model.addAttribute("testm", testmDto);
        List<Testm> testmDtos = testmService.getTest();
        model.addAttribute("test", testmDtos);
        return "transport";
    }

}
