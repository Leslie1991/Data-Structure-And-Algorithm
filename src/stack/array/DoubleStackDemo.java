package stack.array;

/**
 * ˫ջ��˫ջ����һ���飬���Դ�����������ջģ��˫ջԭ��
 * @author Leslie Leung
 */

public class DoubleStackDemo {
	public static void main(String[] args) {
		/* ��Ϊ����ջ������ͬ���ڴ���ֻģ��ĳһջ��ջ����ǰ���������ж� */
		DoubleStack dStack = new DoubleStack();
		if(dStack.top2 - 1 == dStack.top1) {//�ж�ջ�Ƿ�����
			System.out.println("ջ����");
		}
	}
}

class DoubleStack {
	int[] data = new int[10];
	int top1 = -1;
	int top2 = 10;
}
