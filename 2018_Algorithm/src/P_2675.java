import java.util.Scanner;

public class P_2675 {
    public static void main (String args[]) {
    	
    	Scanner scan = new Scanner(System.in);
    	int howMuch = scan.nextInt(); //��� �Է��Ұ����� Ƚ��
    	
    	int whatTime[] = new int[howMuch]; //�ݺ��� Ƚ�� �Է�
    	String Double[] = new String[howMuch]; //�ݺ��Ͽ� �ٲ� ���ڿ� P
    	 
    	for(int i=0; i<howMuch; i++) { //�켱 ���� �ݺ��� Ƚ���� ���ڿ��� �Է¹޴´�
    		whatTime[i] = scan.nextInt();
    		Double[i] = scan.next();
    	}
    	
    	for(int a=0; a<howMuch; a++) {
    		char strings[] = new char[Double[a].length()]; //�� ���ڿ��� ���̸�ŭ char�� �迭�� �����
    		for(int snum=0; snum<Double[a].length(); snum++) {
    			strings[snum] = Double[a].charAt(snum); //���ڿ��� �ѱ��ھ� �и��ؼ� �迭�� �ֱ�
    		}
    			
    			int allTime = whatTime[a]*(Double[a].length()); //���� ���� ũ��*Ƚ��
    			char newString[] = new char[allTime];//���� �ִ� �迭�� ũ�� ���ϱ� Ƚ���� ��ŭ�� char �迭 ����
    			
    			int index = 0;
    			for(int all=0; all<strings.length; all++) { //���ڿ� ������ŭ �ݺ�
    				for(int b=0; b<whatTime[a]; b++) {
        				newString[index] = strings[all];
        				++index;
    				}
    			}
    		for(int fin=0; fin<newString.length; fin++) {
    			System.out.print(newString[fin]);
    		}
    		System.out.println(" ");
    	}
    }
}