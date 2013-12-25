package linklist.singledirection;

import java.util.Random;

/**
 * �����������㷨��Ϊͳһ����Ϊ���������ͷ��㣬�÷���������˳��
 * �뽨����������˳���෴�������Ҹ�������һ�ֽ�����˳���뽨��������
 * ˳���� ͬ�Ľ�����������ע�͵Ĵ�����ʾ�����÷����Ƚϼ򵥡�
 * @author Leslie Leung
 */

public class CreateSingleDirectionLinkList {
	public static void main(String[] args) {
		Node head = new Node();		//�½�ͷ���
		Node pointer = head;	//�½�pointer���ã����ڱ����������
		Random random = new Random();	
		String strNodeGenerate = "������˳��Ϊ��";
		String strLinkList = "�����������Ϊ��";
//		Node remember = head;	//��סÿһ����㣬�����ʼ��Ϊ��סͷ���
		
		/* Ϊ�������10�����	 */
		for(int i = 0; i < 10; i ++) {
			Node newNode = new Node();
			newNode.data = random.nextInt(30);	//�����������	
			
			/* �ѽ����������   */
			newNode.next = head.next;
			head.next = newNode;			
//			remember.next = newNode;
//			remember = remember.next;
			
			strNodeGenerate = strNodeGenerate + newNode.data + "\t";
		}
		System.out.println(strNodeGenerate);
		
		/* ����������� */
		while(pointer.next != null) {
			pointer = pointer.next;
			strLinkList = strLinkList + pointer.data + "\t";
		}
		System.out.println(strLinkList);
	}
}

/* ����� 	*/
class Node {
	public int data;
	public Node next = null;
}
