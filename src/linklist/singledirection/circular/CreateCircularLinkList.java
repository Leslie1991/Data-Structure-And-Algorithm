package linklist.singledirection.circular;

/**
 * ѭ���������㷨���������뵥�������㷨��ͬ��ֻ������Ҫ��ͷ������Ԥ����������next����ָ��
 * �Լ�����Ȼ��ͨ����һ���������ܷ�ص��������ж�ѭ�������Ƿ����ɹ���
 * @author Leslie Leung
 */

public class CreateCircularLinkList {
	public static void main(String[] args) {
		Node head = new Node();
		head.next = head;	//��ͷ������Ԥ����������next����ָ���Լ�����
		
		for(int i = 0; i < 10; i ++) {
			Node newNode = new Node();
			newNode.data = i;	//Ϊ�˼����Ƿ����ɹ���ÿ�����������������ͬ
			
			/* ƴ�ӽ�� */
			newNode.next = head.next;
			head.next = newNode;
		}
		
		/* ���ѭ�������Ƿ����ɹ� */
		Node pointer = head.next;	//��������ָ�������һ�����
		while(true) {
			pointer = pointer.next;
			/* ͨ��if������whileѭ��������������Ϊnullʱ֤������ѭ������ */
			if(pointer == null) {
				System.out.println("ѭ��������ʧ��");
				break;
			}
			/* ��ͨ����һ�����������Իص�������϶�ѭ���������ɹ� */
			if(pointer.data == 9) {
				System.out.println("ѭ���������ɹ�");
				break;
			}
		}
	}
}

class Node {
	public int data;
	public Node next = null;
}