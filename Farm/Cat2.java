
public class Cat2 extends Animal {
	private boolean play;

	public Cat2() {
		super();
		play = true;

	}

	public Cat2(int weight, int height, String name, boolean play) {
		super(weight, height, name);
		this.play = play;
	}
	
	public void makeNoise()
	{
		System.out.println("Meow-Meow");
	}

	public boolean isPlay() {
		return play;
	}

	public void setPlay(boolean play) {
		this.play = play;
	}

	@Override
	public String toString() {
		return "Cat2 [" + super.toString() + " play=" + play + "]";
	}

}
