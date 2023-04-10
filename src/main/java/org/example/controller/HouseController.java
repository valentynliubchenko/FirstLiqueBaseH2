package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.HouseDTO;
import org.example.service.HouseEntityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HouseController {
    private final HouseEntityService houseEntityService;

    @PostMapping("/createHouse")
    public void createHouse (@RequestBody HouseDTO houseDTO) {
        houseEntityService.createUser(houseDTO);
    }

}
