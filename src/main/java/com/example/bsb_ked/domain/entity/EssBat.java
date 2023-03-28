package com.example.bsb_ked.domain.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.awt.datatransfer.FlavorEvent;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name="ess_bat_data")
public class EssBat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name="voltage")
    private Float voltage;

    @Column(name="current")
    private Float current;

    @Column(name="charge")
    private Float charge;

    @Column(name="discharge")
    private Float discharge;

    @Builder
    public EssBat(Long id, String senscode, Float voltage, Float current, Float charge, Float discharge){
        this.id = id;
        this.voltage = voltage;
        this.current = current;
        this.charge = charge;
        this.discharge = discharge;
    }

}
