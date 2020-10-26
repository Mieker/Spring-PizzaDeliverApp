
public class Consumer {
	IPizzaOrder pizzaOrder;
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setPizzaOrder(IPizzaOrder pizzaOrder) {
		this.pizzaOrder = pizzaOrder;
	}

	public Pizza orderPizza() {
		return pizzaOrder.orderPizza(name);
	}

}
