package map;

public class WeaponStore extends Map{
	int commonWeapon = 100;
	int commonShield = 100;
	
	public int shoe(int Money, int number) {
		name = "Weapon Store";
		System.out.println(name + "에서 구매 시도 중");
		if(number==1) {
			if(commonWeapon <= Money)
				return Money - commonWeapon;
		}
		if(number == 2) {
			if(commonShield <= Money)
				return Money - commonShield;
		}
		return -1;
	}

}
