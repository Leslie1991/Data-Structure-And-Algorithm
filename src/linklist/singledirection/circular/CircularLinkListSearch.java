package linklist.singledirection.circular;

import java.util.Random;

/**
 * ѭ����������㷨�����ҷ�ʽ�������뵥������ҷ�����ͬ��������������������
 * ����һ���жϱ����Ҳ������ʱ������ѭ����
 * @author Leslie Leung
 */

public class CircularLinkListSearch {
	public static void main(String[] args) {
		Node head = createCircularLinkList();
		Random random = new Random();
		int search = random.nextInt(20);
		System.out.println("Ҫ�ҵĽ��ֵΪ��" + search);
		
		Node pointer = head;	//�����������ã����в���
		
		while(true) {
			pointer = pointer.next;
			
			if(pointer.data == search) {
				System.out.println("�ҵ���㣬���ֵΪ��" + search);
				break;
			} else if(pointer.next == head) {//  ��������һ����Ҳ�����ֱ���˳���������ѭ��
				System.out.println("�Ҳ����ý��");
				break;
			}
		}
	}
	/* ����ѭ���������㷨����ѭ������ */
	public static Node createCircularLinkList() {
		Node head = new Node();
		head.next = head;	//��ͷ������Ԥ����������next����ָ���Լ�����
		
		for(int i = 0; i < 10; i ++) {
			Node newNode = new Node();
			newNode.data = i;
			
			/* ƴ�ӽ�� */
			newNode.next = head.next;
			head.next = newNode;
		}
		
		return head;
	}
}
