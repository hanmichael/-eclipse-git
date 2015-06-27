package com.bjsxt.oop.test;

public class Test2 {
	
		int x;//成员变量
		int y;
		
		
	public static void main(String[] args) {
		Test2 ts2=new Test2();//新建一个对象
		ts2.x=10; 
		ts2.y=30;
		System.out.println("交换前的x是： "+ts2.x+"交换前的y是 "+ts2.y);
				//交换两个变量
		Swap(ts2);//方法的调用
				
				//输出两个变量
		System.out.println("交换后的x是 "+ts2.x+"交换后的y是 "+ts2.y);
			}
			
	public static void Swap(Test2 ts2){
		System.out.println("swap交换前的x是： "+ts2.x+"交换前的y是 "+ts2.y);
		int temp;
		temp= ts2.x;
		ts2.x=ts2.y;
		ts2.y=temp;
		System.out.println("swap交换后的x是 "+ts2.x+"交换后的y是 "+ts2.y);
	
	
	}

}
