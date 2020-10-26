
public class PizzaOrderedByPhone implements IPizzaOrder {
	IPizzaDelivery pizzaDelivery;
	String orderedBy = "Phone";
		
	public void setPizzaDelivery(IPizzaDelivery pizzaDelivery) {
		this.pizzaDelivery = pizzaDelivery;
	}

	@Override
	public Pizza orderPizza(String name) {
		return pizzaDelivery.deliverPizza(name, orderedBy);
	}

}
