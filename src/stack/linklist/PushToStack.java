package stack.linklist;

/**
 * ��ջ�㷨����ʵ�����Ͼ��ǵ�����Ľ������̡�
 * @author Leslie Leung
 */

public class PushToStack {
	public static void main(String[] args) {
		Stack top = new Stack();	//�½�ջ��ָ��
		
		/* ��ջ */
		Stack newNode = new Stack();
		newNode.data = 3;
		newNode.next = top.next;
		top.next = newNode;
		
		/* ���ջ��Ԫ�� */
		Stack pointer = top;
		System.out.print("ջ��Ԫ��Ϊ��");
		while(pointer.next != null) {
			pointer = pointer.next;
			System.out.print(pointer.data + "\t");
		}
	}
}

class Stack {
	public int data;
	Stack next = null;	
}