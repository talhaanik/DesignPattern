package book.headfirst.ch4.FactoryPattern.abastract.store;

import book.headfirst.ch4.FactoryPattern.abastract.pizza.Pizza;
import book.headfirst.ch4.FactoryPattern.abastract.pizza.VeggiePizza;
import book.headfirst.ch4.FactoryPattern.abastract.pizza.CheesePizza;
import book.headfirst.ch4.FactoryPattern.abastract.pizza.ClamPizza;
import book.headfirst.ch4.FactoryPattern.abastract.pizza.PepperoniPizza;
import book.headfirst.ch4.FactoryPattern.abastract.store.PizzaStore;
import book.headfirst.ch4.FactoryPattern.abastract.ingredent.NYPizzaIngredientFactory;
import book.headfirst.ch4.FactoryPattern.abastract.ingredent.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

	
	 Pizza createPizza(String item) {
		Pizza pizza=null;
		PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
		if(item.equals("cheese")) {
			pizza=new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else if(item.equals("veggie")) {
			pizza=new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		}else if(item.equals("clam")) {
			pizza=new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}else if(item.equals("pepperoni")) {
			pizza=new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}

		return pizza;
	}

}
