package com.example.bsb_ked.controller;

import com.example.bsb_ked.dto.*;
import com.example.bsb_ked.service.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class dataController {

    private TestsService testsService;

    public dataController(TestsService testsService){
        this.testsService = testsService;
    }

    @GetMapping("/data")
    public TestsDto data(){
        return testsService.getTests();
    }
}
