package com.example.bsb_ked.domain.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name="event_data")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name="event")
    private Long event;

    @Builder
    public Event(Long id, Long event){
        this.id = id;
        this.event = event;
    }

}
