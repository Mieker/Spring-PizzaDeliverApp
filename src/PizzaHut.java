
public class PizzaHut implements IPizzaBake {
	Pizza pizza;
	String bakedBy = "Pizza Hut";
	
	@Override
	public Pizza bakePizza(String name, String orderedBy, String deliveredBy) {
		return pizza = new Pizza(name, orderedBy, deliveredBy, bakedBy);
	}

}
