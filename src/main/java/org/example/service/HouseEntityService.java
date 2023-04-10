package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.HouseDTO;
import org.example.model.HouseEntity;
import org.example.repository.HouseRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HouseEntityService {
    private final HouseRepository houseRepository;

    public void createUser (HouseDTO houseDTO) {
        var saveUser = createRecord(houseDTO);
        houseRepository.save(saveUser);
    }

    private HouseEntity createRecord (HouseDTO houseDTO) {
        return HouseEntity.builder().id(houseDTO.getId())
                .newNumberOfFloors(houseDTO.getNumberOfFloors())
                .numberOfShafts(houseDTO.getNumberOfShafts())
                //.orderSequenceOfStops(houseDTO.getOrderSequenceOfStops().toString())
                .build();
    }
}
