
public class Pizza {
	String name, bakedBy, deliveredBy, orderedBy;

	public Pizza(String name, String orderedBy, String deliveredBy, String bakedBy) {
		super();
		this.name = name;
		this.bakedBy = bakedBy;
		this.deliveredBy = deliveredBy;
		this.orderedBy = orderedBy;
	}

	public void history() {
		System.out.println("Pizza: " + name + "\nBakery: " + bakedBy + "\nDelivered by: " + deliveredBy + "\nOrdered by: " + orderedBy);
	}

}
