import java.util.Scanner;

public class Maining {
	public static void main(String args[]) {
		int square = 1; //3�� ���� Ƚ��
		
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int round = 0; round<star; round++) {
			if(round%3 != 0) { //3�� ����� �ƴ϶�� �ݺ� ���
				for(int N = 0; N<star; N++) {
					System.out.print("*");
				}
				System.out.println(" ");
				System.out.print("*");
				for(int A = 0; A<(star-3)/3; A++) {
					System.out.print(" **");
				}
				System.out.print(" *");
				System.out.println(" ");
			} else if(round%3 == 0) { //�� �� ����ϱ�
				for(int i=0; i<square; i++) {
					threeGo();
				} for(int i=0; i<square; i++) {
					threeRemove();
				}
				System.out.println(" "); //dma....
			}
			
		}
	}

	public static void threeGo() { //�׳� ����
		System.out.print("***");
	}
	public static void threeRemove() { //�����
		System.out.print("   ");
	}
}
