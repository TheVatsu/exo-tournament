package thomas.java.character;

import thomas.java.equipments.Armor;
import thomas.java.equipments.Buckler;
import thomas.java.simulation.Blow;
import thomas.java.weapons.Axe;
import thomas.java.weapons.GreatSword;
import thomas.java.weapons.Sword;
import thomas.java.weapons.Weapons;

public abstract class Character {
	
	private int initialHitPoints,hitPoints,nbBlow;
	private Weapons w;
	private Buckler b;
	private Armor a;
	
	private boolean isVicious,isVeteran;
	
	public Character(int hp,Weapons w) {
		this.hitPoints = hp;
		this.initialHitPoints = hp;
		this.nbBlow = 0;
		this.w = w;
		this.b = null;
		this.a = null;
		this.isVicious = false;
		this.isVeteran = false;
	}
	
	public Character(int hp,Weapons w,String type) {
		this.hitPoints = hp;
		this.initialHitPoints = hp;
		this.nbBlow = 0;
		this.w = w;
		this.b = null;
		this.a = null;
		this.isVicious = type.equals("Vicious");
		this.isVeteran = type.equals("Veteran");
		
	}
	
	public boolean isBerserk() {
		double p = (double)hitPoints/(double)initialHitPoints;
		return this.isVeteran && p < 0.3; 
	}
	
	public boolean isVicious() {
		return this.isVicious && nbBlow < 2; 
	}

	public void engage(Character c) {
		boolean turn = true;
		while(this.hitPoints() > 0 && c.hitPoints() > 0) {
			if(turn) {
				Blow.blow(c,this);
			}else {
				Blow.blow(this,c);
			}
			turn = !turn;
		}
	}
	
	public abstract Character equip(String equipment);
	
	protected void addEquipment(String equipment) {
		switch(equipment) {
			case "buckler" : this.b = new Buckler();break;
			case "armor" : this.a = new Armor();break;
			case "axe" : this.w = new Axe();break;
			case "great sword" : this.w = new GreatSword();break;
			case "sword" : this.w = new Sword();break;
		}
	}


	public void takeDamage(int damage) {
		if(this.a != null) {
			damage -= this.a.getDamageProtection();
		}
		if(damage > 0) {
			this.hitPoints -= damage;
			if(this.hitPoints < 0) {
				this.hitPoints = 0;
			}
		}
	}
	
	//SETTERS
	public void addBlow() {
		this.nbBlow ++;
	}
	
	//GETTERS
	
	public int hitPoints() {
		return hitPoints;
	}
	
	public Weapons getWeapon() {
		return w;
	}
	
	public Buckler getBuckler() {
		return b;
	}

	public Armor getArmor() {
		return a;
	}
}
