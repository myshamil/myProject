package character;

public class Slime extends Monster{
	public int attack() {
		System.out.println("슬라임이 데미지를 " + Power + "주었습니다!");
		return power;
	}
}
