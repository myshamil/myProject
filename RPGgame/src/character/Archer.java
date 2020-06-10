package character;
import java.util.Scanner;
public class Archer extends Hero {
	public int attack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 일반공격");
		System.out.println("2. 애로우 리볼버");
		System.out.println("3. 멀티샷");
		System.out.println("공격 번호를 선택해주세요.");
		int num = sc.nextInt();
		
		int sum = 0;
		
		if(num==1) {
			sum+= level*15 + Power*10;
			System.out.println(sum + "의 데미지를 입혔습니다!");
			return sum;
		}
		else if(num==2) {
			sum+= level*15 + Power*10;
			System.out.println(sum + "의 데미지를 입혔습니다!");
			return sum;
		}else if(num==3) {
			sum+= level*15 + Power*10;
			System.out.println(sum + "의 데미지를 입혔습니다!");
			return sum;
		}else {
			System.out.println("올바른 번호를 선택해주세요.");
			return sum;
		}	
	}
	public void attacked(int sum) {
		if(Defence>=sum) {
			hp=hp-0;
		}else {
			hp = hp + Defence - sum;
		}
	}
}
