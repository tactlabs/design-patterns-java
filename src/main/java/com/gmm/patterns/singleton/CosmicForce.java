package com.gmm.patterns.singleton;

//Muthu Mariyappan G

public class CosmicForce {
	
	private static CosmicForce instance;
	
	private CosmicForce() {}
	
	public static CosmicForce getInstance() {
		if(instance==null) 
			synchronized(CosmicForce.class) {
				if(instance==null) 
					instance = new CosmicForce();
			}	
		return instance;			
	}
}