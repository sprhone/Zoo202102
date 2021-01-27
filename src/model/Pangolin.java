//Changes made by Jaden Schuster

package model;
//Logan Riedell
public class Pangolin {
	//Variables 
	private String color;
	private int size;
	private int weight;
	
	//Constructors
	
	public Pangolin()
	{
		super();
		//Default
	}
	
	public Pangolin(String color, int size, int weight)
	{
		super();
		this.color = color;
		this.size = size;
		this.weight = weight;
	}

	//Methods
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pangolin [color=" + color + ", size=" + size + ", weight=" + weight + "]";
	}
	
	/**
	 * Returns string of pangolin's voice.
	 * @return "Squeak."
	 */
	public String speak() {
		return "Squeak.";
	}
	
	/**
	 * Returns string of Pangolin's noise.
	 * @return "Snort..."
	 */
	public String makeNoise()
	{
		String noise = "Snort...";
		return noise;
	}
}
