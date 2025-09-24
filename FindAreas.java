package com.codegnan.oop.overriding;

public class FindAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f=new Figure(10,10);
		Rectangle r=new Rectangle(9,5);
		Triangle t=new Triangle(10,8);
		
		f=r;
		System.out.println("Area is:"+f.area());
		f=t;
		System.out.println("Area is:"+f.area());

	}

}
