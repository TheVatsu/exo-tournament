package thomas.java.weapons;

public abstract class Weapons {
	
	protected int damage;
	protected final int VICIOUS_DAMAGE = 20;
	
	public Weapons(int damage) {
		this.damage = damage;
	}

	public int getDamage(boolean isVicious,boolean isBerserk) {
		int d = this.damage;
		if(isBerserk) {d *= 2;}
		if(isVicious) {d += VICIOUS_DAMAGE;}
		return d;
	}
	
	public abstract boolean isAxe();
	
	

}
