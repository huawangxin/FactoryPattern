package cn.com.factory2;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item){
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("cheese");
		} else if(item.equals("veggie")){
			pizza = new VeggiePizzaa(ingredientFactory);
			pizza.setName("veggie");
		} else if(item.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("clam");
		} else if(item.equals("pepperoni")){
			pizza = new PepperoniPizzaa(ingredientFactory);
			pizza.setName("pepperoni");
		}
		return pizza;
			}
}
