package com.wildcodeschool.example.zoo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SpecificAnimal {
	
	public SpecificAnimal() {
		
	}
	
	public SpecificAnimal(String species) {
		this.species = species;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String species;
	
	@Override
    public String toString() { 
        return "User [id=" + id + ", species=" + species + "]";
    }                    

    public Long getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}