package com.gmm.patterns.factory;

//Muthu Mariyappan G

public abstract class Planet {
	protected Long mass;
	protected Long radius;
	protected String name;
	
	Planet(Long mass,Long radius,String name){
		this.mass = mass;
		this.radius = radius;
		this.name = name;
	}
	Planet(){}
	
	abstract String getName();
	abstract Long getMass();
	abstract Long getRadius();
}
