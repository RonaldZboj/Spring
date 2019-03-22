package org.ronaldzboj.javabrains;

public class Triangle implements Shape {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

	
	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");

	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitializingBean called from Triangle");
	 * 
	 * }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DisposibleBean called from Triangle");
	 * 
	 * }
	 */
	public void myInit() {
		System.out.println("myInit called from Triangle");
	}
	
	public void cleanUp() {
		System.out.println("cleanUp called from Triangle");
	}

}
