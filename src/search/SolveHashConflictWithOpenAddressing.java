package search;

/**
 * �ÿ��ŵ�ַ�������ϣ���ͻ�����ؼ�������Զ���ڹ�ϣ����ʱ�����ֳ�ͻ����������ġ���ʱ������
 * �����㷨�����ϣ���ͻ�������Ҳ����˿��ŵ�ַ��������������̽����ɢ�е�ģʽ����������d��ͨ��
 * ��ʽ (address + d) % hashTableLength ������µĵ�ַ����Ϊ��֪����ϣ��ĳ����ַ
 * �Ƿ�����Ԫ�أ������ÿ��λ������һ����־flag��flagΪtrue��ʾ����Ԫ�أ�flagΪfalse
 * ��ʾû��Ԫ�أ�ע���е���һ�����  hashTable[i].flag = true ����������֤��ϣ���Ƿ�
 * ������
 * @author Leslie Leung
 */

public class SolveHashConflictWithOpenAddressing {
	public static void main(String[] args) {
		/* ��ʼ����ϣ�� */
		HashTable[] hashTable = new HashTable[28];
		for(int i = 0; i < hashTable.length; i ++) {
			hashTable[i] = new HashTable();
//			hashTable[i].flag = true;
			
		}
		
		/* ����Ϊģ���ͻ���Ҹ�hashTable�е�ĳ���ֵ */
		hashTable[0].value = 28;
		hashTable[0].flag = true;
		hashTable[1].value = 33;
		hashTable[1].flag = true;
		
		/* ����Ƿ������ͻ,����Ҫ����ɢ�в����Ĺؼ���Ϊ23*/
		int address = hash(23, 23);
		
		/* ��ʾһ��ɢ�оͿ���ɢ�е�λ����������ͻ */
		if(hashTable[address].flag == false) {
			hashTable[address].value = 23; 
		}
		
		/**
		 *  ������ͻʱ�Ĵ��� ,�����������̽����ɢ�еķ��������ͻ 
		 **/
		int d = 0;
		int rememberAddr = address;		//��ס��ʼɢ�к��λ��
		while(hashTable[address].flag == true) {	//������ڳ�ͻ

			/* �ж��Ƿ�ѭ��������һ�ι�ϣ����Ϊ��Ҫѭ���������������������±�Ĺ�ϵΪnext = (pre + 1) % hashTableLength */
			if( rememberAddr == (address + 1) % hashTable.length ) {
				System.out.println("��ϣ������");
				return;
			}
			
			/* ʵ��d���Ե��� */
			if(d < hashTable.length - 1) {
				d ++;
			}
			
			/* ����newAddress = ( H(key) + d ) % hashTableLength�����ʽ������µ�ַ */
			address = openAddressing(rememberAddr, d, hashTable.length);		
		}
		
		d = 0;	//����dΪ0
		hashTable[address].value = 23;
		System.out.println("ɢ�к�ĵ�ַΪ��" + address);
	}
	/* ɢ���㷨 */
	public static int hash(int key, int module) {
		return key % module;
	}
	/* ��������̽����ɢ�еķ��������ͻ���� */
	public static int openAddressing(int address, int d, int hashTableLength) {
		return (address + d) % hashTableLength;
	}
}

class HashTable {
	public int value;
	public boolean flag = false;	//��ʼ��Ϊfalse��ʾ��ʼʱÿ��λ�ö����������ͻ
}