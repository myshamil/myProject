package Controller;
import java.util.Scanner;
import character.*;
import map.*;

public class GameMain {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Hero hero = new Hero();
		
		System.out.println("----게임시작----");
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("번호를 입력해주세요. ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("선택되었습니다. ");
			hero = new Warrior();
			hero.Defence = 25;
			hero.Power = 15;
			hero.Dexterity = 10;
			hero.Intelligence = 5;
			hero.level = 1;
			hero.hp = 80;
			hero.mp = 5;
		}
		else if(num == 2) {
			System.out.println();
			
		}else if (num ==3) {
			System.out.println();
		}
		System.out.println("이름을 입력해주세요 : ");
		hero.name = sc.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임을 시작합니다.");
		
		while(true) {
			System.out.println("++++++++++++");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("++++++++++++");
		}
	}
}
