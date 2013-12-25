package stack.linklist;

/**
 * ��ջ�㷨��ɾ��ͷָ���һ���
 * @author Leslie Leung
 */

public class PopFromStack {
	public static void main(String[] args) {
		Stack top = PushToStack();
		/* ���ж�ջ�Ƿ�Ϊ�� */
		if(top == null) {
			System.out.println("ջΪ��");
			return;
		}
		//��ջ
		top.next = top.next.next;
	}
	public static Stack PushToStack() {
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
		
		return top;
	}
}
