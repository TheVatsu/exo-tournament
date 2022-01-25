package thomas.java.weapons;

public class Sword extends Weapons{

	public Sword() {
		super(5);
	}

	@Override
	public boolean isAxe() {
		return false;
	}

}
