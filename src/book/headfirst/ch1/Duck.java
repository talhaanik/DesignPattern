package book.headfirst.ch1;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();	
	
	public void perfromFly() {
		flyBehavior.fly();
	}
	public void perfromQuack() {
		quackBehavior.quck();
		
	}
	
	public void swim() {
		System.out.println("All swimm");
	}


}
