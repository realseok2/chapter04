package com.javaex.ex03;

public class StringApp2 {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",efg ");

		a = a.concat(b); //	선택된 문자를 결합	-->	abcd,efg

		System.out.println(a);

		a = a.trim(); // 문자의 앞과 뒤에 있는 공백을 모두 삭제

		System.out.println(a);

		a = a.replace("ab", "12"); // 선택된 문자를 다른 문자로 변경
		System.out.println("------------------------------------------");

		String[] sArray = a.split(","); // 선택 문자를 기준으로 앞 뒤를 분리(배열방식으로 분리가 되므로 형식에 맞게 코드를 작성해야함)
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}

		System.out.println(a);

		String str = "Hello Java~"; // 앞에서부터 선택된 숫자만큼의 문자를 삭제한 후 그 다음 문자부터 출력
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 3)); // 첫 번째 선택 번호부터 두 번째 선택번호 직전까지 출력
		System.out.println(str.charAt(4)); // 선택된 숫자의 배열에 해당하는 내용을 출력

		String s01 = "abc";
		String s02 = "def";

		if (s01.equals(s02)) {
			System.out.println("두 문자열은 서로 같습니다.");
		} else {
			System.out.println("두 문자열은 서로 다릅니다.");
		}

	}

}
