import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1991_Tree_Basic {
	public static void main (String args[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		Tree t = new Tree();
		char data[];
		
		for(int i=0; i<n; i++) {
			//buf�� �̿��ؼ� �Է¹ް�, �װ��� ���� �������� �ɰ��� �迭�� �����
			data = buf.readLine().replaceAll(" ", "").toCharArray();
			t.add(data[0], data[1], data[2]);
		}
		
		t.preorder(t.root);
		System.out.println();
		t.inorder(t.root);
		System.out.println();
		t.postorder(t.root);
		buf.close();
	}
}
	
	class Node {
		char data;
		Node left, right;
		public Node (char data) {
			this.data = data;
		}
	}
	
	class Tree {
		Node root;
		public void add (char data, char left, char right) {
			//������ �߰�
			if(root == null) {
				if(data != '.') {
					root = new Node(data);
				}
				if(left != '.') {
					root.left = new Node(left);
				}
				if(right != '.') {
					root.right = new Node(right);
				}
			}
			//�� �����Ͱ� �ƴ϶�� Ž���ϱ�
			else {
				search(root, data, left, right);
			}
		}
		public void search(Node root, char data, char left, char right) {
			//������ ���� ã��
			if(root == null) return;
			else if(root.data == data) {
				if(left != '.') {
					root.left = new Node(left);
				}
				if(right != '.' ) {
					root.right = new Node(right);
				}
			}
			else {
				//ã�� ������ ��� ��� Ž��
				search(root.left, data, left, right);
				search(root.right, data, left, right);
			}
		}
		public void preorder(Node root) {
			//������ȸ ��>��>��
			System.out.print(root.data);
			if(root.left != null) preorder(root.left);
			if(root.right != null) preorder(root.right);
		}
		public void inorder(Node root) {
			//������ȸ ��>��>��
			if(root.left != null) inorder(root.left);
			System.out.print(root.data);
			if(root.right != null) inorder(root.right);
		}
		public void postorder(Node root) {
			//������ȸ ��>��>��
			if(root.left != null) postorder(root.left);
			if(root.right != null) postorder(root.right);
			System.out.print(root.data);
		}
		
	}
