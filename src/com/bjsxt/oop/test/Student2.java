package com.bjsxt.oop.test;

public class Student2 {
	String name;
	String sex;//��Ա����
	int age;
	double score;

	Student2(String name) {
		this.name = name; //���췽��
	}

	Student2(String name, String sex) { //���췽��������
		Student2 s3=new Student2(name);
		this.sex = sex;
		s3.info();
	}

	/*Student(String name, String sex, int age) {
		new Student(name, sex);
		this.age = age;
	}

	Student(String name, String sex, int age, double score) {
		Student s3 = new Student(name, sex, age);
		this.score = score;
		s3.info();
	}*/

	public void info() {   //��Ա����
		System.out.println("name=" + name + ",sex=" + sex + ",age=" + age
				+ ",score=" + score);
	}

	public static void main(String[] args) {
		Student2  s1 = new Student2("����", "��");//��������
		s1.info();
	}
}
