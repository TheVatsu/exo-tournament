package thomas.java.weapons;

public class GreatSword extends Weapons {
	
	private int nbAttack;

	public GreatSword() {
		super(12);
		this.nbAttack = 0;
	}
	
	public int getDamage(boolean isVicious,boolean isBerserk) {
		nbAttack++;
		if(nbAttack == 3) {
			nbAttack = 0;
			return 0;
		}
		int d = this.damage;
		if(isBerserk) {d *= 2;}
		if(isVicious) {d += VICIOUS_DAMAGE;}
		return d;
	}

	@Override
	public boolean isAxe() {
		return false;
	}

}
