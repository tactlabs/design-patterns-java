package com.gmm.patterns.factory;

//Muthu Mariyappan G

class Earth extends Planet {
	
	public Earth(Long mass, Long radius) {
		super(mass, radius,"Earth");
	}
	
	public Earth() {
		super(3000000L,12000L,"Earth");
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
