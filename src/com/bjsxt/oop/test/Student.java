package com.bjsxt.oop.test;

public class Student {
		String name;
		String sex;
		int age;//成员变量
		double score;
		//构造方法
		public Student(String name, String sex,int age,double score){
			this.name=name;
			this.sex= sex;
			this.age =age;
			this.age=age;
		}
		public Student(String name,String sex,double score){
			
			
		}
		
		
		//成员方法
		public void shut(){
			System.out.println("我在尚学堂上课");
		}
		public void intruduce(){
			System.out.println(name+ " "+sex+"  "+age+" ");
		}

		
		
		
		public static void main(String[] args) {
			 Student stu1 =new Student("hanji","男",20,30.4);
			 stu1.age=20;
			 stu1.name="hanji";
			 stu1.sex="男";
			 stu1.score=30.4;
			 stu1.shut();
			 stu1.intruduce();
			 //创建另外一个对象
			 Student stu2 =new Student("xaioming","男",23,98.2);
			 stu2.age=23;
			 stu2.name="xiaoming";
			 stu2.sex="男";
			 stu2.score=98.2;
			 stu2.shut();
			 stu2.intruduce();
		}
}
