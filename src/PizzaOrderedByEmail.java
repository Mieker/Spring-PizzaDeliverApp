
public class PizzaOrderedByEmail implements IPizzaOrder {
	IPizzaDelivery pizzaDelivery;
	String orderedBy = "E-mail";
		
	public void setPizzaDelivery(IPizzaDelivery pizzaDelivery) {
		this.pizzaDelivery = pizzaDelivery;
	}

	@Override
	public Pizza orderPizza(String name) {
		return pizzaDelivery.deliverPizza(name, orderedBy);
	}

}
