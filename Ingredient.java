public class Ingredient {
	String name;
	double weight;
	double percent;
	
	public Ingredient() {
		this("", 0.0, 0.0);
	}
	
	public Ingredient(String name, double weight, double percent) {
		this.name = name;
		this.weight = weight;
		this.percent = percent;
	}
}

