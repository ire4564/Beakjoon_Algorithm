import java.util.Scanner;

public class P_3052 {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int numbers[] = new int[10];
		int num;
		int count = 1;
		int temp;
		
		for(int i=0; i<10; i++) {
			num = scan.nextInt();
			numbers[i] = num%42;
		} //������ �ֱ�
		
		for(int i=0; i<9; i++) { //�������� (size-1)
			int min = i;
			for(int j=i+1; j<10; j++) {
				if(numbers[min] > numbers[j]) {
					min = j;
				}
			}
			temp = numbers[min];
			numbers[min] = numbers[i];
			numbers[i] = temp;
		}
		
		 
		int k = 0;
		while(k<9) {
			if(numbers[k] != numbers[k+1]) {
				++count;
			}  
			k = k+1;
		}
		
		System.out.println(count);
		
	}
}
