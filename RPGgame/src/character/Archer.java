
package character;
import java.util.Scanner;
public class Archer extends Hero {
	public int attack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Ϲݰ���");
		System.out.println("2. �ַο� ������");
		System.out.println("3. ��Ƽ��");
		System.out.println("���� ��ȣ�� �������ּ���.");
		int num = sc.nextInt();
		
		int sum = 0;
		
		if(num==1) {
			sum+= level*15 + Power*10;
			System.out.println(sum + "�� �������� �������ϴ�!");
			return sum;
		}
		else if(num==2) {
			sum+= level*15 + Power*10;
			System.out.println(sum + "�� �������� �������ϴ�!");
			return sum;
		}else if(num==3) {
			sum+= level*15 + Power*10;
			System.out.println(sum + "�� �������� �������ϴ�!");
			return sum;
		}else {
			System.out.println("�ùٸ� ��ȣ�� �������ּ���.");
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
