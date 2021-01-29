package model;

/**
 * Alexander Pontier ampontier1
 * 202101 CIS175 26740
 * Jan 28, 2021
 */
public class Wolf {
	
	//initializing variables
	private String name;
	private double height;
	private double weight;
	private String color;
	private boolean goodboy;
	
	//Constructors
	public Wolf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wolf(String name, double height, double weight, String color, boolean goodboy) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.goodboy = goodboy;
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
	public boolean isGoodboy() {
		return goodboy;
	}
	public void setGoodboy(boolean goodboy) {
		this.goodboy = goodboy;
	}
	
	//method
	public String speak() {
		return "Arwoo!";
	}

}
