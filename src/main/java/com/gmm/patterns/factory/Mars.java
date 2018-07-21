package com.gmm.patterns.factory;

//Muthu Mariyappan G

class Mars extends Planet {

	public Mars(Long mass, Long radius) {
		super(mass, radius, "Mars");
	}

	public Mars() {
		super(2000000L, 8000L, "Mars");
	}
	
	public String getName() {
		return this.name;
	}
	
	public Long getMass() {
		return this.mass;
	}
	
	public Long getRadius() {
		return this.radius;
	}
	
	@Override
	public String toString() {
		return "Name : "+this.name+"\nMass : "+this.mass+"\nRadius : "+this.radius;
	}
}