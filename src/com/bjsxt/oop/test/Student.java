package com.bjsxt.oop.test;

public class Student {
		String name;
		String sex;
		int age;//��Ա����
		double score;
		//���췽��
		public Student(String name, String sex,int age,double score){
			this.name=name;
			this.sex= sex;
			this.age =age;
			this.age=age;
		}
		public Student(String name,String sex,double score){
			
			
		}
		
		
		//��Ա����
		public void shut(){
			System.out.println("������ѧ���Ͽ�");
		}
		public void intruduce(){
			System.out.println(name+ " "+sex+"  "+age+" ");
		}

		
		
		
		public static void main(String[] args) {
			 Student stu1 =new Student("hanji","��",20,30.4);
			 stu1.age=20;
			 stu1.name="hanji";
			 stu1.sex="��";
			 stu1.score=30.4;
			 stu1.shut();
			 stu1.intruduce();
			 //��������һ������
			 Student stu2 =new Student("xaioming","��",23,98.2);
			 stu2.age=23;
			 stu2.name="xiaoming";
			 stu2.sex="��";
			 stu2.score=98.2;
			 stu2.shut();
			 stu2.intruduce();
		}
}
