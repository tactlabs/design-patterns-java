package com.gmm.patterns.factory;

//Muthu Mariyappan G


// Factory of factories
public abstract class AbstractFactory { // abstract class to hold factory type
	public abstract Planet createPlanet(String planet); // functions different factories
	public abstract Moon createMoon(String moon);
}
