package com.javaex.ex02;

public class Point {

//--------------------------------------------				필드

	private int x;
	private int y;

//--------------------------------------------				생성자

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//--------------------------------------------				setter, getter

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//--------------------------------------------				draw()

	public void draw() {
		System.out.println("#X_[ " + x + " ],   #Y_[ " + y + " ] 를 그렸습니다.");
	}

	// equals() 재정의

	@Override
	public boolean equals(Object obj) { // p01.equals(p02)를 예제로 사용합니다.
		System.out.println("equals 재정의");
		Point p = (Point) obj;

		if ((this.x == p.x) && (this.y == p.y)) {
			return true;
		} else {
			return false;
		}

	}

	// toString() 재정의
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
