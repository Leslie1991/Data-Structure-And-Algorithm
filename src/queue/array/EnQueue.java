package queue.array;

/**
 * ����㷨����Ϊ����������ʵ�֣��������ǰ��������ж϶����Ƿ�������ÿ���һԪ�أ�
 * βָ���1�������֮ǰ��Ϊ�˱�����Ϊ���Ӳ��������µ�frontָ�����Ӷ����¼����
 * ���⣬�������ж�frontָ���Ƿ�Ϊ-1��������ǣ���Ԫ������ǰ�ơ�
 * @author Leslie Leung
 */

public class EnQueue {
	public static void main(String[] args) {
		Queue que = new Queue();
		/* �ж϶����Ƿ����� */
		if(que.rear - que.front == que.data.length) {
			System.out.println("�����������ٲ���ᷢ�����");
			return;
		}
		
		/* ÿ����һ��Ԫ�أ���Ҫ�ж���ͷָ���Ƿ���Ϊ֮ǰ����ִ�й����Ӳ�������λ���������� */
		if(que.front > -1) {
			/* ÿ��Ԫ����ǰ�� */
			for(int j = 0; j < que.data.length - 1; j ++) {
				que.data[j] = que.data[j + 1];
			}
		}
		
		/* ��� */
		que.rear ++;	//βָ���1
		que.data[que.rear] = 23;
		System.out.println("������Ϊ" + que.data[que.rear] + "����Ԫ����ӳɹ�");
	}
}

class Queue {
	/* ��ʼ���ն��У�����ʼ��ͷָ���βָ���ֵΪ1�������Խ�ͷָ����βָ���Ƿ�����������Ƿ�Ϊ�ն��� */
	int front = -1;
	int rear = -1;
	int[] data = new int[10];
}
