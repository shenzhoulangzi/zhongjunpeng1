package main.java.service;
/*����Ҫʵ�ֶ�������ǰ������ͺ��������Ϊ�˷��㱾�εĲ�������������ݰ��ա�С��������������
 * �����������ķ�ʽ���������ݣ��������β���10��20��15��3��4��5���������Ϊ
 *				10
 *	3		 				20
 *		4 				15
 * 			5			
 */
//����һ�����
public class Node 
{
	public long data;//��������
	public String sData;//��������
	public Node leftChild;//������
	public Node rightChild;//������
	
	public Node(long data,String sData)
	{
		this.data=data;
		this.sData=sData;
	}
}
