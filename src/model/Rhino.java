//Changes made by Jaden Schuster

package model;

// Author Nick Ambroson

public class Rhino {
	private String name;
	private int weight;
	private int age;

	public Rhino() {
		super();
	}

	public Rhino(String name, int weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getColor() {
		return weight;
	}

	public void setColor(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Rhino [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}

	/**
	 * Returns string of rhino's voice.
	 * @return "Grunt"
	 */
	public String speak() {
		return "Grunt";
	}
	
	/**
	 * Returns string of rhino's noise.
	 * @return "Thud!"
	 */
	public String makeNoise()
	{
		return "Thud!";
	}

}
