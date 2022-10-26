package com.napmkmk.test;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX.xml");// 컨텐이너 설정
		ctx.refresh();
		
		Student stu1 = ctx.getBean("student", Student.class); //컨테이너 사용
		System.out.println(stu1.getName());//컨테이너 사용
		System.out.println(stu1.getAge());//컨테이너 사용
		
		Student stu2 = ctx.getBean("student", Student.class); //컨테이너 사용
		stu2.setName("김유신");
		stu2.setAge(50);
		System.out.println(stu2.getName());//컨테이너 사용
		System.out.println(stu2.getAge());//컨테이너 사용
		System.out.println("------------");
		System.out.println(stu1.getName());//컨테이너 사용
		System.out.println(stu1.getAge());//컨테이너 사용
		
		
		
		ctx.close(); //컨테이너 종료
		
	}	

}
