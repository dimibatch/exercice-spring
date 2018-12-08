package com.wildcodeschool.example.zoo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.example.zoo.entities.SpecificAnimal;
import com.wildcodeschool.example.zoo.repositories.AnimalRepository;



@Component
public class Outputter implements CommandLineRunner {
	
	private Logger LOG = LoggerFactory.getLogger("Zookeeper");
	
	@Autowired
	private AnimalRepository animalRepository;
	
	@Override
	public void run(String... args) throws Exception {
		LOG.info("******************");
		LOG.info("Objects in DB : " + animalRepository.count());

        // Crée un nouvel animal et l'enregistre dans la BDD
        SpecificAnimal animal1 = new SpecificAnimal("Lion");
        LOG.info("******************");
        LOG.info(animal1 + " has been created !");
        animalRepository.save(animal1);
        LOG.info(animal1 + " has been saved !");
        
        // 2e animal de créé
        SpecificAnimal animal2 = new SpecificAnimal("Snake");
        LOG.info("******************");
        LOG.info(animal2 + " has been created !");
        animalRepository.save(animal2);
        LOG.info(animal2 + " has been saved !");
        
        //Lecture du second animal
        SpecificAnimal tempAnimal = animalRepository.findById(2L).get();
        LOG.info("******************");
        LOG.info("The second animal is a " + tempAnimal.getSpecies());
        
        //Suppression du second animal
        animalRepository.deleteById(2L);
        
        LOG.info("******************");
        LOG.info("Animals in list are ");
        for(SpecificAnimal myAnimal : animalRepository.findAll()) {
            LOG.info(myAnimal.toString());
        };
        
        
    }
}
