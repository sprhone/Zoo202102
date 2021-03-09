package model;

/**
 * Alexander Pontier ampontier1
 * 202101 CIS175 26740
 * Jan 28, 2021
 */
public class Fox {
	
	//initializing variables
	private String name;
	private double height;
	private double weight;
	private String color;
		
	//constructors
	public Fox() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fox(String name, double height, double weight, String color) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
	}
		
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
		
	//method
	public String speak() {
		return "Ring-da-ding-ding-ding"; 
	}

}
