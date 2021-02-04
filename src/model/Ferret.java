package model;

/*
 * Tyler Chrusciel, tlchrusciel@dmacc.edu, 1/28/2021
 */

public class Ferret {
	public String name;
	public String color;
	public int age;
	
	public Ferret(){
		super();
	}
	
	public Ferret(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		
	}
	
	public String makeNoise() {
		return "SCREEE"; // idk what noise ferrets make.
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
