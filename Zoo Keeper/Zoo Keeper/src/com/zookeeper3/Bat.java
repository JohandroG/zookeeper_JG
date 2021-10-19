package com.zookeeper3;
import com.zookeeper.*;

public class Bat extends Mammal{


	public Bat(int energy) {
		super(energy);
	}
	public Bat() {
		super(300);
	}
	
	
	public void fly() {
		System.out.println("ghoosssshhhhh");
		energy -= 50;
	}
	public void eatHumans() {
		System.out.println("yummy");
		energy += 25;
	}
	public void attackTown() {
		System.out.println("Grrrrrrr!! Heeeelppp! building falling XD"
				+ "");
		energy -= 100;
	}
}


