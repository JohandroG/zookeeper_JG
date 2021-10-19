package com.testZoo;
import com.zookeeper2.*;
import com.zookeeper3.*;

public class TestZoo {

	public static void main(String[] args) {
		
		Gorilla jorge = new Gorilla(150);
		
		jorge.displayEnergy();
		jorge.throwSomething();
		jorge.throwSomething();
		jorge.throwSomething();
		jorge.eatBanana();
		jorge.eatBanana();
		jorge.eatBanana();
		jorge.climb();
		jorge.displayEnergy();
		
		Bat batsilla = new Bat();
			
		batsilla.displayEnergy();
		batsilla.attackTown();
		batsilla.attackTown();
		batsilla.attackTown();
		batsilla.eatHumans();
		batsilla.eatHumans();
		batsilla.fly();
		batsilla.fly();
		batsilla.displayEnergy();
		
		
	}

}
