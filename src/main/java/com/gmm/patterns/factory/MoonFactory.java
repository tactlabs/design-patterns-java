package com.gmm.patterns.factory;

//Muthu Mariyappan G

class MoonFactory extends AbstractFactory{
	
	MoonFactory() {
		
	}
	
	@Override
	public Moon createMoon(String moonType) {
		
		moonType = moonType.toUpperCase();
		switch(moonType) {
		case "FIERY":
			return new FieryMoon();
		case "FROZEN":
			return new FrozenMoon();
		default:
			return null;
		}
	}


	@Override
	final public Planet createPlanet(String planet) {
		return null;
	}
}