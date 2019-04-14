package main.java.service;
//测试
public class TestTree 
{
	public static void main(String[] args) 
	{	//插入6个数据
		Tree tree=new Tree();
		tree.insert(10,"zhong");
		tree.insert(20,"jun");
		tree.insert(15,"peng");
		tree.insert(3,"li");
		tree.insert(4,"xiao");
		tree.insert(5,"xiao");
		
//		System.out.println(tree.root.data);
//		System.out.println(tree.root.rightChild.data);
//		System.out.println(tree.root.rightChild.leftChild.data);
//		System.out.println(tree.root.leftChild.data);
		
		
		tree.frontOrder(tree.root);
		System.out.println("\n");
		tree.inOrder(tree.root);
		System.out.println("\n");
		tree.afterOrder(tree.root);
		
		
	}
}
