package stack.array;

/**
 * ��ջ�㷨����ջ��topָ����ջ���ƶ�һλ
 * @author Leslie Leung
 */

public class PopFromStack {
	public static void main(String[] args) {
		Stack stack = PushToStack();
		/* ���ж�ջ�Ƿ�Ϊ�� */
		if(stack.top == -1) {
			System.out.println("ջΪ��");
		}
		/* ��ջ */
		System.out.println("��ջǰջ��ָ��ֵΪ��" + stack.top);
		
		stack.top --;
		
		System.out.println("��ջ��ջ��ָ��ֵΪ��" + stack.top);
	}
	/* ��ջ */
	public static Stack PushToStack() {
		Stack stack = new Stack();
		/* �ж�ջ�Ƿ����� */
		if(stack.top == stack.data.length - 1) {
			System.out.println("ջ����");
			return null;
		}
		stack.top ++;
		stack.data[stack.top] = 3;
		
		return stack;
	}
}
