package org.example.populationservice.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class ResponseDto {


    @JsonProperty("metadata")
    List<MetaData> metaDataList = new ArrayList<MetaData>();

    @JsonProperty("data")
    List<DataDto> dataDtoList = new ArrayList<DataDto>();



}
