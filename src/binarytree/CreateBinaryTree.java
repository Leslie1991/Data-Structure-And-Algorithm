package binarytree;

import java.util.*;

/**
 * �����������㷨��������Ϊ��ģ�⽨����������������������ȣ�����depth���������˽��������е�ǰ
 * ������ȣ���ҪBinaryTreeNode���ݽṹ����ʾ���е�ÿһ����㣬�����Ƿ񴴽�������ͨ��isCreateLeft
 * ��isCreateRight��ֵ���жϣ������������̾��ǵݹ���̣�����ͬʱ����һ����ǰ��ʽ�������Ĺ��̡�
 * @author Leslie Leung
 * @see PreOrderTraversal
 * @see InOrderTraversal
 * @see PostOrderTraversal
 */

public class CreateBinaryTree {
	
	public static final int MAX_DEPTH = 3;		//���������������
	
	private static int depth;	//���ڴ���ʱ��ʵ�����
	private static Random random = new Random();
	
	public static void main(String[] args) {
		
		BinaryTreeNode root = new BinaryTreeNode();		//�½������
		root.value = random.nextInt(33);
		depth = 1;		//�������ڵ���������Ϊ1
		System.out.println("����ֵ��" + root.value + "\t������ڵĲ�Σ�" + depth);
		
		createBinaryTreeNode(root);
	}
	
	/**
	 * �ݹ鴴������
	 * @param root ���ڵ�
	 */
	public static void createBinaryTreeNode(BinaryTreeNode root) {
		
		/* ����ȵ���������ʱ������ */
		if(depth == MAX_DEPTH) {
			return;
		}
		
		int isCreateLeft = random.nextInt(2);	//�ж��Ƿ񴴽���������1��ʾ������0��ʾ������
		int isCreateRight = random.nextInt(2);	//�ж��Ƿ񴴽���������1��ʾ������0��ʾ������
		
		/* ���������� */
		if(isCreateLeft == 1) {
			BinaryTreeNode newNode = new BinaryTreeNode();
			newNode.value = random.nextInt(33);
			root.leftChild = newNode;
			depth ++;	//ÿ����һ�Σ��������1
			
			System.out.println("����ֵ��" + newNode.value + "\t������ڵĲ�Σ�" + depth);
			
			createBinaryTreeNode(newNode);	//�ݹ鴴������
			depth --;	//ÿ����һ�Σ�depth --
		}
		
		/* ���������� */
		if(isCreateRight == 1) {
			BinaryTreeNode newNode = new BinaryTreeNode();
			newNode.value = random.nextInt(33);
			root.rightChild = newNode;
			depth ++;	//ÿ����һ�Σ��������1
			
			System.out.println("����ֵ��" + newNode.value + "\t������ڵĲ�Σ�" + depth);
			
			createBinaryTreeNode(newNode);	//�ݹ鴴������
			depth --;	//ÿ����һ�Σ�depth --
		}
	}
}

/* ����������� */
class BinaryTreeNode {
	public int value;
	public BinaryTreeNode leftChild = null;	//������
	public BinaryTreeNode rightChild = null;	//������
}