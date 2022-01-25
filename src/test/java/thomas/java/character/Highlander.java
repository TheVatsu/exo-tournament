package thomas.java.character;

import thomas.java.weapons.GreatSword;

public class Highlander extends Character {

	public Highlander() {
		super(150, new GreatSword());
	}
	
	public Highlander(String type) {
		super(150, new GreatSword(),type);
	}

	@Override
	public Character equip(String equipment) {
		addEquipment(equipment);
		return this;
	}

}
