package com.starinterface;

public class Hero implements Character{
	public String weapon="Light Saber";
	

	public Hero() {
		super();
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("The Hero attacks the enemy");
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println("The Hero heals you");
		
	}
	@Override
	public void getWeapon() {
		// TODO Auto-generated method stub
		System.out.println("Heroweapon"+weapon);
	}

}
