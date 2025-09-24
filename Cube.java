package com.codegnan.oop.overriding;

import java.util.Scanner;

public class Cube extends Shape {
	public void calculateVolume() {
		
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Side of the Cube:");
		double side=scanner.nextDouble();
		double volume=side*side*side;
		//double volume=Math.pow(side,3);
		System.out.printf("Volume of Cube:%.2f\n",volume);
	}

}
