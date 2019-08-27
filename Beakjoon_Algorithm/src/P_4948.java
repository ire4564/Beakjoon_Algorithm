import java.util.Scanner;

public class P_4948 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int check = 0;
		int indexs = 0;
		int sysout[] = new int[123456];
		
		while(check==0) {
			int num1 = scan.nextInt(); //���� �Է¹ޱ�
			if(num1 == 0) {
				check = 1;
				break;
			} else {
				int num2 = num1*2;		
				sysout[indexs] = whatPrime(num1, num2);	
				++indexs;
			}
		}
		for(int i=0; i<indexs; i++) {
			System.out.println(sysout[i]);
		}
		
	}
	public static int whatPrime(int num1, int num2) {
		
		boolean isPrime[] = new boolean[1000001];
		
		isPrime[0] =  isPrime[1] = false;
		//ù������ �ι�° ĭ�� false�� ���ܵд�
		//�ε����� �� ���ڶ�� ���� ����Ѵ�
		
		for(int i=2; i<=num2; i++) {
			isPrime[i] = true;
			//�������� �ش� �ε����� true�� �ٲ��ش�
		}
		
		//�����佺�׳׽��� ü ����� �̿���/ n��Ʈ������ Ȯ���ϸ� �Ǵ� ��
		for(int i=2; i*i<=num2; i++) {
			int index = 2;
			if(isPrime[i]) {
				for(int j=i*index; j<=num2; j=i*index) { //������ ������� �����ִ� ����
					isPrime[j] = false;
					index++;
				}
			}
		}
		isPrime[num1] = false; //������ �������� �ʴ´�
		int howMuch = 0;
		for(int i=num1; i<=num2; i++) {
			if(isPrime[i]) {
				++howMuch;
			}
		}
		return howMuch;
		
	}
}