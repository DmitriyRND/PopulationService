package org.example.populationservice.service;

import lombok.AllArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.example.populationservice.model.dto.ResponseDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PopulationClientService {
    private final RestTemplate restTemplate;
    private String url = "https://api.siat.stat.uz/media/uploads/sdmx/sdmx_data_223.json";


    public ResponseDto getPopulationResponseDto(){


        List<ResponseDto> responseDtoList = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ResponseDto>>() {
                }
        ).getBody();
        return responseDtoList.get(0);

    }


}
