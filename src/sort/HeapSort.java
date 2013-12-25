package sort;

/**
 * �������㷨���������㷨ʵ���Ͼ�����ȫ��������˳��洢ʵ�֡�ͨ��������ʵ�ַ�ʽ�������¹��ɣ�
 * ��˫�׽ڵ���±�Ϊindex���������ӽڵ���±�Ϊ2 * index + 1�����Һ��ӽڵ���±�
 * Ϊ2 * index + 2���������㷨���ǲ���ɸѡ�����ѡ���ɸѡ���ٽ��ѵĹ��̣�ɸѡ�㷨ͨ����
 * ��ʵ�֡������㷨������Ǵ���ѣ��������㷨���Ӷ�ΪO(n * log2 n)��
 * @author Leslie Leung
 */

public class HeapSort {
	public static void main(String[] args) {
		int[] ary = {23, 57, 650, 43, 1000, 1000, 120};
		
		/* ��һ�ν��ѹ���Ҫ�����⴦��ͨ��ɸѡ�����������ѣ���������м�λ�ÿ�ʼɸѡ */
		for(int i = ary.length / 2 - 1; i >= 0; i --) {
			shift(ary, i, ary.length - 1);
		}
		System.out.print(ary[0] + "\t");	//��������׸�λ�õ�Ԫ��
		ary[0] = ary[ary.length - 1];	//���������һ��λ��Ԫ���Ƶ���λ
		
		for(int i = ary.length - 2; i > 0; i --) {
			shift(ary, 0, i);	//�ӵڶ��ν��ѿ�ʼ����������ĵ�һ��λ�ÿ�ʼɸѡ
			System.out.print(ary[0] + "\t");	//��������׸�λ�õ�Ԫ��
			ary[0] = ary[i]; 	//���������һ��λ��Ԫ���Ƶ���λ		
		}
		System.out.print(ary[0]);	//������һ��Ԫ��
		
	}
	
	/**
	 * ɸѡ�㷨���ݹ���ã�����Ԫ���ϸ�������
	 * @param ary Ҫ����ɸѡ������
	 * @param index ��ʾ�������±�Ϊindex��Ԫ�ؿ�ʼɸѡ
	 * @param virtualLastIndex �����������������һ��λ�õ��±꣬��ʾ����˼Ϊÿ���һ�δ����Ҫ��virturlLastIndex�Լ����Ӷ��������鳤��
	 */
	public static void shift(int[] ary, int index, int virtualLastIndex) {
		int temp;	//����һ����ʱ���������ڽ�����ֵ
		
		/* �ж�ɸѡ�㷨�Ƿ��Ѿ�����Ҷ�ӽڵ㣬���ǣ����ز������ݹ� */
		if(index > (virtualLastIndex - 1) / 2) {
			return;
		}
		
		/* ����ȫ����������ײ��������������������ڵ����ڶ����ĳ�ڵ�ֻ�����ӽڵ���������˫�׽ڵ�ֱ�Ӻ����ӽڵ���бȽϣ��������������ͽ������ݡ�
		 * �Ҽ�������ɸѡ���������±�Խ�磬���������Ƿ񽻻����ݣ���Ҫ���أ�������������  */
		if(virtualLastIndex == 2 * index + 1) {
			if(ary[index] <= ary[2 * index + 1]) {
				temp = ary[2 * index + 1];
				ary[2 * index + 1] = ary[index];
				ary[index] = temp;
				
				index = 2 * index + 1;
				shift(ary, index, virtualLastIndex);
			}
			
			return;
		}
		
		if(ary[2 * index + 1] <= ary[2 * index + 2] && ary[index] <= ary[2 * index + 2]) {//����Һ���ֵ��������ֵ��˫��ֵ�����Һ���ֵ
			/* �������� */
			temp = ary[2 * index + 2];
			ary[2 * index + 2] = ary[index];
			ary[index] = temp;
			
			index = 2 * index + 2;	
			shift(ary, index, virtualLastIndex);
			
		} else if(ary[2 * index + 1] > ary[2 * index + 2] && ary[index] <= ary[2 * index + 1]) {//�������ֵ�����Һ���ֵ����˫��ֵ��������ֵ
			/* �������� */
			temp = ary[2 * index + 1];
			ary[2 * index + 1] = ary[index];
			ary[index] = temp;
			
			index = 2 * index + 1;
			shift(ary, index, virtualLastIndex);
		}
	}
}
