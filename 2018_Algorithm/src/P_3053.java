import java.util.*;
import java.util.stream.IntStream;

public class P_3053 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		//������ �Է¹ޱ�
		
		//�Ϲ� �������� �̿��� ���ϱ�
		String ordin = String.format("%.6f", Math.PI*r*r);
		System.out.println(ordin);
		
		//��Ŭ���� ������
		//�Է¹��� ���ڸ� ��ǥ�� ����
		String ucl = String.format("%.6f", (double)r*r*2);
		System.out.println(ucl);
	}
}
