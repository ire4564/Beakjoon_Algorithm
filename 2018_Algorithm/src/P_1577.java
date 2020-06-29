import java.util.Scanner;
import java.util.Arrays;

public class P_1577 {
    public static void main (String args[]) {
    	int alpha[] = new int[26]; //���ĺ� �迭 �����
    	
    	Scanner scan = new Scanner(System.in);
    	String word = scan.next();
    	
    	word = word.toLowerCase(); //��� �ҹ��ڷ� ��ȯ
    	
    	if(word.length() == 1) { //���ڰ� �ϳ��� �Էµ� ���
    		System.out.println(word.toUpperCase());
    		System.exit(0);
    	}
    	
    	for(int i=0; i<word.length(); i++) { //���� ���̸�ŭ ���鼭
    		alpha[Integer.valueOf(word.charAt(i))-'a']++;
    	} //�ش� ���ڿ��� �ε����� �����ؼ� ++��Ű��
    	
    	int max = -1; //�ִ밪 ã��
    	int index = 0;
    	int overlap = 0;
    	for(int a=0; a<26; a++) {
    		if(max == alpha[a]) { //�ߺ� �� �߽߰� overlap = 1
    			overlap = 1;
    		} else if(max<alpha[a]) {
    			max = alpha[a];
    			index = a; //���ĺ��� �ľ��ϱ� ����
    			overlap = 0;
    		} 
    	}
    	if(overlap == 1) { //�ߺ� ���� �־�����
    		System.out.println("?");
    	} else {
    		int final_alpha = index+'a';
        	System.out.println(Character.toString((char)final_alpha).toUpperCase());
    	}
    	
    }
}

