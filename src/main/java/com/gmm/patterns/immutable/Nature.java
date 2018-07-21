package com.gmm.patterns.immutable;

// Muthu Mariyappan G

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*Nature will be immutable - meaning it will not be corrupted by humans no more*/ 
public class Nature {
	
	// Making all fields private and final so no state changes
	private final String type; 
	private final List<String> oceans;
	private final List<String> mountains;
	private final List<String> seasons;
	
	
	// Initial values only via constrcutors
	public Nature() {
		this.type = "Balanced";
		this.oceans = new ArrayList<>(Arrays.asList("Pacific", "Indian", "Arctic", "Arabic"));
		this.mountains = new ArrayList<>(Arrays.asList("Himalayas","Everest"));
		this.seasons = new ArrayList<>(Arrays.asList("Summer","Winter","Autumn","Spring"));
		
	}
	
	public Nature(String type,List<String> oceans,List<String> mountains,List<String> seasons) {
		this.type = type;
		this.oceans = oceans;
		this.mountains = mountains;
		this.seasons = seasons;
	}
	
	// No setters only getters
	
	public String getType() {
		return this.type;
	}
	
	// creating and returning new list instead of original list since list is mutable, string is immutable so immutability not affected
	public List<String> getOceans(){
		return new ArrayList<>(this.oceans);
	}
	
	public List<String> getMountains(){
		return new ArrayList<>(this.mountains);
	}
	
	public List<String> getSeason(){
		return new ArrayList<>(this.seasons);
	}
}