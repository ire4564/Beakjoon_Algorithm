import java.util.Scanner;

public class P_11720 {
    public static void main (String args[]) {
    	int sum = 0;
    	
    	Scanner scan = new Scanner(System.in);
    	int scale = scan.nextInt();
    	int numbers[] = new int[scale]; //���� �迭
    	
    	String num_string = scan.next(); //�ѹ��� ���ڿ��� �ޱ�
    	
    	for(int i = 0; i<scale; i++) { //String ���ڿ� int�� ��ȯ�ϱ�
    		numbers[i] = Integer.parseInt(String.valueOf(num_string.charAt(i)));
    		sum += numbers[i];
    	}
    	
    	System.out.println(sum);
    }
}