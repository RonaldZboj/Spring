package org.ronaldzboj.javabrains;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();

	}

}
