package cn.com.factory2;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoniz createPepperoni();
	public Clams createClam();
	
}
