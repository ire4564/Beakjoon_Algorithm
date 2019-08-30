import java.util.*;
import java.util.stream.IntStream;

public class P_1002 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(); //��� �Է¹�������
		int res[] = new int[t];
		for(int i=0; i<t; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();
			res[i] = slove(x1, y1, r1, x2, y2, r2);
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
	
	}
	public static int slove(int x1, int y1, int r1, int x2, int y2, int r2) {
		double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		if(x1 == x2 && y1 == y2 && r1 == r2) { 
			//�� ���� ��ġ�� ��
			return -1;
		} else if(r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 || r< Math.abs(r1-r2)) {
			return 0;
			//���ʷ� �� ���� �ʹ� �ֶ�
			// �ϳ��� ���� �ٸ� �ϳ��� �� �ȿ� �ְ� ������ ������ ������ �ʴ� ���
			// �ϳ��� ���� �ٸ� �ϳ��� �� �ȿ� ������ ������ �ٸ��� ������ �ʴ� ���
		} else if(r == r1 + r2 || Math.abs(r1-r2) == r) {
			// �� ����
			return 1;
		}
		return 2;
	}
}
