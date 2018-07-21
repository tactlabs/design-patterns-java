package com.gmm.patterns.builder;

//Muthu Mariyappan G

public class Human { 
	// Human qualities - instance variables - default value is false;
	private boolean kind;
	private boolean generous;
	private boolean strong;
	private boolean fast;
	private boolean intelligent;
	private boolean wise;
	private boolean confident;
	private boolean honest;
	private boolean fair;
	private boolean loyal;
	private boolean courageous;
	
	//Giving package private as visibility to this constructor, so only builder can build objects of this type
	Human(boolean kind,boolean generous,boolean strong,boolean fast,boolean intelligent,
			boolean wise,boolean confident,boolean honest,boolean fair,boolean loyal,boolean courageous){
		this.kind = kind;
		this.generous = generous;
		this.strong = strong;
		this.fast = fast;
		this.intelligent = intelligent;
		this.wise = wise;
		this.confident = confident;
		this.honest = honest;
		this.fair = fair;
		this.loyal = loyal;
		this.courageous = courageous;
	}
	
	public boolean getKind() {
		return this.kind;
	}
	
	public boolean getGenerous() {
		return this.generous;
	}
	
	public boolean getStrong() {
		return this.strong;
	}
	
	public boolean getFast() {
		return this.fast;
	}
	
	public boolean getIntelligent() {
		return this.intelligent;
	}
	
	public boolean getWise() {
		return this.wise;
	}
	
	public boolean getConfident() {
		return this.confident;
	}
	
	public boolean getHonest() {
		return this.honest;
	}
	
	public boolean getFair() {
		return this.fair;
	}
	
	public boolean getLoyal() {
		return this.loyal;
	}
	
	public boolean getCourageous() {
		return this.courageous;
	}
	
	
	public String showCharacter() {
		return "\nCharacteristics\n"+
				"\n Kind : "+this.kind+
				"\nGenerous : "+this.generous+
				"\nStrong : "+this.strong+
				"\nFast : "+this.fast+
				"\nIntelligent : "+this.intelligent+
				"\nWise : "+this.wise+
				"\nConfident : "+this.confident+
				"\nHonest : "+this.honest+
				"\nFair : "+this.fair+
				"\nLoyal : "+this.loyal+
				"\nCourageous : "+this.courageous+"\n\n";
	}
	
	@Override
	public String toString() {
		return "\nCharacteristics\n"+
				"\nKind : "+this.kind+
				"\nGenerous : "+this.generous+
				"\nStrong : "+this.strong+
				"\nFast : "+this.fast+
				"\nIntelligent : "+this.intelligent+
				"\nWise : "+this.wise+
				"\nConfident : "+this.confident+
				"\nHonest : "+this.honest+
				"\nFair : "+this.fair+
				"\nLoyal : "+this.loyal+
				"\nCourageous : "+this.courageous+"\n\n";
	}
}