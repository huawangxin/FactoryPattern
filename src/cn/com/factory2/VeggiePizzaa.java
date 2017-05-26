package cn.com.factory2;

public class VeggiePizzaa extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	public VeggiePizzaa(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	void prepare() {
		// TODO Auto-generated method stub

	}

}
