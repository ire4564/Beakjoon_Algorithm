import java.util.*;
import java.util.stream.IntStream;

public class P_1085 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int postion[] = new int[4];
		for(int i=0; i<4; i++) {
			postion[i] = scan.nextInt();
		} //������ �޾ƿͼ� ���� ��ġ�� �־��ش�. ��x ��Y ��X ��Y
		
		int thisPosition[] = new int[4]; //���̵��� ��� ���� �迭
		
		thisPosition[0] = postion[0] - 0;
		thisPosition[1] = postion[2] - postion[0];
		thisPosition[2] = postion[3] - postion[1];
		thisPosition[3] = postion[1] - 0;
		
		Arrays.sort(thisPosition);
		
		System.out.println(thisPosition[0]);
	}
}