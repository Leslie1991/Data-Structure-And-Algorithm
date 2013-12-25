package sort;

import java.util.Arrays;

/**
 * ���������㷨��ʱ�临�Ӷ�Ϊʱ�临�Ӷ�ΪO(n * log2 n)��
 * @author Leslie Leung
 */

public class QuickSort {
	public static void main(String[] args) {
		int[] ary = {1, 45, 12, 7, 15, 32, 1, 86, 54, 33, 28};
		int low = 0;	//��¼��ʼ���±�	
		int high = ary.length - 1;		//��¼���һ���±�
		
		quickSort(ary, low, high);	//��������
		
		System.out.println(Arrays.toString(ary));
	}

	/**
	 * ���ݹؼ���ֵ���з�����ʹ�ùؼ�����ߵ��������ڻ���ڹؼ��֣��ұߵ��������ڻ���ڹؼ���
	 * @param ary Ҫ���з���������
	 * @param low ��ʼλ�õ��±�
	 * @param high ����λ�õ��±�
	 */
	public static int partition(int[] ary, int low, int high) {
		int temp = ary[low];	//������ʱ����temp
		while(low < high) {
			
			while(low < high && ary[high] >= temp) {
				high --;
			}
			
			ary[low] = ary[high];
			
			while(low < high && ary[low] <= temp) {
				low ++;
			}
			
			ary[high] = ary[low];
			
		}
		
		ary[low] = temp;
		return low;
	}
	
	/**
	 * �ݹ�ʵ�ֿ�������
	 * @param ary Ҫ���п������������
	 * @param low ��ʼλ�õ��±�
	 * @param high ����λ�õ��±�
	 */
	public static void quickSort(int[] ary, int low, int high) {
		int mid;	//�����м�ֵ
		
		if(low < high) {
			mid = partition(ary, low, high);	//����
			quickSort(ary, low, mid - 1);
			quickSort(ary, mid + 1, high);
		}
	}
}
