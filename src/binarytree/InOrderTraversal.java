package binarytree;

import java.util.*;

/**
 * ��������������㷨���Ƚ���������������Ϊ�˷�������ҽ�������ȫ���������ٽ����������
 * @author Leslie Leung
 */

public class InOrderTraversal {
	
	private static final int MAX_DEPTH = 3;
	private static final boolean CREATE_LEFT = true;
	private static final boolean CREATE_RIGHT = true;
	
	private static int depth;
	private static Random random = new Random();
	
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode();
		root.value = random.nextInt(23);
		depth = 1;
		
		System.out.println("������ֵ��" + root.value + "\t������ڵĲ�Σ�" + depth);
		
		createBinaryTree(root);
		
		System.out.print("���������˳��Ϊ��");
		InOrder(root);
	}
	
	/**
	 * �����������㷨
	 * @param root ���ڵ�
	 */
	public static void createBinaryTree(BinaryTreeNode root) {
		if(depth == MAX_DEPTH) {
			return;
		}
		
		if(CREATE_LEFT) {
			BinaryTreeNode newNode = new BinaryTreeNode();
			newNode.value = random.nextInt(23);
			root.leftChild = newNode;
			depth ++;
			
			System.out.println("�����ֵ��" + newNode.value + "\t������ڵĲ�Σ�" + depth);
			
			createBinaryTree(newNode);
			depth --;
		}
		
		if(CREATE_RIGHT) {
			BinaryTreeNode newNode = new BinaryTreeNode();
			newNode.value = random.nextInt(23);
			root.rightChild = newNode;
			depth ++;
			
			System.out.println("�ҽ���ֵ��" + newNode.value + "\t������ڵĲ�Σ�" + depth);
			
			createBinaryTree(newNode);
			depth --;
		}
	}
	
	/**
	 * �������������
	 * @param root ���ڵ�
	 */
	public static void InOrder(BinaryTreeNode root) {
		
		if(root.leftChild != null) {
			InOrder(root.leftChild);
		}
		
		System.out.print(root.value + "\t");
		
		if(root.rightChild != null) {
			InOrder(root.rightChild);
		}
	}
}
