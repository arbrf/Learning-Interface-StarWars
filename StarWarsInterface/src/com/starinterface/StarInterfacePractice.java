package com.starinterface;

import java.util.Random;

public class StarInterfacePractice {
public static Character summonCharacter() {
	Random rand=new Random();
	if(Math.abs(rand.nextInt())%2==0) {
		System.out.println(rand);
		System.out.println(rand.nextInt());
	return new Enemy();}
	else {
		return new Hero();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enemy dark=new Enemy();
		Hero luffyHero=new Hero();
		dark.attack();
		luffyHero.attack();
		dark.heal();
		luffyHero.heal();
		dark.getWeapon();
		luffyHero.getWeapon();
		Character spy=summonCharacter(); 
		spy.attack();
		spy.heal();
		StarInterfacePractice.summonCharacter();

	}

}
