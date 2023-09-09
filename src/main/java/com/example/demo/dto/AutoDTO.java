package com.example.demo.dto;

import com.example.demo.model.Auto;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
public class AutoDTO {
    private String marca;
    private String placas;


    public static AutoDTO build(Auto auto){
        return AutoDTO.builder()
                .marca(auto.getMarca())
                .placas(auto.getPlacas())
                .build();
    }
}
