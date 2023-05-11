package com.example.bsb_ked.controller;

import com.example.bsb_ked.dto.*;
import com.example.bsb_ked.service.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class dataController {

    private TestsService testsService;
    private EssService essService;

    public dataController(TestsService testsService, EssService essService){
        this.testsService = testsService;
        this.essService = essService;
    }

    @GetMapping("/data")
    public TestsDto data(){
        return testsService.getTests();
    }

    @GetMapping("/data1")
    public EssDto data1(){
        return essService.getTh();
    }

}
