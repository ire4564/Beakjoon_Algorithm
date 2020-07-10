import java.util.Scanner;
import java.util.Stack;

public class P1935 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		String expr = scan.next(); //��
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<expr.length(); i++) {
			if(priority(expr.charAt(i)) == -1) {
				//������ ��� �׳� ���
				System.out.print(expr.charAt(i));
			}
			else {
				//��ȣ�� ��� �켱���� �ľ�
				if(stack.empty() || expr.charAt(i) == '(') {
					//������� �׳� �����ϱ�
					stack.push(expr.charAt(i));
				} 
				else if(expr.charAt(i) == ')') {
					//top�� �ִ� �ͺ��� ���� Ŭ ���
					while(!stack.isEmpty() && stack.peek() != '(') {
						System.out.print(stack.pop());
					}
					stack.pop();
				}
				else {
					while(!stack.isEmpty() && priority(stack.peek()) >= priority(expr.charAt(i))){
						//�켱������ ������
						System.out.print(stack.pop());
					}
					stack.push(expr.charAt(i));
				}
			}
		}
		while(!(stack.empty())) {
			if(stack.peek() == '(') {
				stack.pop();
			} else {
				System.out.print(stack.pop());
			}
		}
		
	}
	public static int priority(char ch) {
		//�켱������ �������� ���ڰ� ŭ
		switch(ch) {
			case '*':
			case '/':
				return 2;
			case '+':
			case '-': 
				return 1;
			case '(':
			case ')':
				return 0;
		}
		return -1;
	}
}
