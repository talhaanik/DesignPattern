package book.headfirst.ch4.FactoryPattern.abastract;

import book.headfirst.ch4.FactoryPattern.abastract.store.PizzaStore;
import book.headfirst.ch4.FactoryPattern.abastract.store.NYPizzaStore;
import book.headfirst.ch4.FactoryPattern.abastract.pizza.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		
		/*PizzaStore chicagoStore = new ChicagoPizzaStore();
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");*/
	}

}
