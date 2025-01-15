package org.example.populationservice;

import org.example.populationservice.model.dto.DataDto;
import org.example.populationservice.model.dto.ResponseDto;
import org.example.populationservice.service.PopulationClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PopulationServiceApplication {

    public static void main(String[] args) {
       var context =  SpringApplication.run(PopulationServiceApplication.class, args);

        PopulationClientService bean = context.getBean(PopulationClientService.class);

        ResponseDto populationResponseDto = bean.getPopulationResponseDto();

        for (DataDto dataDto : populationResponseDto.getDataDtoList()) {
            System.out.println(dataDto);
        }

        for (DataDto dataDto : populationResponseDto.getDataDtoList()) {
            System.out.println(dataDto.getKlassifikatorRu());
        }

    }


}
