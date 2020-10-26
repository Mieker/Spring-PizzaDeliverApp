
public class DeliveredByBike implements IPizzaDelivery {
	IPizzaBake pizzaBake;
	String deliveredBy = "Bike";
		
	public void setPizzaBake(IPizzaBake pizzaBake) {
		this.pizzaBake = pizzaBake;
	}

	@Override
	public Pizza deliverPizza(String name, String orderedBy) {
		return pizzaBake.bakePizza(name, orderedBy, deliveredBy);
	}

}
