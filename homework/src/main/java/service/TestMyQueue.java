package main.java.service;


public class TestMyQueue
{
	public static void main(String[] args)
	{	//实例化一个栈对象ms；并插入数据
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
		System.out.print(ms.isEmpty()+"\n");//判断栈是否为空
		
		MyStack mq=new MyStack(10);//实例化第二个栈
		//把第一个栈输出的数据重新入栈再输出
		for(int i=0;i<10;i++)
		{
			mq.push(ms.pop());
		}
		
		System.out.print(mq.isEmpty()+"\n");	
		//当栈不为空时执行
		while(!mq.isEmpty())
		{
			System.out.print(mq.pop()+",");
		}
		//经过出栈后判断栈是否为空
		System.out.println("\n");
		System.out.print(mq.isFull()+"\n");
		
	}
}
