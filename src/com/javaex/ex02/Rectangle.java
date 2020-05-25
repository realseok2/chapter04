package com.javaex.ex02;

public class Rectangle {

//---------------------------------------------------					필드	

	private int width;
	private int height;

//---------------------------------------------------					생성자

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

//---------------------------------------------------					setter, getter

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

//---------------------------------------------------					equals()

	@Override
	public boolean equals(Object obj) {
		System.out.println("각각의 가로, 세로의 값이 같으면 같은 것으로 정의합니다.");
		Rectangle b = (Rectangle) obj;
		Rectangle c = (Rectangle) obj;

		if (this.width == b.width && this.height == b.height) {
			System.out.println("a와 b 두 객체는 같은 것으로 인식됩니다.");
			return true;
		} else if (this.width == c.width && this.height == c.height) {
			System.out.println("a와 c 두 객체는 같은 것으로 인식됩니다.");
			return true;
		} else {
			System.out.println("두 객체는 다른 것으로 인식됩니다.");
			return false;
		}

	}

}
