package sort;

import java.util.Arrays;

/**
 * ���������㷨��ʱ�临�Ӷ�ΪO(n * n)��
 * @author Leslie Leung
 */

public class InsertSort {
	public static void main(String[] args) {
		int[] ary = {23, 1, 56, 87, 68, 45};
		int k, j;	//��������������k����洢Ҫ�����ֵ	
		for(int i = 1; i < ary.length; i ++) {
			k = ary[i];		
			for(j = i - 1; j >= 0 && k < ary[j]; j --) {
				ary[j + 1] = ary[j];	//������λ�滻����
			}			
			ary[j + 1] = k;		//���뵽��Ӧλ����
			System.out.println(Arrays.toString(ary));
		}
	}
}
