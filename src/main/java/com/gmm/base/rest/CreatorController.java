package com.gmm.base.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gmm.patterns.singleton.*;
import com.gmm.patterns.immutable.*;
import com.gmm.patterns.factory.*;
import com.gmm.patterns.builder.*;


//Muthu Mariyappan G


@RestController
public class CreatorController {
	
	CosmicForce godForce;
	
	@RequestMapping(value="/CosmicForce") //Singleton creation
	public String getForce() {
		godForce = CosmicForce.getInstance();
		return "Cosmic Force discovered! Start the creation of universe!";
	}
	
	
	// when you are returning a user made object make sure it has getter methods for all fields - only then JSON conversion
	@RequestMapping(value="/create/Planet/{name}") //Factory and abstractFactory use
	public Planet getPlanet(@PathVariable String name) {
		
		return FactoryBuilder.getFactory("Planet").createPlanet(name.trim());
	}
	
	@RequestMapping(value="/create/Moon/{name}")
	public Moon getMoon(@PathVariable String name) {
		return FactoryBuilder.getFactory("Moon").createMoon("Fiery");
	}
	
	@RequestMapping(value="/create/Nature") // Immutable nature
	public Nature getNature() {
		return new Nature();
	}
	
	@RequestMapping(value="/create/Human") 
	public Human getHuman() { // HumanBuilder to build humans
		return new HumanBuilder().setKind(true).setConfident(true).setCourageous(true).setHonest(true)
				.setFair(true).build();
	}
}