package search;

/**
 * ��ϣ�㷨������һ���ؼ�������(ͨ���ؼ������г��Ȼ�Զ���ڹ�ϣ����)�����ؼ��ְ���һ�����㷨ɢ�е�
 * ��ϣ���У�ɢ���㷨�кܶ��֣������Ҳ�����address = key % m(addressΪ�ؼ���ɢ�к��ڹ�ϣ
 * ���еĵ�ַ��key�ǹؼ���ֵ��mΪС�ڻ���ڹ�ϣ���ȵ��������)����Ȼ�����������ͻ���⣬��������
 * ��ֻ��ʾ��ϣ�㷨��
 * @author Leslie Leung
 */

public class Hash {
	public static void main(String[] args) {
		int[] keyAry = {2, 45, 87, 12, 56, 90, 35, 76};		//����Ϊ�˷���ʵ�ֹ�ϣ�㷨���Ұѹؼ������д洢��������
		int[] hashTable = new int[14]; 		//�½���ϣ��
		
		/* ��ϣ�㷨��ֱ�Ӽ���洢��ַ��address = key % m(mΪ���ڻ���ڹ�ϣ���ȵ��������)��ͨ�������ʽֱ�Ӵ�ȡ���� 
		 * ��������keyAry[2]Ϊ��*/
		int address;
		address = keyAry[2] % 13;
		hashTable[address] = keyAry[2];
		System.out.println("keyAry[2]���ڹ�ϣ���еĴ洢��ַΪ��" + address);
		
		
	}
}
