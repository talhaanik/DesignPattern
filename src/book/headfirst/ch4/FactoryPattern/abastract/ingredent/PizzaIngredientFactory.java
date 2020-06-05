package book.headfirst.ch4.FactoryPattern.abastract.ingredent;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies [] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();

}
