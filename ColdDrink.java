package com.codegnan.oop.overriding;

public class ColdDrink extends FoodItem {
	
		public ColdDrink(String name, double basePrice) {
			super(name, basePrice);
			
		}

		@Override
		public double calculateTotalPrice() {
			
			return basePrice;
		}

		@Override
		public String getCategory() {
			// TODO Auto-generated method stub
			return "Beverage";
		}

		@Override
		public int getPreparationTime() {
			// TODO Auto-generated method stub
			return 2;
		}
		public void display() {
			System.out.println("Food Item: "+name);
			System.out.println("Base Price: ₹ "+basePrice);
			System.out.println("Category: "+getCategory());
			System.out.println("Preparation Time: "+getPreparationTime()+"min");
			System.out.println("Total Price: ₹"+calculateTotalPrice());
			}

	}



