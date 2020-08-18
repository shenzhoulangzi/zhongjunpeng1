package main.java.service;
/*
 栈是先进后出、队是先进先出的数据结构，要使用栈来实现一个队列，则需要至少两个栈来实现，
 本次以两个栈来实现
  */
public class MyStack
{	
	private long arr[];//先定义一个long类型的数组用来储存栈插入的数据
	private int top;//定义栈顶
	//构造函数
	public MyStack()
	{
		arr=new long[10];		
		top=-1;
	}
	//带参的构造函数
	public MyStack(int maxsize)
	{
		arr=new long[maxsize];
		top=-1;
	}
	//插入数据
	public void push(long value)
	{
		arr[++top]=value;//top先自增再执行,初始值为-1,自增后为0
	}
	//输出栈顶元素值
	public long pop()
	{	
		return arr[top--];//经过进栈后top为数组的长度，需要减1对应数组的最后一个值
		
	}
	
	public long peek()
	{
		return arr[top];
	}
	//判断栈是否为空
	public boolean isEmpty()
	{
		return top==-1;//如果栈为空，则top=-1，如果top==-1则返回true
	}
	//判断栈是否已满
	public boolean isFull()
	{
		return top==arr.length-1;
	}
}
