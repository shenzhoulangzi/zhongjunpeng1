package main.java.service;


public class TestMyQueue
{
	public static void main(String[] args)
	{	//ʵ����һ��ջ����ms������������
		MyStack ms=new MyStack(10);
		ms.push(12);
		ms.push(13);
		ms.push(14);
		ms.push(23);
		ms.push(24);
		ms.push(34);
		ms.push(36);
		ms.push(67);
		ms.push(88);
		ms.push(100);
		
		System.out.print("\n");
		System.out.print(ms.isEmpty()+"\n");//�ж�ջ�Ƿ�Ϊ��
		
		MyStack mq=new MyStack(10);//ʵ�����ڶ���ջ
		//�ѵ�һ��ջ���������������ջ�����
		for(int i=0;i<10;i++)
		{
			mq.push(ms.pop());
		}
		
		System.out.print(mq.isEmpty()+"\n");	
		//��ջ��Ϊ��ʱִ��
		while(!mq.isEmpty())
		{
			System.out.print(mq.pop()+",");
		}
		//������ջ���ж�ջ�Ƿ�Ϊ��
		System.out.println("\n");
		System.out.print(mq.isFull()+"\n");
		
	}
}
