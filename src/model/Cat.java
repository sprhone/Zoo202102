//Changes made by Jaden Schuster

package model;

//added by Kelli

public class Cat {
	private String name;
	private String color;
	private int age;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	/**
	 * Returns string of cat's voice.
	 * @return "Meow!"
	 */
	public String speak() {
		// TODO Auto-generated method stub
		return "Meow!";
	}
	
	/**
	 * Returns string of cat's noise.
	 * @return "Pit pat."
	 */
	public String makeNoise() {
		return "Pit pat.";
	}

}
