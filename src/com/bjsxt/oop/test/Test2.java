package com.bjsxt.oop.test;

public class Test2 {
	
		int x;//��Ա����
		int y;
		
		
	public static void main(String[] args) {
		Test2 ts2=new Test2();//�½�һ������
		ts2.x=10; 
		ts2.y=30;
		System.out.println("����ǰ��x�ǣ� "+ts2.x+"����ǰ��y�� "+ts2.y);
				//������������
		Swap(ts2);//�����ĵ���
				
				//�����������
		System.out.println("�������x�� "+ts2.x+"�������y�� "+ts2.y);
			}
			
	public static void Swap(Test2 ts2){
		System.out.println("swap����ǰ��x�ǣ� "+ts2.x+"����ǰ��y�� "+ts2.y);
		int temp;
		temp= ts2.x;
		ts2.x=ts2.y;
		ts2.y=temp;
		System.out.println("swap�������x�� "+ts2.x+"�������y�� "+ts2.y);
	
	
	}

}
