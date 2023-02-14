package com.example.bsb_ked.dto;

import com.example.bsb_ked.domain.entity.Testm;
import lombok.*;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TestmDto {
    private Long id;
    private BigDecimal lat;
    private BigDecimal lng;
    private Date regtime;

    public Testm toEntity(){
        Testm build = Testm.builder()
                .id(id)
                .lat(lat)
                .lng(lng)
                .regtime(regtime)
                .build();
        return build;
    }

    @Builder
    public TestmDto(Long id, BigDecimal lat, BigDecimal lng, Date regtime){
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.regtime = regtime;
    }

}
