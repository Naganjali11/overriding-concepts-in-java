package com.codegnan.oop.overriding;

public class MainFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				FoodItem item1 = new Pizza("Farmhouse", 300, "Large");
				item1.display();
				FoodItem item2 = new ChickenBurger("Grilled Chicken Burger", 180);
				item2.display();
				FoodItem item3 = new ColdDrink("Pepsi", 50);
				item3.display();
				FoodItem item4 = new Pizza("Paneer Tikka", 280, "Medium");
				item4.display();
				FoodItem item5 = new ChickenBurger("Zinger Burger", 200);
				item5.display();
				FoodItem item6 = new ColdDrink("Sprite", 60);
				item6.display();
				
		
	}

}
