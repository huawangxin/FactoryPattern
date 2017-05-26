package cn.com.factory2;

public class PepperoniPizzaa extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	public PepperoniPizzaa(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	void prepare() {
		// TODO Auto-generated method stub

	}

}
