import java.util.Scanner;

public class P_1929 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(); //���� �Է¹ޱ�
		int num2 = scan.nextInt();
		
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
		for(int i=num1; i<=num2; i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}
		
	}
}