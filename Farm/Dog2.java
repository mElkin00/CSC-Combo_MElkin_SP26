
public class Dog2 extends Animal {
	private boolean fetch;

	public Dog2() {
		super();
		fetch = true;

	}

	public Dog2(int weight, int height, String name, boolean fetch) {
		super(weight, height, name);
		this.fetch = fetch;
	}
	
	public void makeNoise()
	{
		System.out.println("Woof-Woof");
	}

	public boolean isFetch() {
		return fetch;
	}

	public void setFetch(boolean fetch) {
		this.fetch = fetch;
	}

	@Override
	public String toString() {
		return "Dog2 [" + super.toString() + "fetch = " + fetch + "]";
	}

}
