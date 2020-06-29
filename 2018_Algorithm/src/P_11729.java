import java.util.Scanner;

public class P_11729 {
    public static int answer = 0;
    public static StringBuilder sb = new StringBuilder();
	
    // from�� �����ִ� num���� ������ by�� ���� to�� �̵��Ѵ�.
    public static void moveHanoiTower(int num, int from, int by, int to) {
        ++answer;
        // �̵��� ������ ���� 1�����?
        if(num == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            // STEP 1 : num-1���� A���� B�� �̵�
            moveHanoiTower(num-1, from, to, by);
            // STEP 2 : 1���� A���� C�� �̵�
            sb.append(from + " " + to + "\n");
            // STEP 3 : num-1���� B���� C�� �̵�
            moveHanoiTower(num-1, by, from, to);
        }	
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        moveHanoiTower(num, 1, 2, 3);
        sb.insert(0, answer + "\n");
        System.out.println(sb);
    }	
}