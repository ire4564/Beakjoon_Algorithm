import java.util.Scanner;

public class P_1065 {
	public static void main(String args[]) {
		int oneNum = 0;
		//int check[] = new int[100];
		//int index = 0;
		
		Scanner scan = new Scanner(System.in);
		int lang = scan.nextInt();
		
		for(int num=1; num<=lang; num++) { //1���� �Է¹��� ���ڱ��� ����
			if(num>0 && num<100) { //���� num�� 1~98���̶�� �Ѽ��̴� ���
				++oneNum;
			} else if(num>=100) { //num�� ���ڸ� ���� ������ (���ڸ� ����)
				//�ڸ��� ������ ���̰� üũ�ϱ�
				if(devide100(num) == 1) {
					++oneNum;
					//check[index] = num;
					//++index;
				}	
			}
		}
		System.out.println(oneNum);
		
	}
	//���ڸ��ϋ�
	public static int devide100(int num) {
		int num100, num10, num1; //õ�� �ڸ� �����ڸ� �����ڸ� ���� �ڸ�
		int A, B;
		
		num100 = num/100;
		num10 = (num % 100) / 10; 
		num1 = num - ((num100 * 100) + (num10 * 10));
		
		if((num100 == num1) && (num100 != num10)) {
			return 0;
		} else { //���� �ڸ��� ���ڰ� �ƴϸ�
		
		A = num1- num10; //1�� ����
		B = num10 - num100; //2�� ����
		
		if(A<0 && B<0) {
			A = A * -1;
			B = B * -1;
		} else if(A<0) { //�����̸� ó��
			A = A * -1;
		} else if(B<0) {
			B = B * -1;
		}
		
		if(A==B) {
			return 1; //�ΰ��� ���̰� ���� ��
		}else {
			return 0; //���̰� ���� ������ 0�� ����
			}
		}
	}

}


