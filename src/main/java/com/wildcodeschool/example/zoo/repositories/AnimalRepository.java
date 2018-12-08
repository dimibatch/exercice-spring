package com.wildcodeschool.example.zoo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.example.zoo.entities.SpecificAnimal;


@Repository
public interface AnimalRepository extends JpaRepository<SpecificAnimal, Long> {
}
