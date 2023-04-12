package model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonAnyGetter;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Data
public class SequenceOfStops {
    private List<Integer> stopFloors;
    private Integer direction;
}
