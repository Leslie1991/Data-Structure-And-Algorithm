package search;

import java.util.*;

/**
 * ���ֲ��ҷ��������Ҹ����˶��ֲ��ҵĵݹ�ʵ�ֺ�whileѭ��ʵ��(whileѭ��ʵ�ּ�ע�͵Ĵ���)
 * @author Leslie Leung
 */

public class BinarySearch {
	public static void main(String[] args) {
		int[] ary = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
		/* �ݹ��������Ԫ��3 */
		int low = 0;
		int high = ary.length - 1;
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		/* �ж�����Ԫ���Ƿ��������������Ԫ�� */
		if(input > ary[ary.length - 1]) {
			System.out.println("�Ҳ�����Ԫ��");
			return;
		}

		int result = binarySearch(ary, low, high, input);
		if(result == -1) {
			System.out.println("�Ҳ�����Ԫ��");
		} else {
			System.out.println("��Ԫ�ص��±�Ϊ��" + result);
		}
	}
	public static int binarySearch(int[] ary, int low, int high,int target) {
		/* �ݹ�ʵ�ֶ��ֲ��� */
		int mid = (low + high) / 2;
		if(ary[mid] == target) {
			return mid;
		} else if(ary[mid] > target) {
			high = mid - 1;
			/* �ж��Ƿ��ҵ���Ԫ�� */
			if(low == high && ary[low] != target) {
				return -1;
			}
			
			return binarySearch(ary, low, high ,target);
		} else{
			low = mid + 1;
			/* �ж��Ƿ��ҵ���Ԫ�� */
			if(low == high && ary[low] != target) {
				return -1;
			}
			
			return binarySearch(ary, low, high ,target);
		}
		/* ͨ��whileѭ��ʵ�ֶ��ֲ��� */
//		int mid = 0;
//		while(low <= high) {
//			mid = (low + high) / 2;
//			if(target > ary[mid]) {
//				low = mid + 1;
//			} else if(target < ary[mid]) {
//				high = mid - 1;
//			} else if(target == ary[mid]) {
//				return mid;
//			}
//		}	
//		return -1;
	}
}
