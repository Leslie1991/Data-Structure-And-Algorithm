package linklist.singledirection;

import java.util.Random;

/**
 * �������������㷨�������Ҹ���������ʵ�ַ��������еڶ��ַ����������Ƕ���ע�͵Ĵ��룩����һ�ַ���Ϊ������
 * ˳�������㲢�ѽ���Ƶ���β��������ƴ����ɣ���ʱ��Ҫ��סͷ���ͱ�β��㡣�ڶ��ַ���������˳�������
 * �㲢�ѽ�㲻����ǰ�� ���γ�������������
 * @author Leslie Leung
 */
public class SingleDirectionLinkListInvert {
	public static void main(String[] args) {
		/* ���ջش���ͷ�����������һ��������� */
		Node[] getHeadAndPointer = createSingleDirectionLinkList();
		Node head = getHeadAndPointer[0];
		Node last = getHeadAndPointer[1];
		Node pointer = head;	
		
		while(head.next != last) {
			
			pointer = head.next;	//pointerָ����Ҫ�����β�Ľ��
			head.next = pointer.next;	//ͷ�����pointer�ĺ����������
			/* �ƶ���㲢����ƴ�� */
			pointer.next = last.next;
			last.next = pointer;
		}
		
//		Node targetNode = head.next;	//tagetNode��ʾ��Ҫ��������Ľ��
//		Node rememberTargetNode;
//		head.next = null;	//��ʼ��head.next���Ա����ͳһ����
//		while(targetNode != null) {
//			rememberTargetNode = targetNode;	//rememberTargetNode��ס��Ҫ��������Ľ��
//			targetNode = targetNode.next;
//			/* ��������ƴ�� */
//			rememberTargetNode.next = head.next;
//			head.next = rememberTargetNode;
//		}
		System.out.print("����������Ϊ��");
		outputLinkList(head);
	}
	/* ���õ����������㷨�������� */
	public static Node[] createSingleDirectionLinkList() {
		Node head = new Node();		//�½�ͷ���
		Node pointer = head;		//�½�pointer���ã����ڱ����������
		Random random = new Random();
		String strNodeGenerate = "������˳��Ϊ��";
		
		/* Ϊ�������10�����	 */
		for(int i = 0; i < 10; i ++) {
			Node newNode = new Node();
			newNode.data = random.nextInt(30);		//�����������
			
			/* �ѽ����������   */
			newNode.next = head.next;
			head.next = newNode;
			
			strNodeGenerate = strNodeGenerate + newNode.data + "\t";
		}
		System.out.println(strNodeGenerate);
		
		System.out.print("���ɵ�����Ϊ��");
		outputLinkList(head);
		
		/* �ҵ����һ����� */
		while(pointer.next != null) {
			pointer = pointer.next;
		}

		return new Node[]{head, pointer};
	}
	/* ������� */
	public static void outputLinkList(Node head) {
		/* ����������� */
		String strLinkList = "";
		Node pointer = head;
		while(pointer.next != null) {
			pointer = pointer.next;
			strLinkList = strLinkList + pointer.data + "\t";
		}
		System.out.println(strLinkList);
	}
}
