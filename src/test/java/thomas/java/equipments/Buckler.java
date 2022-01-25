package thomas.java.equipments;

import thomas.java.weapons.Weapons;

public class Buckler {
	
	private int durability;
	private boolean isProtecting;
	
	public Buckler() {
		this.durability = 3;
		this.isProtecting = true;
	}
	
	public int getDurability() {
		return durability;
	}
	
	//return true if the buckler protect from the blow false if not
	public boolean useBuckler(Weapons weapon) {
		if(this.durability <= 0) {return false;}
		
		if(this.isProtecting && weapon.isAxe()) {
			this.durability --;
		}
		this.isProtecting = !this.isProtecting;
		return !this.isProtecting;
	}

}
