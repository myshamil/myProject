package map;
import java.util.Scanner;
public class PotionStore extends Map{

	int powerPotion = 100;
	int defensePotion = 100;
	int experiencePotion = 500;
	int hpPotion = 10;
	int mpPotion = 10;
	
	public int show (int Money, int number) {
		name = "���� ����";
		Scanner sc = new Scanner(System.in);
		System.out.println(name + "�� �湮�Ͽ����ϴ�.");
		System.out.println("1. �� ����");
		System.out.println("2. ��� ����");
		System.out.println("3. ����ġ ����");
		System.out.println("4. ü�� ����");
		System.out.println("5. ���� ����");
		System.out.println("�����Ͻ� ��ǰ�� �������ּ���.");
		System.out.println("++++++++++++++++++++");
		int num = sc.nextInt();
		if(num==1) {
			if(powerPotion <= Money) {
				System.out.println("�� ������ �����ϼ̽��ϴ�.");
				
			}
		}
		

	}
}
