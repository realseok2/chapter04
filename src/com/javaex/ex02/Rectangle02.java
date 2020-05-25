package com.javaex.ex02;

public class Rectangle02 {

// --------------------------------------------------- 필드

	private int width;
	private int height;

// --------------------------------------------------- 생성자

	public Rectangle02(int width, int height) {
		this.width = width;
		this.height = height;
	}

// --------------------------------------------------- setter, getter

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

// --------------------------------------------------- equals()

	@Override
	public boolean equals(Object obj) {
		System.out.println("구해지는 면적이 같으면 두 객체가 같은 것으로 정의합니다.");
		Rectangle b = (Rectangle) obj;
		Rectangle c = (Rectangle) obj;
		Rectangle d = (Rectangle) obj;
		Rectangle e = (Rectangle) obj;

		if (this.width * this.height == b.getWidth() * b.getHeight()) {
			System.out.println("a와 b는 같은 객체로 인식됩니다.");
			return true;
		} else if (this.width * this.height == c.getWidth() * c.getHeight()) {
			System.out.println("a와 c는 같은 객체로 인식됩니다.");
			return true;
		} else if ((this.width * this.height) == d.getWidth() * d.getHeight()) {
			System.out.println("a와 d는 같은 객체로 인식됩니다.");
			return true;
		} else if (this.width * this.height == e.getWidth() * e.getHeight()) {
			System.out.println("a와 e는 같은 객체로 인식됩니다.");
			return true;
		} else if (d.getWidth() * d.getHeight() == e.getWidth() * e.getHeight()) {
			System.out.println("d와 e는 같은 객체로 인식됩니다.");
			return true;
		} else {
			System.out.println("두 객체는 다른 것으로 인식됩니다.");
			return false;
		}
	}

}
