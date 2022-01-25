package thomas.java.equipments;

public class Armor {
	private int damageReduction;
	private int damageProtection;
	
	public Armor() {
		this.damageReduction = 1;
		this.damageProtection = 3;
	}

	public int getDamageReduction() {
		return damageReduction;
	}

	public int getDamageProtection() {
		return damageProtection;
	}
	
}
