package Controller;
import java.util.Scanner;
import character.*;
import map.*;

public class GameMain {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Hero hero = new Hero();
		
		System.out.println("----���ӽ���----");
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("��ȣ�� �Է����ּ���. ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("���õǾ����ϴ�. ");
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
		System.out.println("�̸��� �Է����ּ��� : ");
		hero.name = sc.next();
		System.out.println("�̸��� �ԷµǾ����ϴ�.");
		System.out.println("������ �����մϴ�.");
		
		while(true) {
			System.out.println("++++++++++++");
			System.out.println("���� �̸� : "+ hero.name);
			System.out.println("���� "+ hero.level);
			System.out.println("��" + hero.Power);
			System.out.println("����" + hero.Defence);
			System.out.println("HP "+ hero.hp);
			System.out.println("MP " + hero.mp);
			System.out.println("�� "+ hero.Money+"���");
			System.out.println("����ġ" + hero.Experience);
			System.out.println("++++++++++++");
			System.out.println();
			System.out.println("������ ��Ҹ� �������ּ���.");
			System.out.println("1. �����");
			System.out.println("2. �������");
			System.out.println("3. ���� ����");
			num = sc.nextInt();
			
			if(num ==1) {
				
			}
		}
	}
}
