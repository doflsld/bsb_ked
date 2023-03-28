package com.example.bsb_ked.dto;

import com.example.bsb_ked.domain.entity.Ess;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class EssDto {
    private Long id;
    private String senscode;
    private Float data1;
    private Float data2;

    public Ess toEntity(){
        Ess build = Ess.builder()
                .id(id)
                .senscode(senscode)
                .data1(data1)
                .data2(data2)
                .build();
        return build;
    }

    @Builder
    public EssDto(Long id, String senscode, Float data1, Float data2){
        this.id = id;
        this.senscode = senscode;
        this.data1 = data1;
        this.data2 = data2;
    }

}
