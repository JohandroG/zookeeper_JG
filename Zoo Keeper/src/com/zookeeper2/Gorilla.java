package com.zookeeper2;
import com.zookeeper.*;

public class Gorilla extends Mammal {
	
	public Gorilla(int energy) {
		super(energy);
	}
	public Gorilla() {
		super(100);
	}
	
	
	public void throwSomething() {
		System.out.println("The gorilla has trown something");
		energy -= 5;
	}
	public void eatBanana() {
		System.out.println("eating bananas");
		energy += 10;
	}
	public void climb() {
		System.out.println("climbing stuff here");
		energy -= 10;
	}
}
