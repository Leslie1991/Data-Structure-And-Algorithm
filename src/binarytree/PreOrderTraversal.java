package binarytree;

import java.util.*;

/**
 * ǰ������������㷨������Ҫ��������������Ϊ�������Ľ�������������ǰ����̽����ģ�
 * ����ǰ�����������Ľ��˳�������ʱ�Ľ��˳����ͬ��Ϊ������飬���ｨ����ȫ����
 * ����
 * @author Leslie Leung
 */

public class PreOrderTraversal {
	
	private static final int MAX_DEPTH = 3;
	private static final boolean CREATE_LEFT = true;
	private static final boolean CREATE_RIGHT = true;
	
	private static int depth;
	private static Random random = new Random();
	
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode();
		root.value = random.nextInt(20);
		depth = 1;
		
		System.out.println("������ֵ��" + root.value + "\t������ڵĲ�Σ�" + depth);
		
		createBinaryTree(root);		//����������
		
		System.out.print("ǰ�������˳��Ϊ��");
		preOrder(root);		//ǰ�����������
	}
	
	/**
	 * �ݹ齨��������
	 * @param root ���ĸ����
	 */
	public static void createBinaryTree(BinaryTreeNode root) {
		
		/* �ﵽ�趨��������ʱ������ */
		if(depth == MAX_DEPTH) {
			return;
		}
		
		/* ���������� */
		if(CREATE_LEFT) {
			BinaryTreeNode newNode = new BinaryTreeNode();
			newNode.value = random.nextInt(20);
			root.leftChild = newNode;
			depth ++;
			
			System.out.println("�����ֵ��" + newNode.value + "\t������ڵĲ�Σ�" + depth);
			
			createBinaryTree(newNode);
			depth --;
		}
		
		/* ���������� */
		if(CREATE_RIGHT) {
			BinaryTreeNode newNode = new BinaryTreeNode();
			newNode.value = random.nextInt(20);
			root.rightChild = newNode;
			depth ++;
			
			System.out.println("�ҽ���ֵ��" + newNode.value + "\t������ڵĲ�Σ�" + depth);
			
			createBinaryTree(newNode);
			depth --;
		}
	}
	
	/**
	 * ǰ�����������
	 * @param root �����
	 */
	public static void preOrder(BinaryTreeNode root) {
		
		System.out.print(root.value + "\t");
		
		if(root.leftChild != null) {
			preOrder(root.leftChild);
		}
		
		if(root.rightChild != null) {
			preOrder(root.rightChild);
		}
	}
}
