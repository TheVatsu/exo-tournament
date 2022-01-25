package thomas.java.character;

import thomas.java.weapons.Axe;

public class Viking extends Character{

	public Viking() {
		super(120,new Axe());
	}
	
	public Viking(String type) {
		super(120,new Axe(),type);
	}

	@Override
	public Viking equip(String equipment) {
		addEquipment(equipment);
		return this;
	}

}
