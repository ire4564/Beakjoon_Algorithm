import java.util.Scanner;

public class P2609 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		//�ִ� ����� GCD, ��Ŭ���� ȣ�� �˰���
		
		int a2 = a;
		int b2 = b;
		
		while(b2 > 0) {
			int temp = b2;
			b2 = a2%b2;
			a2 = temp;
		}
		int gcd = a2;
		//�ּ� ����� LCM, �� ���� �� / �� ���� �ִ� �����
		int lcm = a*b/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
