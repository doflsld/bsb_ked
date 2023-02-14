package com.example.bsb_ked.dto;

import com.example.bsb_ked.domain.entity.Status;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class StatusDto {
    private Long id;
    private String bat_num;
    private Integer status;
    private String regtime;

    public Status toEntity(){
        Status build = Status.builder()
                .id(id)
                .bat_num(bat_num)
                .status(status)
                .regtime(regtime)
                .build();
        return build;
    }

    @Builder
    public StatusDto(Long id, String bat_num, Integer status, String regtime){
        this.id = id;
        this.bat_num = bat_num;
        this.status = status;
        this.regtime = regtime;
    }

}
