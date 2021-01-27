//Changes made by Jaden Schuster

package model;

public class Lion {
	private String name; 
	private int age; 
	private int weight; 
	public Lion() {} 
	public Lion(String name, int age, int weight) {
		this.name = name; 
		this.age = age; 
		this.weight = weight; 
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * Returns string of lion's voice.
	 * @return "Roar"
	 */
	public String speak() {
		return "Roar"; 
	}
	/**
	 * Returns string of lion's noise.
	 * @return "Tip toe."
	 */
	public String makeNoise() {
		return "Tip toe.";
	}
	@Override
	public String toString() {
		return "Lion [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}
}
