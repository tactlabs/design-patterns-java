package com.gmm.patterns.factory;

//Muthu Mariyappan G

class FieryMoon extends Moon {

	public FieryMoon() {
		super(5000000L,3000L);
	}
	
	public Long getMass() {
		return this.mass;
	}
	
	public Long getRadius() {
		return this.radius;
	}
}