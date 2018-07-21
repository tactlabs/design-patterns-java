package com.gmm.patterns.factory;

//Muthu Mariyappan G

class FrozenMoon extends Moon {

	public FrozenMoon() {
		super(700000L,4500L);
	}
	
	public Long getMass() {
		return this.mass;
	}
	
	public Long getRadius() {
		return this.radius;
	}
}