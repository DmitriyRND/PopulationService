package org.example.populationservice.model.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class DataDto {
    @JsonProperty("Klassifikator")
    private String klassifikatorUz;

    @JsonProperty("Klassifikator_ru")
    private String klassifikatorRu;

    @JsonProperty("Klassifikator_en")
    private String klassifikatorEn;

    private Map<Integer, Integer> yearlyData = new HashMap<>();



    // JsonAnySetter для маппинга оставшихся данных (годы и значения)
    @JsonAnySetter
    public void setYearlyData(String key, Integer value) {
        try {
            // Преобразуем ключ в год
            int year = Integer.parseInt(key);
            this.yearlyData.put(year, value);
        } catch (NumberFormatException ignored) {
            // Игнорируем поля, которые не являются годами
        }
    }

}
