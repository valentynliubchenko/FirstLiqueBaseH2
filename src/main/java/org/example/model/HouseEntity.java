package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.example.dto.HouseDTO;
import org.example.dto.SequenceOfStops;

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

    @Column(name = "NUMBEROFFLOORS")
    private String newNumberOfFloors;

    @Column(name = "NUMBEROFSHAFTS")
    private String numberOfShafts;

    @Column(name = "ORDERSEQUENCEOFSTOPS")
    private String orderSequenceOfStops;

    public HouseDTO toDTO () {
        SequenceOfStops sequenceOfStops = new SequenceOfStops();
        return HouseDTO.builder().id(id)
                .numberOfFloors(newNumberOfFloors)
                .numberOfShafts(numberOfShafts)
                //.orderSequenceOfStops(new ArrayList<>(List.of(sequenceOfStops)))
                .build();
    }

}
