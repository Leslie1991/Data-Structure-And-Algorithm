package stack.array;

/**
 * ��ջ�㷨�����ж�ջ�Ƿ���������ʼ��ͷָ��Ϊ-1
 * @author Leslie Leung
 */

public class PushToStack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		/* ���ж�ջ�Ƿ����� */
		if(stack.top == stack.data.length -1) {
			System.out.println("ջ����");
			return;
		}
		/* ͷָ���1 */
		stack.top ++;
		stack.data[stack.top] = 2;
		System.out.println("Ԫ��" + stack.data[stack.top] + "��ջ");
	}
}

class Stack {
	int[] data = new int[10];
	int top = -1;
}