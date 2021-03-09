/**
 * @author ClaytonBlake - csblake
 * CIS175 - Spring 2021
 * 03/03/2021
 */
package model;

public class Elephant {
	// instance variables
	private String name;
	private String color;
	private int age;
	
	// constructors
	public Elephant() {
		super();
	}
	
	public Elephant(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	// getters and setters
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
		return "Elephant [name=" + name + ", color=" + color + ", age=" + age + "]";
	}	
	
	public String speak() {
		return "The elephant trumpeted!";
	}
}
