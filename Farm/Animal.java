
public class Animal {
	private int weight;
	private int height;
	private String name;
	
	public Animal() {
		super();
		this.weight = 0;
		this.height = 0;
		this.name = "";
	}

	public Animal(int weight, int height, String name) {
		super();
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
	public void makeNoise()
	{
		System.out.println("Bleeeearch");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}
	
	
}
