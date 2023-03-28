package com.example.bsb_ked.controller;

import com.example.bsb_ked.domain.entity.Testm;
import com.example.bsb_ked.dto.*;
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
    private StorageService storageService;
    private EventService eventService;
    private EssService essService;
    private EssBatService essBatService;

    public Controller(TestsService testsService, TestmService testmService, StorageService storageService, EventService eventService, EssService essService, EssBatService essBatService){
        this.testsService = testsService;
        this.testmService = testmService;
        this.storageService = storageService;
        this.eventService = eventService;
        this.essService = essService;
        this.essBatService = essBatService;
    }

    @GetMapping("/ess")
    public String ess(Model model){

        EssDto th = essService.getTh();
        model.addAttribute("th", th);
        EssDto co2 = essService.getCo();
        model.addAttribute("co2", co2);
        EssDto co = essService.getCo2();
        model.addAttribute("co", co);
        EssDto h2 = essService.getH2();
        model.addAttribute("h2", h2);
        EssDto voc = essService.getVoc();
        model.addAttribute("voc", voc);

        EssBatDto batDto = essBatService.getBatData();
        model.addAttribute("bat", batDto);

        return "ess_page";
    }

    @GetMapping("/storage")
    public String storage(Model model){
        StorageDto th1 = storageService.getZ1Th();
        model.addAttribute("th1", th1);
        StorageDto co21 = storageService.getZ1Co2();
        model.addAttribute("co21", co21);
        StorageDto co1 = storageService.getZ1Co();
        model.addAttribute("co1", co1);
        StorageDto h21 = storageService.getZ1H2();
        model.addAttribute("h21", h21);

        StorageDto th2 = storageService.getZ2Th();
        model.addAttribute("th2", th2);
        StorageDto co22 = storageService.getZ2Co2();
        model.addAttribute("co22", co22);
        StorageDto co2 = storageService.getZ2Co();
        model.addAttribute("co2", co2);
        StorageDto h22 = storageService.getZ2H2();
        model.addAttribute("h22", h22);

        StorageDto th3 = storageService.getZ3Th();
        model.addAttribute("th3", th3);
        StorageDto co23 = storageService.getZ3Co2();
        model.addAttribute("co23", co23);
        StorageDto co3 = storageService.getZ3Co();
        model.addAttribute("co3", co3);
        StorageDto h23 = storageService.getZ3H2();
        model.addAttribute("h23", h23);

        EventDto eventDto = eventService.getEvent();
        model.addAttribute("event", eventDto);

        return "storage_page";
    }

    @GetMapping("/")
    public String main(Model model) {
        return "ess_page";
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
