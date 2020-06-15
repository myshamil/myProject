package map;
import java.util.Scanner;
public class PotionStore extends Map{

	int powerPotion = 100;
	int defensePotion = 100;
	int experiencePotion = 500;
	int hpPotion = 10;
	int mpPotion = 10;
	
	public int show (int Money, int number) {
		name = "포션 상점";
		Scanner sc = new Scanner(System.in);
		System.out.println(name + "에 방문하였습니다.");
		System.out.println("1. 힘 포션");
		System.out.println("2. 방어 포션");
		System.out.println("3. 경험치 포션");
		System.out.println("4. 체력 포션");
		System.out.println("5. 마력 포션");
		System.out.println("구매하실 물품을 선택해주세요.");
		System.out.println("++++++++++++++++++++");
		int num = sc.nextInt();
		if(num==1) {
			if(powerPotion <= Money) {
				System.out.println("힘 포션을 구매하셨습니다.");
				return Money - powerPotion;
			}
			
		}else if (num ==2) {
			if(defensePotion<= Money) {
				System.out.println();
				return Money - defensePotion;
			}
		}else if (num ==3) {
			if(experiencePotion<= Money) {
				System.out.println();
				return Money - experiencePotion;
			}
		}else if (num ==4) {
			if(hpPotion<= Money) {
				System.out.println();
				return Money - hpPotion;
			}
		}else if (num ==5) {
			if(mpPotion<= Money) {
				System.out.println();
				return Money - mpPotion;
			}
		}
		return -1; //돈이 부족? 부족한거랑 판단하는거 수정해야할듯

	}
}
