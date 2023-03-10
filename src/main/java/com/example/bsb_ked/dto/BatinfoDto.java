
package com.example.bsb_ked.dto;

import com.example.bsb_ked.domain.entity.Batinfo;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BatinfoDto {
    private Long id;
    private String batnum;
    private Float voltage;
    private Float current;
    private String regtime;

    public Batinfo toEntity(){
        Batinfo build = Batinfo.builder()
                .id(id)
                .batnum(batnum)
                .voltage(voltage)
                .current(current)
                .regtime(regtime)
                .build();
        return build;
    }

    @Builder
    public BatinfoDto(Long id, String batnum, Float voltage, Float current, String regtime){
        this.id = id;
        this.batnum = batnum;
        this.voltage = voltage;
        this.current = current;
        this.regtime = regtime;
    }

}
