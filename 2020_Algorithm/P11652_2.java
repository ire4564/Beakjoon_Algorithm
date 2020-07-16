import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11652_2 {
	public static void main (String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long arr[] = new long[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(arr); //������������ ����
		int cnt = 1, Max = 1;
		long compare = arr[0];
		for(int j=1; j<num; j++) {
			//�����س���, �� ���� (���� ��� �տ� �ִ� ���� �״�� ����)
			if(arr[j-1] == arr[j]) {
				//�� ���Ͱ� ���ٸ�
				++cnt;
			}
			else {
				//�ٸ� ���ڰ� ��Ÿ���ٸ�
				cnt = 1;
			}
			//���ڰ� max���� ū��
			if(Max < cnt) {
				compare = arr[j];
				Max = cnt;
			}
		}
		
		System.out.println(compare);
	}
}
