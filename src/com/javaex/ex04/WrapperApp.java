package com.javaex.ex04;

public class WrapperApp {

	public static void main(String[] args) {

		Integer i = new Integer(10); // int i = 10;
		System.out.println(i);

		Integer i01 = new Integer(2);
		Integer i02 = new Integer(5);
		Integer result01 = i01 + i02;
		System.out.println(result01);

		Integer result02 = new Integer(2) + new Integer(7);
		System.out.println(result02);

		Integer i03 = 4; // int i03 = 4; 와 비교해볼 것
		System.out.println("-----------------------------------");

		Integer i04 = 10; // 박싱 --> i04라는 박스안에 10을 담는다.

		Integer i05 = new Integer(100);
		int i06 = i05; // 언박싱 --> i06은 i05라는 박스를 담을 수 없기에 박스를 풀러 내용물만 꺼내서 담는다.

		System.out.println("-----------------------------------");

		Integer i10 = new Integer(100);

		int i11 = i10.parseInt("1234"); // 문자를 --> 숫자로 변환 이 방식은 틀린 것은 아니지만 좋은 방식은 아님.
		System.out.println(i11 + 1);

		int i12 = Integer.parseInt("1234");
		System.out.println(i12 + 1);

		String s100 = new String("100");
		String s101 = s100.valueOf(100); // 숫자(정수)를 문자로 변환
		System.out.println(s101 + 1); // 100(문자) + 1(숫자) --> 1001

		String s102 = String.valueOf(100);
		System.out.println(s102 + 1);

	}

}
