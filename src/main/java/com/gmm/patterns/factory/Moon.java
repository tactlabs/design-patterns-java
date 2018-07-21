package com.gmm.patterns.factory;

//Muthu Mariyappan G

public abstract class Moon {
	protected Long mass;
	protected Long radius;
	
	Moon(Long mass,Long radius){
		this.mass = mass;
		this.radius = radius;
	}
	
	public abstract Long getMass();
	
	public abstract Long getRadius();
}