package search;

import java.util.*;

/**
 * �ֿ���ң��ֿ���в��ң��Ƚ�������������������������ֵ��һ���ǿ��ڵ����ֵ��һ���Ǹÿ�
 * �Ŀ�ʼ���±꣬�������������ö��ֲ��ҷ����ң��ҳ�Ԫ�����ڵĿ飬������Ӧ�Ŀ��в���˳���
 * �ҵķ�ʽ����������
 * @author Leslie Leung
 */

public class BlockSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ary = {12, 3, 5, 6, 1, 34, 54, 36, 64, 76, 100};	//�����ҵ�����
		/* ����3�������� */
		IndexTable[] indexAry = new IndexTable[3];
		indexAry[0] = new IndexTable();
		indexAry[1] = new IndexTable();
		indexAry[2] = new IndexTable();
		
		/* ��ʼ������������key�ؼ�ֵ��ʾ�ÿ�������ֵ */		
		indexAry[0].address = 0;
		indexAry[1].address = 5;
		indexAry[2].address = 8;

		indexAry[0].key = 12;
		indexAry[1].key = 54;
		indexAry[2].key = 100;
		
		int input;
		System.out.print("������Ҫ���ҵ�Ԫ�أ�");
		input = scan.nextInt();
		
		if(input > indexAry[indexAry.length - 1].key) {
			System.out.println("Ҫ���ҵ�Ԫ�ر����������е�Ԫ�ض�Ҫ��");
			return;
		}
		
		/* ʹ�ö��ֲ��ҷ���Կ���в��ң��ҵ�Ԫ�����ڵĿ飬����������Ҫ���ҵ�Ԫ��Ϊ36 */
		int low = 0;
		int high = indexAry.length - 1;
		int mid = 0;
		while(low <= high) {
			mid = (low + high) / 2;
			if(indexAry[mid].key >= input) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		/* �ٶ��������˳����� */
		int low2, high2;
		low2 = indexAry[low].address;
		if(low == indexAry.length - 1) {
			high2 = ary.length - 1;
		} else {
			high2 = indexAry[low + 1].address - 1;
		}
		for(int i = low2; i <= high2; i ++) {
			if(ary[i] == input) {
				System.out.println("���ҳɹ�");
				return;
			}
		}
		System.out.println("����ʧ��");
		return;
	}
}

/* ������ */
class IndexTable {
	public int address;
	public int key;
}
