/*
 * 给定坐标求，两个坐标点的距离
 */


package com.bjsxt.oop.object;

public class Point {
		//成员变量
		int x;
		int y;
		int z;
		
		//构造方法
		public Point(){
		
		}
		public Point(int x,int y,int z){//构造方法的重载
			this.x=x;
			this.y=y;
			this.z=z;
			
		}
	   //成员方法
		public void showInfo(){
			System.out.println("x=  "+x+",y="+y+",z="+z);
		}
		public double distance(int x,int y,int z){
			double temp =(this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)+(this.z-z)*(this.z-z);
			double dis =Math.sqrt(temp);//成员方法的重载
			return dis;
		}
		public double distance(Point p){
			double temp =(this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)+(this.z-z)*(this.z-z);
			double dis =Math.sqrt(temp);
			return dis;
		}

		//方法的调用
			public static void  main(String[] args){
				// point 
				Point p1=new Point();
				p1.x =20;
				p1.y=50;
				p1.z=20;
				p1.showInfo();
				Point p2 =new Point(10,30,20);
				p2.showInfo();
				double dis =p2.distance(10,30,10);
				System.out.println(dis);
				double dis2 =p2.distance(p1.x,p1.y,p1.z);
				System.out.println(dis2);
				double dis3 =p2.distance(p1);
				System.out.println(dis3);
			}
			
			
			
			
}