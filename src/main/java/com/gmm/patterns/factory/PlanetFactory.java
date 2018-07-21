package com.gmm.patterns.factory;

//Muthu Mariyappan G

class PlanetFactory extends AbstractFactory{
	
	PlanetFactory() {
		
	}
	@Override
	public Planet createPlanet(String planetType) {
		
		planetType = planetType.toUpperCase();
		switch(planetType) {
		case "EARTH":
			return new Earth();
		case "MARS":
			return new Mars();
		case "SATURN":
			return new Saturn();
		default:
			return null;
		}
	}

	@Override
	final public Moon createMoon(String moon) {
		return null;
	}
}