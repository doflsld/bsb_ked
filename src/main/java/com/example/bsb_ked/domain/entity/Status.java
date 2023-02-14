package com.example.bsb_ked.domain.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name="bat_status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String bat_num;

    @Column
    private Integer status;

    @Column
    private String regtime;

    @Builder
    public Status(Long id, String bat_num, Integer status, String regtime){
        this.id = id;
        this.bat_num = bat_num;
        this.status = status;
        this.regtime = regtime;
    }
}
