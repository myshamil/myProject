package character;

public class Monster extends Character {
	public int Power;
	public int Defence;
	public int Money;
	public int Experience;
	
	public int attack() {
		return Power;
	}
	public void attacked(int sum) {
		if(Defence>=sum)
			hp=hp-0;
		else {
			hp = hp+ Defence - sum;
		}
	}
}
