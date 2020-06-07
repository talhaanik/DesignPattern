package book.headfirst.ch4.FactoryPattern.abastract.ingredent;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		
		return new ThickCrushtDough();
	}

	@Override
	public Sauce createSauce() {
		
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new Mozzarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[]= {new BlackOlives(),new Spinach(),new EggPlant()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		// TODO Auto-generated method stub
		return new FrozenClam();
	}

}
