package com.kodilla.spring.shape;

import com.kodilla.spring.Shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTests {

	@Test
	public void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("circle");
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is a circle", name);
	}

	@Test
	public void testTriangleLoadedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("triangle");
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is a triangle", name);
	}

	@Test
	public void testSquareLoadedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("createSquare");
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is a square", name);
	}

	@Test
	public void testShapeLoadedIntoCointainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("choosenShape");
		//When
		String name = shape.getShapeName();
		//Then
		System.out.println("Choosen shape says: " + name);
	}

	@Test
	public void testContext() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		//When & Then
		System.out.println("==== Beans list: === >>");
		Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		System.out.println("<< ==== Beans list ===");
	}
}
