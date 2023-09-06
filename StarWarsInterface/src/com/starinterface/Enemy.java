package com.starinterface;

public class Enemy implements Character{
	public Enemy() {
		// TODO Auto-generated constructor stub
	}
	public String weapon="Dark Saber";

	@Override
	public void attack() {
		System.out.println("The Enemy attacks you");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heal() {
		System.out.println("Enemy heals himself");
		// TODO Auto-generated method stub
		
	}
	public void drawWeapon() {
		System.out.println("draw out open");
	}

	@Override
	public void getWeapon() {
		// TODO Auto-generated method stub
		System.out.println("enemy weapon"+weapon);
	}

}
