package com.codegnan.oop.overriding;

public class ChickenBurger extends FoodItem {

	double charges;
		public ChickenBurger(String name, double basePrice) {
			super(name, basePrice);
		}

		@Override
		public double calculateTotalPrice() {
			charges=70;
			return basePrice+charges;
		}

		@Override
		public String getCategory() {
			
			return "Non-veg";
		}

		@Override
		public int getPreparationTime() {
			
				return 15;
		}
		public void display() {
			System.out.println("Food Item: "+name);
			System.out.println("Base Price: ₹ "+basePrice);
			System.out.println("Category: "+getCategory());
			System.out.println("Preparation Time: "+getPreparationTime()+"min");
			System.out.println("Total Price: ₹"+calculateTotalPrice());
			}

	}



