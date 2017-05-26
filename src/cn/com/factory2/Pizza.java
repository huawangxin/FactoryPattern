package cn.com.factory2;

public abstract class Pizza {

	public String name;
	public Dough dough;
	public Sauce sauce;
	public Veggies veggies[];
	public Cheese cheese;
	public Pepperoni pepperoni;
	public Clams clam;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into dagonal slice");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
