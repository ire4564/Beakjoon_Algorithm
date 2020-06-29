import java.util.*;
import java.util.stream.IntStream;

public class Todays {
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int roop = scan.nextInt(); //�ݺ��� Ƚ��
		String userNum[] = new String[10001];
		int checkIndex[] = new int[10001];
		String thisFinal[] = new String[roop];
		
		int index = 0;
		int finalIndex = 0;
		int userNumCheck = 0;
		
		int mill[] = new int[1001];
		mill = returnPrime(); //�������� �Ҽ��� �� ���ؼ� ����
		
		for(int i=0; i<roop; i++) { //Ƚ����ŭ �ݺ��ؼ� ���� �ֱ�
			userNumCheck = scan.nextInt();
			if(userNumCheck<4) {
				System.out.println("try again");
				userNumCheck = scan.nextInt();
			}else {
				//�Է¹��� ���ڸ� ó���� �� ���� ��
				for(int k=0; k<mill.length; k++) {
					//10000������ �Ҽ� �迭 �ȿ��� ������ ���� �ϳ��� ������
					//�� ���� �Ҽ����� �ƴ����� �Ǵ�
					if(userNumCheck<=mill[k]) { //mill �迭 ���� �Ҽ����� ������ �Ҽ������� �� Ŭ ���
						break;
					} else {
						 //�Է°�-�Ҽ�=�Ҽ��ϰ��
						int checkThis = userNumCheck-mill[k];
						boolean contains = IntStream.of(mill).anyMatch(x -> x == checkThis);	
						if(contains == true) { //�Ҽ��� �� �迭�� �ִٴ� ��
							userNum[index] = mill[k] + " " + checkThis;
							checkIndex[index] = checkThis - mill[k]; //���̰� ���� ���� ���� ���� ����ϱ� ���� ���̸� �ִ� �迭 ���� ����
							
							if(index == roop-1) {
								int thisMin = minIndex(checkIndex); //�ּҰ��� ����ִ� �ε���
								thisFinal[finalIndex] = userNum[thisMin];
								System.out.println(thisFinal[finalIndex]);
								index = 0;
								finalIndex++;
								break;
							} else {
								++index;	
							}
						}
						
					}
				}	
			}
		}
	
	}
	public static int minIndex(int[] array) { //�ּҰ� ã�� �Լ�
		int min = array[0];
		int minIndex = 0;
		for(int i=0; i<array.length; i++) {
			if(min > array[i]) {
				min = array[i];
				minIndex = i;
			}
		}
		System.out.println(minIndex);
		return minIndex;
	}
	
	public static int[] returnPrime() {
		boolean isPrime[] = new boolean[10001];
		
		isPrime[0] = isPrime[1] = false;
		
		for(int i=2; i<=10000; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i*i<=10000; i++) {
			int index = 2;
			if(isPrime[i]) {
				for(int j=i*index; j<=10000; j=i*index) {
					isPrime[j] = false;
					index++;
				}
			}
		}
		int thisPrime[] = new int[10001];
		int thisIndex = 0;
		for(int i=2; i<=10000; i++) {
			if(isPrime[i]) {
				thisPrime[thisIndex] = i;
				thisIndex++;
			}
		}
		return thisPrime;
	}
}