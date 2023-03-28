package com.example.bsb_ked.service;

import com.example.bsb_ked.domain.entity.Event;
import com.example.bsb_ked.domain.entity.Tests;
import com.example.bsb_ked.domain.repository.EventRepository;
import com.example.bsb_ked.domain.repository.TestsRepository;
import com.example.bsb_ked.dto.EventDto;
import com.example.bsb_ked.dto.TestsDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EventService {
    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Transactional
    public EventDto getEvent(){

        Event event = eventRepository.findAllByOrderByIdDesc().get(0);

        EventDto eventDto = EventDto.builder()
                .id(event.getId())
                .event(event.getEvent())
                .build();

        return eventDto;
    }

}
