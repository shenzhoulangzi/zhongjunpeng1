package main.java.service;
/*
 ջ���Ƚ�����������Ƚ��ȳ������ݽṹ��Ҫʹ��ջ��ʵ��һ�����У�����Ҫ��������ջ��ʵ�֣�
 ����������ջ��ʵ��
  */
public class MyStack
{	
	private long arr[];//�ȶ���һ��long���͵�������������ջ���������
	private int top;//����ջ��
	//���캯��
	public MyStack()
	{
		arr=new long[10];		
		top=-1;
	}
	//���εĹ��캯��
	public MyStack(int maxsize)
	{
		arr=new long[maxsize];
		top=-1;
	}
	//��������
	public void push(long value)
	{
		arr[++top]=value;//top��������ִ��,��ʼֵΪ-1,������Ϊ0
	}
	//���ջ��Ԫ��ֵ
	public long pop()
	{	
		return arr[top--];//������ջ��topΪ����ĳ��ȣ���Ҫ��1��Ӧ��������һ��ֵ
		
	}
	
	public long peek()
	{
		return arr[top];
	}
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty()
	{
		return top==-1;//���ջΪ�գ���top=-1�����top==-1�򷵻�true
	}
	//�ж�ջ�Ƿ�����
	public boolean isFull()
	{
		return top==arr.length-1;
	}
}
