package com.bjsxt.oop.object;
/*
 * 方法的重载
 */
public class fCaldender2 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20;
		int num2 =30;
		fCaldender2 cal =new fCaldender2();
		int result = cal.add(num1,num2);
		System.out.println(result);
		result = cal.add(10,20,30);
		System.out.println(result);
		double result2=cal.add(20.5,30.2);
		System.out.println(result2);
		}
		public int add(int num1,int num2){
		
		int result;
		result =num1+num2;
		return result;
		}
		/*
		 * 方法重载
		 */
		public   double add(double num1,double num2){
		double result;
		result =num1+num2;
		return result;
		}
		/*
		 * 方法的重载
		 */
		
		public int add(int num1,int num2, int num3){
			
			int result;
			result =num1+num2+num3;
			return result;
			}
	
}


