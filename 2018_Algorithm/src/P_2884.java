import java.util.*;

public class P_2884 {
	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M-45 < 0) { //���� �п��� 45���� ���µ� �������
			M = M - 45 + 60;
			H = H - 1;
		} else {
			M += -45;
		}
		
		if(H < 0) { //�ð��� ���� �������
			H = H + 24;
		}
		
		System.out.println(H + " " + M);

	}
}
