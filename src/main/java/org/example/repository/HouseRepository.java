package org.example.repository;

import org.example.model.HouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface HouseRepository extends JpaRepository<HouseEntity, Long> {
}

