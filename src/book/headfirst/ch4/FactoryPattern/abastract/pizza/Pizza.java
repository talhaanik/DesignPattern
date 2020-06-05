package book.headfirst.ch4.FactoryPattern.abastract.pizza;

import book.headfirst.ch4.FactoryPattern.abastract.ingredent.Cheese;
import book.headfirst.ch4.FactoryPattern.abastract.ingredent.Clams;
import book.headfirst.ch4.FactoryPattern.abastract.ingredent.Dough;
import book.headfirst.ch4.FactoryPattern.abastract.ingredent.Pepperoni;
import book.headfirst.ch4.FactoryPattern.abastract.ingredent.Sauce;
import book.headfirst.ch4.FactoryPattern.abastract.ingredent.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies [];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	
 
	public abstract void prepare();
  
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	public void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
  
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		
	for (int i = 0; i < veggies.length; i++) {
			display.append(veggies[i] + "\n");
		}
		display.append(cheese + "\n");
		display.append(pepperoni + "\n");
		display.append(clams + "\n");
		
		return display.toString();
	}
}
