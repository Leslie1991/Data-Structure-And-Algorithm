package linklist.singledirection;

import java.util.Random;

/**
 * ������������㷨�����ȣ����ý�����������ķ���������ͷ��㣬��ͨ�����ٽ�����
 * ����������в��ҡ��������ò���������Ϊ5�Ľ�㡣
 * @author Leslie Leung
 */

public class SingleDirectionLinkListSearch {
	public static void main(String[] args) {
		Node pointer = createSingleDirectionLinkList();		//�½����١�ָ�롱�����������Բ���Ŀ����
		int times = 0;	//�½�һ������times����¼Ŀ���㱻�ҵ�����
		while(pointer.next != null) {
			pointer = pointer.next;		//���١�ָ�롱��������
			/* �������Ҫ�ҵ�������Ϊ5�Ľ�� */
			if(pointer.data == 5) {
				times ++;
			}
		}
		System.out.println("Ŀ���㱻�ҵ�" + times + "��");
	}
	/* ���õ����������㷨��������  */
	public static Node createSingleDirectionLinkList() {
		Node head = new Node();		//�½�ͷ���
		Node pointer = head;	//�½�pointer���ã����ڱ����������
		Random random = new Random();
		String strNodeGenerate = "������˳��Ϊ��";
		String strLinkList = "����������Ϊ��";
		
		/* Ϊ�������10�����	 */
		for(int i = 0; i < 10; i ++) {
			Node newNode = new Node();
			newNode.data = random.nextInt(10);	//�����������
			
			/* �ѽ����������   */
			newNode.next = head.next;
			head.next = newNode;
			
			strNodeGenerate = strNodeGenerate + newNode.data + "\t";
		}		
		System.out.println(strNodeGenerate);
		
		/* ����������� */
		while(pointer.next != null) {
			pointer = pointer.next;
			strLinkList = strLinkList + pointer.data + "\t";
		}
		System.out.println(strLinkList);
		
		return head;
	}
}
