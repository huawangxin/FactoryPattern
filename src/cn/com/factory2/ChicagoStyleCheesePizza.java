package cn.com.factory2;

public class ChicagoStyleCheesePizza extends PizzaStore{
	
//	public ChicagoStyleCheesePizza() {
//		name = "Chicago Style Sauce and Cheese Pizza";
//		dough = "extra thick Crust Dough";
//		sauce = "Plum tomato Sauce";
//		toppings.add("Grated Reggiano Cheese");
//	}

	void cut(){
		System.out.println("Cutting the pizza into sequare slices");
	}

	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
