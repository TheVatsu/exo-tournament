package thomas.java.simulation;

import thomas.java.character.Character;
import thomas.java.equipments.Armor;
import thomas.java.equipments.Buckler;
import thomas.java.weapons.Weapons;

public class Blow {
	
	public static void blow(Character c1,Character c2) {
		Buckler b = c1.getBuckler();
		Weapons w = c2.getWeapon();
		Armor a = c2.getArmor();
		boolean protect = b != null;
		
		int damage = w.getDamage(c2.isVicious(),c2.isBerserk());
		
		if(damage > 0) {
			if(protect) {
				protect = b.useBuckler(w);
			}
			if(!protect) {
				if(a != null) {damage -= a.getDamageReduction();}
				c1.takeDamage(damage);
				c2.addBlow();
			}
		}
	}
}
