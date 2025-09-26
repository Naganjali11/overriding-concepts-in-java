package com.codegnan.oop.overriding;

public class Pizza extends FoodItem{
	 
		String size;
		int price=0;
		public Pizza(String name, double basePrice,String size) {
			super(name, basePrice);
			this.size=size;
		}

		@Override
		public double calculateTotalPrice() {
			if(size.equals("Large")) {
				price=200;
			}else if(size.equals("Medium")) {
				price=100;
			}else {
				price=50;
			}
			
			return basePrice+price;
		}

		@Override
		public String getCategory() {
			
			return "veg";
		}

		@Override
		public int getPreparationTime() {
			if(name.equals("Farmhouse")) {
			return 25;
			}else
				return 22;
		}
		public void display() {
			System.out.println("Food Item: "+name);
			System.out.println("Base Price: ₹ "+basePrice);
			System.out.println("Category: "+getCategory());
			System.out.println("Preparation Time: "+getPreparationTime()+"min");
			System.out.println("Total Price: ₹"+calculateTotalPrice());
			}

	}



