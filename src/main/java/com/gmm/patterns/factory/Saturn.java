package com.gmm.patterns.factory;

//Muthu Mariyappan G

class Saturn extends Planet {

	public Saturn(Long mass, Long radius) {
		super(mass, radius, "Saturn");
		
	}

	public Saturn() {
		super(50000000L, 200000L, "Saturn");
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
