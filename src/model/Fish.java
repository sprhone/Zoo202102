package model;

public class Fish {
	
	public String name;
	public String color;
	public int age;
	
	public Fish(){
		super();
	}
	
	public Fish(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		
	}
	
	public String speak() {
		return "glug glug glug"; //Fish Sounds
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}

}
