package com.bjsxt.oop.test;

public class Test1 {
	public static void main(String[] args) {
		//������������
		int x=10;
		int y=20;
		
		System.out.println("����ǰ��x�ǣ� "+x+"����ǰ��y�� "+y);
		//������������
		Swap(x,y);
		
		//�����������
		System.out.println("�������x�� "+x+"�������y�� "+y);
	}
	public static void Swap(int x,int y){
		System.out.println("swap����ǰ��x�ǣ� "+x+"����ǰ��y�� "+y);
		int temp;
		temp= x;
		x=y;
		y=temp;
		System.out.println("swap�������x�� "+x+"�������y�� "+y);
	}
}
