package linklist.singledirection;

import java.util.Random;

/**
 * �����������㷨���ҵ�Ŀ���㲢��Ŀ������������㣬��Ҫ�Ƚ���������
 * �ٶ�������в��ң��ҵ��Ժ���ܲ��롣��������Ҫ���ҵ�һ��������Ϊ3�Ľ�㣬��
 * �ý������������Ϊ23���½��
 * @author Leslie Leung
 */

public class SingleDirectionLinkListInsertAfter {
	public static void main(String[] args) {
		/* ����Ŀ���������ͷ��� */
		Node[] targetNodeAry = SingleDirectionLinkListSearch();
		Node target = targetNodeAry[0];		//target����ָ��Ŀ����
		Node head = targetNodeAry[1];	//head����ָ������ͷ���
		
		/* ����pointerֵ���жϣ����pointerΪnull��˵��������Ŀ���㣻�����Ϊnull��
		 * ֤��Ŀ������ڣ���Ŀ���������� */	
		if(target == null) {
			System.out.println("�Ҳ������к�������Ŀ����");
		} else {
			/* �½���㲢���� */
			Node newNode = new Node();
			newNode.data = 23;	//�²�����������Ϊ23
			
			newNode.next = target.next;
			target.next = newNode;
			
			System.out.print("���������Ϊ��");
			outputLinkList(head);
		}
	}
	/* ���õ�����������㷨�ҵ�Ŀ���㣬�ڴ����趨��һ��������Ϊ3�Ľ��ΪĿ���㣬�ڴ˽�������� */
	public static Node[] SingleDirectionLinkListSearch() {
		Node head = createSingleDirectionLinkList();	//��סͷ��㣬�������������
		Node pointer = head;		
		
		while(pointer.next != null) {
			pointer = pointer.next;
			if(pointer.data == 3) {
				break;
			}
		}
		/* ���������ɵĽ����û��������Ϊ3�Ľ�㣬��pointer����Ϊnull */
		if(pointer.data != 3) {
			pointer = null;
		}
		
		return new Node[]{pointer, head};
	}
	/* ���õ����������㷨�������� */
	public static Node createSingleDirectionLinkList() {
		Node head = new Node();		//�½�ͷ���
		Random random = new Random();
		String strNodeGenerate = "�������˳��Ϊ��";
		
		/* Ϊ�������10�����	 */
		for(int i = 0; i < 10; i ++) {
			Node newNode = new Node();
			newNode.data = random.nextInt(10);
			
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
