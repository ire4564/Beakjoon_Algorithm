import java.util.Scanner;

public class P_2798 {
	public static void main(String args[]) {
		int index = 0;
		int first = 0;
		int second = 1;
		
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt(); //��� �޳�
		int numArr[] = new int[time];
		int allhow = (time*(time-1)*(time-2))/6; 
		//������� ����� ���� �ִ��� 
		int threeAdd[] = new int[allhow]; //����� �� ���� �迭
		
		int sum = scan.nextInt(); //���� ���� ã����
		
		for(int i=0; i<time; i++) {
			numArr[i] = scan.nextInt(); //���ڸ� �Է¹ް�
		}
		
		while(true){
			if(second == time-1) {
				first++;
				second = first + 1;
			}
			if(first == time-3) {
				threeAdd[index] = numArr[time-1] + numArr[time-2] + numArr[time-3];
				//������ ���ڵ� �� �� ���ϰ� ������
				break;
			}
			
			for(int three = second+1; three<time; three++) {
				threeAdd[index] = numArr[first] + numArr[second] + numArr[three];
				index++;
			}
			second++;
		}
		
		int check[] = new int[allhow];
		for(int i=0; i<allhow; i++) {
			int thisis = threeAdd[i] - sum;
			if(thisis<0) { //�����̸�
				thisis = thisis * -1;
			}
			check[i] = thisis;
		}//���� ���� ���� ã�Ƴ���
		
		int min = 400000; 
		int thisCheck = 1;
		int thisIndex = 0;
		for(int i=0; i<allhow; i++) {
			if(check[i] == 0) {
				thisCheck = 0;
				break;
			}else if(check[i] < min) {
				//üũ �迭 �ȿ� �ִ� ���� min ������ ������
				if(threeAdd[i] < sum) {
					min = check[i]; //�ε��� �ҷ�����
					thisIndex = i;	
				}
			} else if(check[i] == min) { //���� ���ε�
				if(threeAdd[i] < sum) {
					min = check[i];
					thisIndex = i;
				}
				//�ƴϸ� �״��
			}
		}
		
		if(thisCheck == 1) {
			System.out.println(threeAdd[thisIndex]);	
		} else {
			System.out.println(sum);
		}	
		
	}
}
