import java.util.*;

public class P_1978 {
	public static void main(String args[]){
		int checks = 0;
		
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt(); //��� �Է¹�������

		for(int i=0; i<howMany; i++) {
			int numbers = scan.nextInt();
			checks += checkThis(numbers);
		} //�Է¹��� �� �ֱ�
		
		System.out.println(checks);
	}
	
	public static int checkThis(int thisNum) {
		int check = 0;
		if(thisNum == 1) {
			return 0;
		}else {
			for(int devide=2; devide<=thisNum; devide++) {
				int result = thisNum%devide;
				if(result == 0) { //���� �������� 0�� �Ǿ��� ��
					if(devide == thisNum) { //���� ���ڿ� ������ ���ڰ� ������
						//�Ҽ� ����
					check = 1;
					} else {
						break;
					}
				} 
			}		
		}
		return check;
	}
}