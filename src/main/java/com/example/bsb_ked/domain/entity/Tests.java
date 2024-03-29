package com.example.bsb_ked.domain.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name="bat_data")
public class Tests {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name="temp")
    private Float temp;

    @Column(name="humi")
    private Float humi;

    @Column(name="co")
    private Float co;

    @Column(name="nh3")
    private Float h2;

    @Column
    private Date regtime;

    @Builder
    public Tests(Long id, Float temp, Float humi, Float co, Float h2, Date regtime){
        this.id = id;
        this.temp = temp;
        this.humi = humi;
        this.co = co;
        this.h2 = h2;
        this.regtime = regtime;
    }

}
