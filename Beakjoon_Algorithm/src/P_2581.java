import java.util.Arrays;
import java.util.Scanner;

public class P_2581 {
	public static void main(String args[]){
		int checks = 0;
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(); //���� �Է¹ޱ�
		int num2 = scan.nextInt();
		
		checkThis(num1, num2);	
		
	
	}
	
	public static void checkThis(int upNum, int downNum) {
		int check = 0;
		int checkArray[] = new int[downNum-upNum];
		int index = 0;
		for(int range=upNum; range<=downNum; range++) {
			if(range == 1) {
				
			}else {
				for(int devide=2; devide<=range; devide++) {
					int result = range%devide;
					if(result == 0) { //���� �������� 0�� �Ǿ��� ��
						if(devide == range) { //���� ���ڿ� ������ ���ڰ� ������
							//�Ҽ� ����
						check += range; //���� ���ϱ� ����
						checkArray[index] = range; //���� ���� ���� ã�� ����
						++index; //index�� �ű�� ����
						} else {
							break;
						}
					} 
				}		
			}	
		}
		if(check == 0) {
			System.out.println(-1);
		} else {
			Arrays.sort(checkArray); //�������� ����
			System.out.println(check); //����
			for(int i=0; i<checkArray.length; i++) {
				if(checkArray[i] != 0) {
					System.out.println(checkArray[i]); //���� ���� ��
					break;
				}
			}
		}
		
	}
}