package com.gmm.patterns.factory;

//Muthu Mariyappan G

public class FactoryBuilder { // class which is used to create factory

	public static AbstractFactory getFactory(String factory) { // static method as there is no need for object of this class
		
		switch(factory.toUpperCase()) {
		case "MOON": // if factory type is moon return MoonFactory or PlanetFactory
			return new MoonFactory();
		case "PLANET":
			return new PlanetFactory();
		default:
			return null;
		}
	}
}