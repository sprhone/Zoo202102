package model;

/**
 * Alexander Pontier ampontier1
 * 202101 CIS175 26740
 * Jan 28, 2021
 */
public class Vulture {
	
	//intializing variables
	private String name;
	private double height;
	private double weight;
	private String color;
	private String breed;
	private String endangeredStatus;
	
	//constructors
	public Vulture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vulture(String name, double height, double weight, String color, String breed, String endangeredStatus) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.breed = breed;
		this.endangeredStatus = endangeredStatus;
	}
	//Getters and Setters
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
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getEndangeredStatus() {
		return endangeredStatus;
	}
	public void setEndangeredStatus(String endangeredStatus) {
		this.endangeredStatus = endangeredStatus;
	}
	
	//method
	public String speak() {
		return "Food, glorious food!";
	}

}
