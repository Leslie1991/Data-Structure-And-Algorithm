package linklist.singledirection.circular;

import java.util.Random;

/**
 * ѭ�����������㷨��������ѭ���������㷨�½����������ѵڶ��������β���ָ���һ�������ͷ��㣬
 * ��һ�������β���ָ��ڶ�������ĵ�һ����㡣
 * @author Leslie Leung
 */

public class CircularLinkListConnect {
	public static void main(String[] args) {
		/* �½�����ͷ��� */
		Node headOfFirstList = new Node();
		Node headOfSecondList = new Node();
		
		/* ��ʼ������ͷ��� */
		headOfFirstList.next = headOfFirstList;
		headOfSecondList.next = headOfSecondList;
		
		Random random = new Random();
		
		for(int i = 0; i < 5; i ++) {
			Node newNodeOfFirstList = new Node();
			Node newNodeOfSecondList = new Node();
		
			newNodeOfFirstList.data = random.nextInt(20);
			newNodeOfSecondList.data = random.nextInt(20);
			
			/* ƴ�ӵ�һ������ */
			newNodeOfFirstList.next = headOfFirstList.next;
			headOfFirstList.next = newNodeOfFirstList;
			
			/* ƴ�ӵڶ������� */
			newNodeOfSecondList.next = headOfSecondList.next;
			headOfSecondList.next = newNodeOfSecondList;
		}
		
		/* ����������� */
		Node pointToFirstList = headOfFirstList;
		Node pointToSecondList = headOfSecondList;
		
		String strFirstList = "��һ������Ϊ��";
		String strSecondList = "�ڶ�������Ϊ��";
		
		while(pointToFirstList.next != headOfFirstList) {
			pointToFirstList = pointToFirstList.next;
			strFirstList = strFirstList + pointToFirstList.data + "\t";
		}
		while(pointToSecondList.next != headOfSecondList) {
			pointToSecondList = pointToSecondList.next;
			strSecondList = strSecondList + pointToSecondList.data + "\t";
		}
		
		System.out.println(strFirstList);
		System.out.println(strSecondList);
		
		/* ����ѭ����������ӣ��ڶ��������β���ָ���һ�������ͷ��㣬��һ�������β���ָ��ڶ��������һ����� */
		pointToFirstList.next = headOfSecondList.next;
		pointToSecondList.next = headOfFirstList;
		
		/* ������Ӻ������ */
		Node pointer = headOfSecondList;
		String strConnectList = "";
		int times = 0;
		while(true) {
			if(pointer.next == headOfSecondList.next) {
				System.out.println("���Ӻ������ѭ������" + times + "��Ϊ��" + strConnectList);
				times ++;
			}
			/* ������Ϊ����ʾ��ֻ����ѭ����ʾ���α�����ѭ�� */
			if(times == 3) {
				break;
			}

			pointer = pointer.next;
			strConnectList = strConnectList + pointer.data + "\t";
			
		}
	}

}
