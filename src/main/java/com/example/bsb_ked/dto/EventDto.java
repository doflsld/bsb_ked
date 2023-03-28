package com.example.bsb_ked.dto;

import com.example.bsb_ked.domain.entity.Ess;
import com.example.bsb_ked.domain.entity.Event;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class EventDto {
    private Long id;
    private Long event;

    public Event toEntity(){
        Event build = Event.builder()
                .id(id)
                .event(event)
                .build();
        return build;
    }

    @Builder
    public EventDto(Long id, Long event){
        this.id = id;
        this.event = event;
    }

}
