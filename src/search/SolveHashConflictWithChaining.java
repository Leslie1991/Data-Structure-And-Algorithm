package search;

/**
 * ������ַ�������ϣ���ͻ������ɢ�к�ĵ�ַ��ͬ��ʴ洢�ڸ��Ե������У����Ұ���
 * �ؼ�����С������д洢
 * @author Leslie Leung
 */

public class SolveHashConflictWithChaining {
	public static void main(String[] args) {
		/* ���ù�ϣ��ĳ���Ϊ13 */
		ChainHash[] chain = new ChainHash[13];
		
		/* ��ʼ�� */
		for(int i = 0; i < 13; i ++) {
			chain[i] = new ChainHash();
		}
		/* ��ؼ����������� */
		int[] key = {27, 6, 84, 21, 36, 38, 10, 16, 55, 14, 79};
		/* ɢ�� */
		int address;
		for(int i = 0; i < key.length; i ++) {
			address = key[i] % 13;
			
			/* ����chaining���� */
			chaining(chain[address], key[i]);
		}
		
		for(int i = 0; i < chain.length; i ++) {
			/* ����output()������� */
			output(chain[i], i);
		}
	
	}
	
	/**
	 * ��������ַ�������ϣ���ͻ������
	 * @param head ��ͷ
	 * @param key ����Ĺؼ���ֵ
	 */
	public static void chaining(ChainHash head, int key) {
		
		ChainHash pointer = head;
		ChainHash newChain = new ChainHash();
		newChain.value = key;
		
		/* ���������Ԫ�أ��������� */
		if(head.next == null) {
			newChain.next = head.next;
			head.next = newChain;
			return;
		}
		
		while(true) {
			/** 
			 * ���ݴ�С���н�㰴˳�����
			 */
			if(newChain.value >= pointer.value && newChain.value < pointer.next.value) {

				newChain.next = pointer.next;
				pointer.next = newChain;
				break;
			}
			
			pointer = pointer.next;		//pointer����һλ
			
			if(pointer.next == null) {//�嵽��β
				newChain.next = pointer.next;
				pointer.next = newChain;
				break;
			}
			
		}
	}
	/* ��ʽ���������ַ�����ͻ��Ĵ洢 */
	public static void output(ChainHash head, int i) {
		ChainHash pointer = head;
			
		/* ������� */
		System.out.print(i + ":" +(pointer.next == null ? "\n" : "\t"));
		while(pointer.next != null) {
			pointer = pointer.next;
			System.out.print(pointer.value + (pointer.next == null ? "\n" : "\t"));
		}
	
	}
}

class ChainHash {
	public int value;
	public ChainHash next = null;
}
