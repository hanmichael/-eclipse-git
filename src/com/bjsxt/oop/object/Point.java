/*
 * �������������������ľ���
 */


package com.bjsxt.oop.object;

public class Point {
		//��Ա����
		int x;
		int y;
		int z;
		
		//���췽��
		public Point(){
		
		}
		public Point(int x,int y,int z){//���췽��������
			this.x=x;
			this.y=y;
			this.z=z;
			
		}
	   //��Ա����
		public void showInfo(){
			System.out.println("x=  "+x+",y="+y+",z="+z);
		}
		public double distance(int x,int y,int z){
			double temp =(this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)+(this.z-z)*(this.z-z);
			double dis =Math.sqrt(temp);//��Ա����������
			return dis;
		}
		public double distance(Point p){
			double temp =(this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)+(this.z-z)*(this.z-z);
			double dis =Math.sqrt(temp);
			return dis;
		}

		//�����ĵ���
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