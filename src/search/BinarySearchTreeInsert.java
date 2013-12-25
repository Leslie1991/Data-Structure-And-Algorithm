package search;

/**
 * ��������������㷨����binarytree�����Ҳ���ǰ������ķ�ʽ����������������������������һ�ַ�����
 * ���������뽨���������������������Ĺ��̾��ǲ��ϲ���Ĺ��̣����������������Ժ�����ڶ���������в���
 * Ԫ�أ��ҵõ��ͷ��أ��Ҳ����Ͳ��룬����˵�����㷨Ҳ��һ������������Ĳ��ҹ��̣���������㷨���Խ��н�
 * �������ҺͲ�����������ݶ�����������ص㣬��������ɹ������������������صó������
 * @author Leslie Leung
 */

public class BinarySearchTreeInsert {
	public static void main(String[] args) {
		int[] key = {66, 34, 15, 56, 24, 78, 90, 12, 59};	//����������洢���¹ؼ�������,������֤
		
		/* ������ò���ķ�ʽ��������������������Ľ�������Ҳ���Ƕ���������Ĳ������  */
		BTreeNode root = new BTreeNode();
		root.value = key[0];
		for(int i = 1; i < key.length; i ++) {
			/* �½��ڵ㲢��ֵ */
			BTreeNode newNode = new BTreeNode();
			newNode.value = key[i];
			
			createBinarySearchTree(root, newNode);
		}
		
		System.out.print("���������");
		InOrderTraversal(root);
	}
	
	/**
	 * ����������������̣�����һ���ݹ�Ĺ���
	 * @param root �������ĸ��ڵ�
	 * @param newNode ������������½��
	 */
	public static void createBinarySearchTree(BTreeNode root, BTreeNode newNode) {
		
		if(newNode.value < root.value) {
			/* ���������Ϊ�գ�ֱ�Ӳ��� */
			if(root.leftChild == null) {
				root.leftChild = newNode;
				return;
			}
			
			/* �����������Ϊ�գ��ݹ���ò����� */
			root = root.leftChild;
			createBinarySearchTree(root, newNode);
		}
		
		if(newNode.value > root.value) {
			/* ���������Ϊ�գ�ֱ�Ӳ��� */
			if(root.rightChild == null) {
				root.rightChild = newNode;
				return;
			}
			
			/* �����������Ϊ�գ��ݹ���ò��� */
			root = root.rightChild;
			createBinarySearchTree(root, newNode);
			
		}
	}
	
	/* ���������������������Ϊ�����֤����������������ɹ�  */
	public static void InOrderTraversal(BTreeNode root) {
		if(root.leftChild != null) {
			InOrderTraversal(root.leftChild);
		}
		
		System.out.print(root.value + "\t");
		
		if(root.rightChild != null) {
			InOrderTraversal(root.rightChild);
		}
	}
}

class BTreeNode {
	public int value;
	public BTreeNode leftChild = null;
	public BTreeNode rightChild = null;
}