import java.util.*;

public class P_10871 {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int ary = scan.nextInt(); //�迭 ũ��
		int num = scan.nextInt(); //�� ����
		 
		int array[] = new int[ary]; //�迭 ����
		
		for(int k=0; k<ary; k++) { //�迭 �ȿ� �� �ֱ�
			int numbers = scan.nextInt();
			array[k] = numbers;
		}
		
		for(int i=0; i<ary; i++) { //�迭 �˻�
			if(array[i]<num) {
				System.out.print(array[i] +" ");
			}
		}	
		
	}
}