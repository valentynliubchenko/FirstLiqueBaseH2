package org.example.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Builder
@Getter
public class HouseDTO {
    private Long id;
    private String numberOfFloors;
    private String numberOfShafts;
//    private List<SequenceOfStops> orderSequenceOfStops;

}
