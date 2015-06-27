package com.bjsxt.oop.test;

public class Test1 {
	public static void main(String[] args) {
		//给出两个变量
		int x=10;
		int y=20;
		
		System.out.println("交换前的x是： "+x+"交换前的y是 "+y);
		//交换两个变量
		Swap(x,y);
		
		//输出两个变量
		System.out.println("交换后的x是 "+x+"交换后的y是 "+y);
	}
	public static void Swap(int x,int y){
		System.out.println("swap交换前的x是： "+x+"交换前的y是 "+y);
		int temp;
		temp= x;
		x=y;
		y=temp;
		System.out.println("swap交换后的x是 "+x+"交换后的y是 "+y);
	}
}
