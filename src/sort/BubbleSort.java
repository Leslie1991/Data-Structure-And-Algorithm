package sort;

import java.util.Arrays;

/**
 * ð�������㷨��ʱ�临�Ӷ�ΪO(n * n)��
 * @author Leslie Leung
 */

public class BubbleSort {
	public static void main(String[] args) {
		int[] ary = {23, 1, 56, 87, 68, 45};
		int temp;	//�½�һ����ʱ����������������ֵ
		for(int i = 0; i < ary.length; i ++) {
			for(int j = 0; j < ary.length -1 - i; j ++) {
				if(ary[j + 1] < ary[j]) {
					temp = ary[j + 1];
					ary[j + 1] = ary[j];
					ary[j] = temp;
				}
			}
			System.out.println(Arrays.toString(ary));
		}
	}
}
