import java.util.Scanner;
import java.util.Arrays;

public class P_1316 {
    public static void main (String args[]) {
    	
    	Scanner scan = new Scanner(System.in);
    	int cycle = scan.nextInt();
    	int count = cycle; //�ܾ��� ����
    
    	String words[] = new String[cycle];
    	for(int t=0; t<cycle; t++) {
    		words[t] = scan.next();
    	} //���� �迭�� �����ϱ�

    	int over = 0;
    	for(int c=0; c<cycle; c++) { //���鼭 �� �迭���� �˻�
    		int key = words[c].length();
    		char check[] = new char[key];
    		for(int chars=0; chars<key; chars++) {
    				check[chars] = words[c].charAt(chars);
    				//char �迭�� �� ���ھ� �и��ؼ� �ֱ�
    			}
    		char overlap[] = new char[key]; //�񱳿� �迭
    		
    		for(int a=0; a<key; a++) { //�ߺ����� ���� ���ڴ� ���ο� �迭�� �ֱ�
    			for(int b=0; b<key; b++) {
    				if(check[a] == overlap[b]) {
    					if(a == b) { //�ε����� ���� ���� �н�
    						break;
    					} else {
    						if(a == b+1) { //�˻� �迭�� �ε��� + 1�� ���� �ε��� ������ Ȯ��
        						overlap[b] = ' '; //�������� �ΰ�
        						overlap[b+1] = check[a];//���ڿ� �ű��
        					} else {
        						++over;
        						//�׷�ܾ �ƴ�
        					}
    					}
    				} else {
    					overlap[a] = check[a];
    				}
    			}
    		}
    		
    		if(over != 0) {
    			//�׷� �ܾ �ƴ�
    			--count;
    		}
    		over = 0;//�ʱ�ȭ
    	}
    	
    	System.out.println(count);
    }
}

