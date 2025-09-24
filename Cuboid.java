package com.codegnan.oop.overriding;

import java.util.Scanner;

public class Cuboid extends Cube{
	public void calculateVolume() {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Length of the Cuboid:");
		double length=scanner.nextDouble();
		System.out.println("Width of Cuboid:");
		double width=scanner.nextDouble();
		System.out.println("Height of Cuboid:");
		double height=scanner.nextDouble();
		double volume=length*width*height;
		System.out.printf("Volume of the Cuboid:%.2f\n",volume);
		
		
	}

}
