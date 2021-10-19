package com.zookeeper;

public class Mammal {
	 protected int energy = 100;
	 
	 
//	Constructor
	 public Mammal(int energy) {
		 this.energy = energy;
	 }
	 
	 
	 public void displayEnergy() {
		 System.out.println("The energy level is:" + this.energy);
	 } 
	 
//		Getters
		
	public int getEnergy(){	
		return this.energy;
	}
	
//	Setters
	
	public void Energy(int energy) {
	this.energy = energy;
}
			
}


