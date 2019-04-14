package main.java.service;
/*本次要实现二叉树的前序、中序和后序遍历，为了方便本次的操作把输入的数据按照“小数在左子树大数
 * 在右子树”的方式来插入数据，例如依次插入10、20、15、3、4、5，则二叉树为
 *				10
 *	3		 				20
 *		4 				15
 * 			5			
 */
//定义一个结点
public class Node 
{
	public long data;//结点的数据
	public String sData;//结点的数据
	public Node leftChild;//左子树
	public Node rightChild;//右子树
	
	public Node(long data,String sData)
	{
		this.data=data;
		this.sData=sData;
	}
}
