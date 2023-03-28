package com.example.bsb_ked.dto;

import com.example.bsb_ked.domain.entity.Ess;
import com.example.bsb_ked.domain.entity.EssBat;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class EssBatDto {
    private Long id;
    private Float voltage;
    private Float current;
    private Float charge;
    private Float discharge;

    public EssBat toEntity(){
        EssBat build = EssBat.builder()
                .id(id)
                .voltage(voltage)
                .current(current)
                .charge(charge)
                .discharge(discharge)
                .build();
        return build;
    }

    @Builder
    public EssBatDto(Long id, Float voltage, Float current, Float charge, Float discharge){
        this.id = id;
        this.voltage = voltage;
        this.current = current;
        this.charge = charge;
        this.discharge = discharge;
    }

}
