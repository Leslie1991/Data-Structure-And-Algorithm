package linklist.singledirection;

import java.util.Random;

/**
 * ��������ǰ���㷨���ҵ�Ŀ���㲢��Ŀ����ǰ��������㣬��Ҫ�Ƚ���������
 * �ٶ�������в��ң��ҵ��Ժ���ܲ��롣��������Ҫ���ҵ�һ��������Ϊ3�Ľ�㣬��
 * �ý��ǰ����������Ϊ23���½�㡣���������뵥���������㷨��ͬ������ΪҪ����
 * ǰ�壬���Ա����¼Ŀ��ڵ��ǰһ��������ɡ�
 * @author Leslie Leung
 */

public class SingleDirectionLinkListInsertBefore {
	public static void main(String[] args) {
		/* ��������ͷ��� ��Ŀ����ǰһ����Ŀ����*/
		Node[] targetNodeAry = SingleDirectionLinkListSearch();
		Node head = targetNodeAry[0];		//head����ָ������ͷ���
		Node preNode = targetNodeAry[1];
		Node target = targetNodeAry[2];		//target����ָ��Ŀ����
		
		/* ����pointerֵ���жϣ����pointerΪnull��˵��������Ŀ���㣻�����Ϊnull��
		 * ֤��Ŀ������ڣ���Ŀ���������� */	
		if(target == null) {
			System.out.println("�Ҳ�������ǰ�������Ŀ����");
		} else {
			/* �½���㲢���� */
			Node newNode = new Node();
			newNode.data = 23;		//�²�����������Ϊ23
			
			newNode.next = preNode.next;
			preNode.next = newNode;
			
			System.out.print("���������Ϊ��");
			outputLinkList(head);
		}
	}
	/* ���õ�����������㷨�ҵ�Ŀ���㣬�ڴ����趨��һ��������Ϊ3�Ľ��ΪĿ���㣬�ڴ˽��ǰ������ */
	public static Node[] SingleDirectionLinkListSearch() {
		Node head = createSingleDirectionLinkList();	//��סͷ��㣬�������������
		Node pointer = head;
		Node nowPointer = null;		//�½�nowPointer����
		
		while(pointer.next != null) {
			nowPointer = pointer;		//nowPointerָ��Ŀ�����ǰһ��㣬�Ա����ǰ��
			pointer = pointer.next;
			if(pointer.data == 3) {
				break;
			}
		}
		
		/* ���������ɵĽ����û��������Ϊ3�Ľ�㣬��pointer��nowPointer����Ϊnull */
		if(pointer.data != 3) {
			pointer = null;
			nowPointer = null;
		}

		return new Node[]{head, nowPointer, pointer};
	}
	/* ���õ����������㷨�������� */
	public static Node createSingleDirectionLinkList() {
		Node head = new Node();		//�½�ͷ���
		Random random = new Random();
		String strNodeGenerate = "������˳��Ϊ��";
		
		/* Ϊ�������10�����	 */
		for(int i = 0; i < 10; i ++) {
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
		Node pointer = head;		//�½�pointer����
		String strLinkList = "";
		
		/* ������������� */
		while(pointer.next != null) {
			pointer = pointer.next;
			strLinkList = strLinkList + pointer.data + "\t";
		}
		System.out.println(strLinkList);
	}
}
