
public class Bannoli implements IPizzaBake {
	Pizza pizza;
	String bakedBy = "Bannoli";
	
	@Override
	public Pizza bakePizza(String name, String orderedBy, String deliveredBy) {
		return pizza = new Pizza(name, orderedBy, deliveredBy, bakedBy);
	}

}
