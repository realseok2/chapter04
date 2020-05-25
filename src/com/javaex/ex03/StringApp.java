package com.javaex.ex03;

public class StringApp {

	public static void main(String[] args) {

		String s01 = new String("h1");
		String s02 = new String("h2");

		System.out.println(s01 == s02); 						// s01과 s02는 주소가 서로 다르다.
		System.out.println(s01.hashCode()); 			// hashCode는 주소가 아니다.
		System.out.println(s02.hashCode()); 			// hashCode는 주소가 아니다.
		System.out.println("-------------------------------------------");
		
		String s03 = "hello";
		String s04 = "hello";
		
		System.out.println(s03 == s04);						// s03과 s04는 주소가 같다.
		
		System.out.println(s03.hashCode());				// 주소가 아니다.
		System.out.println(s04.hashCode());				// 주소가 아니다.
		System.out.println("-------------------------------------------");
		
		s04 = "hello!!!!!!!!!!!!!!";
		System.out.println(s03 == s04);
		
		System.out.println(s03);
		System.out.println(s04);
		
		
		

	}

}
