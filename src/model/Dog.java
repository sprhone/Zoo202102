//Changes made by Jaden Schuster

package model;

public class Dog {
	private String DogName;
	private String type;
	private int Age;
	
	public Dog() {    //Ben's Dog, based of the Cat Class
		super();
	}
	public Dog(String DogName, String type, int Age) {
		this.DogName = DogName;
		this.type = type;
		this.Age = Age;
	}
	public String getDogName() {
		return DogName;
	}
	public void setDogName(String dogName) {
		DogName = dogName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public String toString() {
		return "Dog: name=" + DogName + ", color=" + type + ", age=" + Age + "";
	}
	/**
	 * Returns string of dog's voice.
	 * @return "Woof"
	 */
	public String speak() {
		// TODO Auto-generated method stub
		return "Woof";
	}
	/**
	 * Returns string of dog's noise.
	 * @return "Grr!"
	 */
	public String makeNoise() {
		return "Grr!";
	}
	
}
