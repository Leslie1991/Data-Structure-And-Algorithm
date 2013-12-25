package linklist.doubledirection.circular;

import java.util.Random;
import java.util.Scanner;

/**
 * ˫��ѭ���������㷨��������㷨�У��������ĵ������ѭ������Ľ���ʽ�е㲻ͬ������Ϊ�˷��㽨��ǰ�����úͺ������ã�������
 * ���ɽ��˳��������˳����ͬ����һ���㷨��֮ǰһֱʹ�����ɽ��˳��������˳���෴���㷨�������ڼ����Ƿ񽨱�ɹ�����ֱ��ͨ��
 * p.next.pre == p && p.pre.next == p�Ƿ�Ϊtrue�Ϳ����ж��ˡ�
 * @author Leslie Leung
 */

public class CreateDoubleDirectionCircularLinkList {
	public static void main(String[] args) {
		Node head = new Node();		//�½�ͷ���
		Random random = new Random();
		
		/* ��ʼ��ͷ��� */
		head.pre = head;
		head.next = head;
		
		String strLinkList = "���ɵ�˫��ѭ������Ϊ��";
		Node remember = head;	//��סÿһ����㣬�����ʼ��Ϊָ��ͷ���
		
		/* �½�10����� */
		for(int i = 0; i < 10; i ++) {
			Node newNode = new Node();	//�½�һ�����
			newNode.data = random.nextInt(20);
			
			/* ƴ�ӽ�� */
			remember.next = newNode;
			newNode.pre = remember;
			head.pre = newNode;
			newNode.next = head;
			remember = remember.next;
			
			strLinkList = strLinkList + newNode.data + "\t";
		}
		
		System.out.println(strLinkList);
		
		/* ��֤˫��ѭ�������Ƿ����ɹ� */
		Scanner scan = new Scanner(System.in);
		Node checkPointer = head;	//checkPointer����ָ�������
		int index;	//������֤�Ľ����±꣬�ɿ���̨����
		
		while(true) {
			index = scan.nextInt();	//��Ϊͷ���Ҳ������ѭ�������У�����������������Ϊ11
			/* �����±��Ƿ�Խ�� */
			if(index > 10) {
				System.out.println("�����±�Խ��,���������룡");
				continue;
			}
			/* �ҵ������� */
			for(int i = 0; i < index; i ++) {
				checkPointer = checkPointer.next;
			}
			/* ��֤�Ƿ�Ϊ˫������ */
			if(checkPointer == checkPointer.pre.next && checkPointer == checkPointer.next.pre) {
				System.out.println("�����ɹ���");
			} else {
				System.out.println("����ʧ��");
			}
		}
	}
}

/* ͷ����� */
class Node {
	public int data;
	public Node pre = null;
	public Node next = null;
}
