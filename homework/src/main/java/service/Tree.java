package main.java.service;
//定义一颗二叉树并且插入数据
public class Tree 
{	
	public Node root;//定义根结点
	//像树插入数据，小与根节点的做左子树，大于根节点的在右子树
	public void insert(long value,String sData)
	{	
		
		Node newnode=new Node(value,sData);//定义插入的结点
		Node current=root;//当前结点为根结点
		Node parent;//定于父结点
		
		if(root==null)
		{
			root=newnode;//如果根节点为空，证明一开始没有数据，插入的结点作为根节点
			return;
		}
		else 
		{
			while(true)//如果不为空则进行插入
			{
				parent=current;//把当前结点附加给父子节点
				//如果根节点大于插入值，则插入左子树
				if(current.data>value)
				{
					current=current.leftChild;	
					if(current==null)
					{
						parent.leftChild=newnode;
						return;
					}
				}
				else
				{
					current=current.rightChild;
					if(current==null)
					{
						parent.rightChild=newnode;
						return;
					}
				}
			}
		}		
	}
//前序
	public void frontOrder(Node localNode)
	{	
		if(localNode!=null)//如果二叉树不为空则进行排序
		{	//先访问根节点再访问左子树最后访问右子树
			System.out.println(localNode.data+","+localNode.sData);
			frontOrder(localNode.leftChild);
			frontOrder(localNode.rightChild);			
		}
	}
//中序实现
	public void inOrder(Node localNode)
	{
		if(localNode!=null)
		{	
			inOrder(localNode.leftChild);
			System.out.println(localNode.data+","+localNode.sData);		
			inOrder(localNode.rightChild);			
		}
	}
//后序实现
	public void afterOrder(Node localNode)
	{
		if(localNode!=null)
		{	
			afterOrder(localNode.leftChild);	
			afterOrder(localNode.rightChild);
			System.out.println(localNode.data+","+localNode.sData);	
		}
	}

}
