package org.example.populationservice.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MetaData {

    private String nameUz;
    private String nameRu;
    private String nameEn;
    private String valueUz;
    private String valueRu;
    private String valueEn;
}
