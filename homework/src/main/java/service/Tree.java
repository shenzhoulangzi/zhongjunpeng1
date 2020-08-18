package main.java.service;
//����һ�Ŷ��������Ҳ�������
public class Tree 
{	
	public Node root;//��������
	//�����������ݣ�С����ڵ���������������ڸ��ڵ����������
	public void insert(long value,String sData)
	{	
		
		Node newnode=new Node(value,sData);//�������Ľ��
		Node current=root;//��ǰ���Ϊ�����
		Node parent;//���ڸ����
		
		if(root==null)
		{
			root=newnode;//������ڵ�Ϊ�գ�֤��һ��ʼû�����ݣ�����Ľ����Ϊ���ڵ�
			return;
		}
		else 
		{
			while(true)//�����Ϊ������в���
			{
				parent=current;//�ѵ�ǰ��㸽�Ӹ����ӽڵ�
				//������ڵ���ڲ���ֵ�������������
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
//ǰ��
	public void frontOrder(Node localNode)
	{	
		if(localNode!=null)//�����������Ϊ�����������
		{	//�ȷ��ʸ��ڵ��ٷ���������������������
			System.out.println(localNode.data+","+localNode.sData);
			frontOrder(localNode.leftChild);
			frontOrder(localNode.rightChild);			
		}
	}
//����ʵ��
	public void inOrder(Node localNode)
	{
		if(localNode!=null)
		{	
			inOrder(localNode.leftChild);
			System.out.println(localNode.data+","+localNode.sData);		
			inOrder(localNode.rightChild);			
		}
	}
//����ʵ��
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
