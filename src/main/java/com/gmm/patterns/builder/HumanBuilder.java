package com.gmm.patterns.builder;

// Muthu Mariyappan G


/*Builder class to build humans with different qualities*/
public class HumanBuilder { // This class alone is public in this package, ensuring object creation by only using this builder
	//Fields are same as human
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
	
	
	// Each setters used to build human bit by bit and each return humanbuilder
	public HumanBuilder setKind(boolean kind) {
		this.kind = kind;
		return this;
	}
	
	public HumanBuilder setGenerous(boolean generous) {
		this.generous = generous;
		return this;
	}
	
	public HumanBuilder setStrong(boolean strong) {
		this.strong = strong;
		return this;
	}
	
	public HumanBuilder setFast(boolean fast) {
		this.fast = fast;
		return this;
	}
	
	public HumanBuilder setIntelligent(boolean intelligent) {
		this.intelligent = intelligent;
		return this;
	}
	
	public HumanBuilder setWise(boolean wise) {
		this.wise = wise;
		return this;
	}
	
	public HumanBuilder setConfident(boolean confident) {
		this.confident = confident;
		return this;
	}
	
	public HumanBuilder setHonest(boolean honest) {
		this.honest = honest;
		return this;
	}
	
	public HumanBuilder setFair(boolean fair) {
		this.fair = fair;
		return this;
	}
	
	public HumanBuilder setLoyal(boolean loyal) {
		this.loyal = loyal;
		return this;
	}
	
	public HumanBuilder setCourageous(boolean courageous) {
		this.courageous = courageous;
		return this;
	}
	
	// build method to create Human using all the set fields/characteristics
	public Human build() {
		return new Human(this.kind,this.generous,this.strong,this.fast,this.intelligent,
				this.wise,this.confident,this.honest,this.fair,this.loyal,this.courageous);
	}
}