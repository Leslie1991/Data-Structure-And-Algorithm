package linklist.doubledirection.circular;

/**
 * ˫��ѭ���������㷨������˫��ѭ���������㷨���������ٲ�����Ӧ�Ľ�㣬
 * ����ɾ����
 * @author Leslie Leung
 */

public class DoubleDirectionCircularLinkListDelete {
	public static void main(String[] args) {
		Node targetAry[] = doubleDirectionCircularLinkListSearch();
		Node head = targetAry[0];
		Node target = targetAry[1];
		
		if(target == null) {
			System.out.println("�Ҳ���Ҫɾ���Ľ��");
		} else {
			/* ʵ��ɾ����㹦�� */
			target.pre.next = target.next;
			target.next.pre = target.pre;
			outputLinkList(head);
		}
	}
	/* ���ҽ�� */
	public static Node[] doubleDirectionCircularLinkListSearch() {
		Node head = createDoubleDirectionCircularLinkList();
		
		/* ���ҵ�һ��������Ϊ3�Ľ�� */
		Node pointer = head;
		while(pointer.next != head) {
			pointer = pointer.next;
			if(pointer.data == 3) {
				break;
			} 
		}
				
		if(pointer.data != 3) {
			return null;
		} else {
			return new Node[]{head, pointer};
		}
	}
	/* ����˫��ѭ���������㷨�������� */
	public static Node createDoubleDirectionCircularLinkList() {
		Node head = new Node();		//�½�ͷ���
		
		/* ��ʼ��ͷ���pre��next���� */
		head.pre = head;
		head.next = head;
		
		Node remember = head;	//��ס��ǰ�ڵ㣬��ʼʱָ��ͷ���
		
		String strLinkList = "���ɵ�����Ϊ��";
		
		for(int i = 0; i < 10; i ++) {
			Node newNode = new Node();
			newNode.data = i;
			
			/* ƴ�ӽ�� */
			remember.next = newNode;
			newNode.pre = remember;
			remember = remember.next;
			head.pre = remember;
			remember.next = head;
			
			strLinkList = strLinkList + newNode.data + "\t";
		}
		System.out.println(strLinkList);
		
		return head;
	}
	/* ��������� */
	public static void outputLinkList(Node head) {
		Node pointer = head;	//�½�pointer����
		String strNewLinkList = "�����������Ϊ��";
		
		/* ������������� */
		while(pointer.next != head) {
			pointer = pointer.next;
			strNewLinkList = strNewLinkList + pointer.data + "\t";
		}
		System.out.println(strNewLinkList);
	}
}
