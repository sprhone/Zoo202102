package model;

public class Koala {
	private String name;
	private int age;
	private String furColor;
	
	public Koala() {}
	
	public Koala(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.furColor = color;
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
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public String speak() {
		return "*Banshee Koala screams*";
	}

	@Override
	public String toString() {
		return "Koala [name=" + name + ", age=" + age + ", furColor=" + furColor + "]";
	}
	
}
