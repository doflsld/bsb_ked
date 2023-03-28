package com.example.bsb_ked.dto;

import com.example.bsb_ked.domain.entity.Ess;
import com.example.bsb_ked.domain.entity.Storage;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class StorageDto {
    private Long id;
    private String senscode;
    private Float data1;
    private Float data2;
    private String position;

    public Storage toEntity(){
        Storage build = Storage.builder()
                .id(id)
                .senscode(senscode)
                .data1(data1)
                .data2(data2)
                .position(position)
                .build();
        return build;
    }

    @Builder
    public StorageDto(Long id, String senscode, Float data1, Float data2, String position){
        this.id = id;
        this.senscode = senscode;
        this.data1 = data1;
        this.data2 = data2;
        this.position = position;
    }

}
