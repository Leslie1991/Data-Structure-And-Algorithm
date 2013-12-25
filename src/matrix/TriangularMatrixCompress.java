package matrix;

import java.util.*;

/**
 * ���Ǿ���ѹ���洢�㷨����Գƾ���ѹ���洢�㷨����һ����ֻ��Ҫ������һ��������¼��ֵ0
 * @author Leslie Leung
 */

public class TriangularMatrixCompress {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int row, col;
		
		int[][] triangularMatrix = new int[4][4];
		/* ��Գƾ������ƣ�n�׾���ͬ����Ҫ����Ϊn * (n + 1) / 2��һά����洢ѹ��������Ǿ���
		 * ������Ҫһ������const�洢��ֵ0
		 */
		int[] compressAry = new int[10];
		final int CONST = 0;
		/* ��ʼ�����Ǿ���,������ģ�������Ǿ���,��Գƾ������ƣ������±���һά�����±���
		 * ��Ӧ��ӳ���ϵ */
		for(int i = 0; i < 4; i ++) {
			for(int j = 0;j < 4; j ++) {
				if(j > i) {
					triangularMatrix[i][j] = 0;
				} else if(j <= i) {
					triangularMatrix[i][j] = random.nextInt(20);
					/* ѹ���洢 */
					compressAry[i * (i + 1) / 2 + j] = triangularMatrix[i][j];
				}
			}
		}
		/* ������Ǿ��� */
		System.out.println("���ɵ����Ǿ���Ϊ��");
		for(int i = 0; i < 4; i ++) {
			for(int j = 0; j < 4; j ++) {
				System.out.print(triangularMatrix[i][j] + (j == 3 ? "\n" : "\t"));
			}
		}
		/* ��֤�Ƿ�ѹ���ɹ� */
		while(true) {
			System.out.print("���������ĵ�һ���±꣺");
			row = scan.nextInt();
			if(row > 3) {
				System.out.println("�����±�Խ��");
				continue;
			}
			System.out.print("���������ĵڶ����±꣺");
			col = scan.nextInt();
			if(col > 3) {
				System.out.println("�����±�Խ��");
				continue;
			}

			if(row >= col) {
				System.out.println("һά����Ķ�ӦֵΪ��" + compressAry[row * (row + 1) / 2 + col]);
			} else if(row < col) {
				System.out.println("һά����Ķ�ӦֵΪ��" + CONST);
			}
		}
	}
}
