package book.headfirst.ch2.observer.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
