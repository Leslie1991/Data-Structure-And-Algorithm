package sort;

import java.util.Arrays;

/**
 * ѡ�������㷨��ʱ�临�Ӷ�ΪO(n * n)��
 * @author Leslie Leung
 */

public class SelectSort {
	public static void main(String[] args) {
		int[] ary = {23, 1, 56, 87, 68, 45};
		int index, temp;	//index���ڼ�¼���Խ���������ֵ���±꣬tempΪ��ʱ����
		for(int i = 0; i < ary.length; i ++) {
			index = i;
			for(int j = i + 1; j < ary.length; j ++) {
				//���ϱȽϲ��ҳ���Сֵ���±�
				if(ary[j] < ary[index]) {
					index = j;
				}
			}
			//ѡ������������������ֵ
			if(index != i) {
				temp = ary[index];
				ary[index] = ary[i];
				ary[i] = temp;
			}
			System.out.println(Arrays.toString(ary));
		}
	}
}
