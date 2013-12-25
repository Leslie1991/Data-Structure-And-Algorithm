package matrix;

import java.util.*;

/**
 * �Գƾ���ѹ���洢�㷨��һ��n�׾�������ó���Ϊn * (n + 1) / 2��һά�������洢�������±���һά�����±��
 * ��Ӧ��ϵΪk = I * (I + 1) / 2 + J����symmetricMatrix[i][j],I = max(i, j),J = min(i, j)����
 * Ҳ����˵����ֻ��Ҫ��ȷ��Ҫ�ĶԳƾ���Ľ��������ݽ�������һά���飬Ȼ������ݴ洢��һά��������Ϳ���ʵ�ֶԳƾ����ѹ���洢�ˡ�
 * �����ҰѾ��󶼽����ˣ��������ڼ������ѹ�������Ƿ���ȷ��
 * @author Leslie Leung
 */

public class SymmetricMatrixCompress {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col;
		int elem = 0;
		/* �½���ά����洢�Գƾ��� */
		int[][] symmetricMatrix = new int[4][4];
		/* �Ѿ���ѹ����һά�������棬��n�׶Գƾ�����ԣ�ֵ��ͬԪ�ز��ظ��洢������ֻ��洢n * (n + 1) / 2����
		 * ���Գ�ʼ��һά���鳤��Ϊn * (n + 1) / 2  */
		int[] compressAry = new int[10];
		/* һά�����±�������±�����Ŷ�Ӧ��ӳ���ϵ������symmetricMatrix[i][j],I = max(i, j),J = min(i, j)
		 * ��һά�����±�k = I * (I + 1) / 2 + J 
		 * ���ɶԳƾ���ѹ����һά������*/
		for(int i = 0; i < 4; i ++) {
			for(int j = i; j < 4; j ++) {
				elem ++;
				symmetricMatrix[i][j] = elem;
				symmetricMatrix[j][i] = elem;
				/* ѹ����һά������ */
				if(i >= j) {
					compressAry[i * (i + 1) / 2 + j] = symmetricMatrix[i][j]; 
				} else if(i < j) {
					compressAry[j * (j + 1) / 2 + i] = symmetricMatrix[j][i];
				}
			}
		}
		/* ������ɵĶԳƾ��� */
		System.out.println("���ɵĶԳƾ���Ϊ��");
		for(int i = 0; i < 4; i ++) {
			for(int j = 0; j < 4; j ++) {
				System.out.print(symmetricMatrix[i][j] + (j == 3 ? "\n" : "\t"));
			}
		}
		/* ��֤�Ƿ�ѹ���ɹ� */
		while(true) {
			System.out.print("���������ĵ�һ���±�i��");
			row = scan.nextInt();
			if(row > 3) {
				System.out.println("�����±�Խ�磬���������룡");
				continue;
			}
			System.out.print("���������ĵڶ����±�j��");
			col = scan.nextInt();
			if(col > 3) {
				System.out.println("�����±�Խ�磬���������룡");
				continue;
			}
			
			if(row >= col) {
				System.out.println("һά�����еĶ�ӦֵΪ" + compressAry[row * (row + 1) / 2 + col]);
			} else if(row < col) {
				System.out.println("һά�����еĶ�ӦֵΪ" + compressAry[col * (col + 1) / 2 + row]);
			}
			
		}
	}
}
