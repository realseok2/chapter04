package com.javaex.ex01;

public class ObjectApp {

	public static void main(String[] args) {

		Object obj = new Object();

		// obj.getClass() 클래스 정보 출력
		System.out.println("#obj.getClass()-----------------------");
		System.out.println(obj.getClass());

		// obj.hashCode() 메모리주소값 출력
		System.out.println("#obj.hashCode()-----------------------");
		System.out.println(obj.hashCode());

		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());

		// toString() 인스턴스의 정보 출력
		System.out.println("#obj.toString()-----------------------");
		System.out.println(obj.toString());

		// equals() 인스턴스가 같은지 비교
		System.out.println("#obj.equals()-----------------------");
		System.out.println(obj.equals(obj));

	}

}
