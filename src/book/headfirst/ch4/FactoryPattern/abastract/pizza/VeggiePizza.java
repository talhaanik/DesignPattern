package book.headfirst.ch4.FactoryPattern.abastract.pizza;

import book.headfirst.ch4.FactoryPattern.abastract.ingredent.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+name);
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSauce();
		veggies=ingredientFactory.createVeggies();

	}

}
