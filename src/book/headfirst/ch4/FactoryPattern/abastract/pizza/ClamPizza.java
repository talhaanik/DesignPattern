package book.headfirst.ch4.FactoryPattern.abastract.pizza;

import book.headfirst.ch4.FactoryPattern.abastract.ingredent.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		
		this.ingredientFactory = ingredientFactory;
	}


	@Override
	public void prepare() {
		System.out.println("Preparing "+name);
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSauce();
		cheese=ingredientFactory.createCheese();
		clams=ingredientFactory.createClams();

	}

}
