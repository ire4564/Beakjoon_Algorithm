import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


//�����ѹ��� �����ڰ� ����
//�����ڶ� �ڱ��ڽ�+���ڸ� ����=�ٸ� ���ڰ� �� �� �ִ� ��쿡���� �ڱ� �ڽ�
//������� 33�� 39�� ������, �׷��ϱ� 39�� �����ѹ��� �ƴ϶�� ��

//����: 10000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� ����ϴ� ���α׷� �ۼ�


public class P_4673  {
	public static void main(String args[]) {
		
		int result[] = new int[10000]; //self_none_num
		int not_self[] = new int[10000];
		int loop = 0; //�迭 ����� ���� ���� index
		int select = 1;
		int index = 0;
		int no_array_index = 0;
		
		for(int numbers=0; numbers<10000; numbers++) {
			self_number(String.valueOf(numbers), result, numbers);
		} //���� �Լ� �ݺ�
		
		Arrays.sort(result); //������������ ����
		
		while(select == 1) {
			 if((index == 9999) || (loop == 10000)) { //������ �ʰ��ߴ��� �� �ʰ��ߴ��� Ȯ��
					select = 0;
					break;
			 } else if(result[index] == result[index+1]) { //���� ���� �ߺ� üũ
						++index;
						
				} else if(result[index] == loop) { //self �迭�� �����ϴ� ���� ���
					++index; //�׳� ��������
					++loop;
				
				} else if(result[index] > loop) { //�迭�� ���� ���� ���
					not_self[no_array_index] = loop;
					++no_array_index;
					++loop;
				}
			}
		
		//Ȯ�ο� ���
		for(int i=0;  i<no_array_index; i++) {
			System.out.println(not_self[i]);
		}
		
	}

public static void self_number(String self, int result[], int index) { //���� �ֱ�(���� ����), ����� ���� �迭, index(���� ����)
	
	int divide[] = new int[5]; //���ڸ����� ���� ����
	int is_self = Integer.valueOf(self); //���� ��� ���� ����, �ڱ� �ڽŸ��� ���س���
	
	for(int i=0; i<self.length(); i++) { //�� �ڸ��� �� �޾ƾ� �ϱ� ������ (������ �ڸ����� 5��)
		//System.out.println("self.charAt(i)" + (self.charAt(i) - '0'));
		divide[i] = self.charAt(i) - '0'; //'0'�� �ƽ�Ű�ڵ� ���� �ָ� �ٷ� char->int�� ��ȯ ����
		is_self += divide[i];
	}
	
	result[index] = is_self; //�ش��ϴ� �ε����� �迭 �ȿ� selft_none�� ���ڸ� ����

	
	//�Լ��� ����: �����ڰ� ���� ���� �ɷ����� ����ϴ� ����
	//for������ �ذ�

	
	}
}