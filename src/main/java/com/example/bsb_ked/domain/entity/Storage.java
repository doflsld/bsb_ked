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
@Table(name="storage_data")
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name="senscode")
    private String senscode;

    @Column(name="data1")
    private Float data1;

    @Column(name="data2")
    private Float data2;

    @Column(name="position")
    private String position;

    @Builder
    public Storage(Long id, String senscode, Float data1, Float data2, String position){
        this.id = id;
        this.senscode = senscode;
        this.data1 = data1;
        this.data2 = data2;
        this.position = position;
    }

}
