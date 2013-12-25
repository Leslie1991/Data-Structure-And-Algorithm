package queue.array;

/**
 * �����㷨�����ȵ�������㷨������㷨�д���ü�������⣬ frontָ��Ҫ������
 * @author Leslie Leung
 */

public class DeQueue {
	public static void main(String[] args) {
		Queue que = EnQueue();
		/* ���ж϶����Ƿ�Ϊ�� */
		if(que.front == que.rear) {
			System.out.println("����Ϊ��");
			return;
		}
		for(int i = 0; i < 3; i ++) {//��ͷ��3������Ԫ�س���
			que.front ++;
		}
		
		/* ����¶��� */
		System.out.print("�¶���Ϊ��");
		for(int i = 3; i < que.data.length; i ++) {
			System.out.print(que.data[i] + "\t");
		}
	}
	/* Ԫ����� */
	public static Queue EnQueue() {
		Queue que = new Queue();
		
		for(int i = 0; i < que.data.length; i ++) {
			/* ���ж϶����Ƿ����� */
			if(que.rear - que.front == que.data.length) {
				System.out.println("��������");
				return que;
			}
			
			/* ÿ����һ��Ԫ�أ���Ҫ�ж���ͷָ���Ƿ���Ϊ֮ǰ����ִ�й����Ӳ�������λ���������� */
			if(que.front > -1) {
				/* ÿ��Ԫ����ǰ�� */
				for(int j = 0; j < que.data.length - 1; j ++) {
					que.data[j] = que.data[j + 1];
				}
			}
			
			que.rear ++;
			que.data[que.rear] = i;
		}
		return que;
	}
}
