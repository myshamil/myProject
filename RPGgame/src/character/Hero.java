package character;

public class Hero extends Character{
	public int Strength;
	public int Dexterity;
	public int Intelligence;
	public int Power;
	public int Defence;
	public int Experience = 0;
	public int Money = 0;
	
	public int attack() {
		return Power;
	}
	public void attacked(int sum) {
		if(Defence>=sum) {
			hp =  hp - 0;
		}else {
			hp = hp + Defence - sum;
		}
			
			
	}
}
