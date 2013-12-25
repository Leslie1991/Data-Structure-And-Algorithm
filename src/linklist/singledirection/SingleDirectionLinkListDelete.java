package linklist.singledirection;

import java.util.Random;

/**
 * ��������ɾ���㷨���ҵ�����Ŀ���㣬��������Ŀ����ɾ������Ҫ�Ƚ���������
 * �ٶ�������в��ң��ҵ��Ժ����ɾ����������Ҫɾ������������Ϊ3�Ľ�㣬�ڵ���
 * ���ҷ���ʱ��Ҫ����һ����ά���飬���Լ�¼�ɶԴ��ڵ�Ŀ�����ǰ����㡣
 * @author Leslie Leung
 */

public class SingleDirectionLinkListDelete {
	public static void main(String[] args) {
		/* ����ͷ��㡢Ŀ�����ǰ����� */
		Node[][] targetNodeAry = singleDirectionLinkListSearch();
		Node[] headAry = targetNodeAry[0];
		Node[] targetAry = targetNodeAry[1];
		Node[] preNodeAry = targetNodeAry[2];
		
		if(targetAry[0] == null) {
			System.out.println("�Ҳ�����Ҫɾ���Ľ��");
		} else {
			for(int i = 0; targetAry[i] != null; i ++) {
				preNodeAry[i].next = targetAry[i].next;		//ɾ��Ŀ����
				targetAry[i] = null;
			}
			
			System.out.print("ɾ���������Ϊ��");
			outputLinkList(headAry[0]);
		}
	}
	public static Node[][] singleDirectionLinkListSearch() {
		Node head = createSingleDirectionLinkList();	//��סͷ��㣬�������������
		int i = 0;
		int length;		//��¼������
		
		length = head.data;	
		Node[] headAry = {head};	//Ϊ���ڷ��أ��½�����headAry���ͷ���
		Node[] nowPointer = new Node[length];	//�½�nowPointer����
		Node[] nodeFound = new Node[length];	//���ҵ��Ľ�����һ��������
		Node pointer = head;
		
		while(pointer.next != null) {
			//�����в��ҵ��Ľ���ǰ������ŵ�����nowPointer��
			nowPointer[i] = pointer;
			pointer = pointer.next;
			//��������������Ϊ3�Ľ�㣬���������nodeFound��
			if(pointer.data == 3) {
				nodeFound[i] = pointer;
				i ++;
			}
		}
		
		return new Node[][]{headAry, nodeFound, nowPointer};
		
	}
	/* ���õ����������㷨�������� */
	public static Node createSingleDirectionLinkList() {
		Node head = new Node();		//�½�ͷ���
		Random random = new Random();
		String strNodeGenerate = "���Ĳ���˳��Ϊ��";
		int length;		//��¼������
		head.data = 10;	//��������ԭ����Ϊ10���������ͷ������������
		length = head.data;
		
		/* Ϊ�������10�����	 */
		for(int i = 0; i < length; i ++) {
			Node newNode = new Node();
			newNode.data = random.nextInt(10);		//�����������
			
			/* �ѽ����������   */
			newNode.next = head.next;
			head.next = newNode;
			
			strNodeGenerate = strNodeGenerate + newNode.data + "\t";
		}
		System.out.println(strNodeGenerate);
		
		System.out.print("���ɵ�����Ϊ��");
		outputLinkList(head);
		
		return head;
	}
	/* ���øú���ִ�к����������������� */
	public static void outputLinkList(Node head) {
		Node pointer = head;	//�½�pointer����
		String strLinkList = "";
		
		/* ������������� */
		while(pointer.next != null) {
			pointer = pointer.next;
			strLinkList = strLinkList + pointer.data + "\t";
		}
		System.out.println(strLinkList);
	}
}
