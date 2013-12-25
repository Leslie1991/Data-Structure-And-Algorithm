package linklist.doubledirection.circular;

/**
 * ˫��ѭ����������㷨������˫��ѭ���������㷨�Ͳ����㷨�ҵ�Ŀ���㣬�ٽ��в��룬
 * ��Ϊǰ��ͺ��������ƣ�������ֻ������ǰ�������
 * @author Leslie Leung
 */

public class DoubleDirectionCircularLinkListInsert {
	public static void main(String[] args) {
		Node[] targetAry = doubleDirectionCircularLinkListSearch();
		Node head = targetAry[0];
		Node pointer = targetAry[1];
		
		/* ����һ��������Ϊ88�Ľ�� */
		Node newNode = new Node();
		newNode.data = 88;
		newNode.next = pointer;
		newNode.pre = pointer.pre;
		pointer.pre.next = newNode;
		pointer.pre = newNode;
		
		System.out.print("���������Ϊ��");
		outputLinkList(head);
	}
	/* ����Ŀ���� */
	public static Node[] doubleDirectionCircularLinkListSearch() {
		Node head = createDoubleDirectionCircularLinkList();
		Node pointer = head;	//pointer���ڱ�������Ŀ����
		
		/* ���ҵ�һ��������Ϊ6�Ľ�� */
		while(pointer.next != head) {
			pointer = pointer.next;
			if(pointer.data == 6) {
				break;
			}
		}
		if(pointer.data != 6) {
			pointer = null;
		}
		
		return new Node[]{head, pointer};
	}
	public static Node createDoubleDirectionCircularLinkList() {
		Node head = new Node();		//�½�ͷ���
		Node remember = head;	//��ס��ǰ���
		
		/* ��ʼ��ͷ��� */
		head.pre = head;
		head.next = head;
	
		/* ����10����� */
		for(int i = 0;i < 10; i ++) {
			Node newNode = new Node();
			newNode.data = i;
			
			/* ƴ�ӽ�� */
			remember.next = newNode;
			newNode.pre = remember;
			head.pre = newNode;
			newNode.next = head;
			remember = remember.next;
		}
		System.out.print("���ɵ�����Ϊ��");
		outputLinkList(head);
		
		return head;
	}
	/* ����������� */
	public static void outputLinkList(Node head) {
		Node pointer = head;	//pointer���ڱ����������
		String strLinkList = "";
		
		while(pointer.next != head) {
			pointer = pointer.next;
			strLinkList = strLinkList + pointer.data + "\t";
		}
		System.out.println(strLinkList);
	}
}
