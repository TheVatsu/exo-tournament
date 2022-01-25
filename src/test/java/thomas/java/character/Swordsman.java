package thomas.java.character;

import thomas.java.weapons.Sword;

public class Swordsman extends Character{

	public Swordsman() {
		super(100,new Sword());
	}
	
	public Swordsman(String type) {
		super(100,new Sword(),type);
	}

	@Override
	public Swordsman equip(String equipment) {
		addEquipment(equipment);
		return this;
	}

}
