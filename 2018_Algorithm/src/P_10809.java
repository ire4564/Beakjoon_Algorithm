import java.util.Scanner;

public class P_10809 {
    public static void main (String args[]) {
    	int[] alpha = new int[26];
    	
    	for(int i=0; i<26; i++) {
    		alpha[i] = -1; //�⺻���� -1�� ��� ä���
    	}
    	
    	Scanner scan = new Scanner(System.in);
    	String some = scan.next();
    	char one_alpha[] = new char[some.length()]; //���ĺ��� �߶� ����
    	
    	for(int a=0;a<some.length(); a++) {
    		one_alpha[a] = some.charAt(a); //�� ���ھ� �ֱ�
    		for(int b=0;b<a; b++) {
    			if(one_alpha[b] == some.charAt(a)) { //�̹� �����ϴ� ���̾��ٸ�
    				one_alpha[a] = ' '; //���� ����
    			}
    		}
    	}
    	
    	for(int j=0;j<some.length(); j++) {
    	switch (one_alpha[j]) {
		case 'a': 
			alpha[0] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'b': 
			alpha[1] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'c': 
			alpha[2] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'd': 
			alpha[3] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'e': 
			alpha[4] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'f': 
			alpha[5] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'g': 
			alpha[6] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'h': 
			alpha[7] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'i': 
			alpha[8] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'j': 
			alpha[9] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'k': 
			alpha[10] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'l': 
			alpha[11] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'm': 
			alpha[12] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'n': 
			alpha[13] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'o': 
			alpha[14] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'p': 
			alpha[15] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'q': 
			alpha[16] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'r': 
			alpha[17] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 's': 
			alpha[18] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 't': 
			alpha[19] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'u': 
			alpha[20] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'v': 
			alpha[21] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'w': 
			alpha[22] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'x': 
			alpha[23] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'y': 
			alpha[24] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		case 'z': 
			alpha[25] = j; //���� �ε��� ��ȣ �ֱ�
			break;
		default:
			break;
			}
    	}
    	
    	for(int all=0;all<26; all++) {
    		System.out.print(alpha[all] + " ");
    	}
    
    	
    }
}