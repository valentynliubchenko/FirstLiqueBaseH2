package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.example.dto.HouseDTO;
import org.example.dto.SequenceOfStops;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Table(name = "house")
@NoArgsConstructor
@AllArgsConstructor
public class HouseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "NUMBER_OF_FLOORS")
    private String numberOfFloors;

    @Column(name = "NUMBER_OF_SHAFTS")
    private String numberOfShafts;

    @Column(name = "order_Sequence_Of_Stops")
    private String orderSequenceOfStops;

    public HouseDTO toDTO () {
        SequenceOfStops sequenceOfStops = new SequenceOfStops();
        return HouseDTO.builder().id(id)
                .numberOfFloors(numberOfFloors)
                .numberOfShafts(numberOfShafts)
                //.orderSequenceOfStops(new ArrayList<>(List.of(sequenceOfStops)))
                .build();
    }

}
