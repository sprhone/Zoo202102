package model;
//Author Joshua Wood
public class Axolotl {
	private int age;
	private int length;
	private int weight;
	//Default constructor
	public Axolotl()
	{
		
	}
	public Axolotl(int age, int length, int weight) {
		this.age = age;
		this.length = length;
		this.weight =  weight;
	}
	//Setters and getters
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	public int getLength()
	{
		return length;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public int getWeight()
	{
		return weight;
	}
	//returns a string with the animal noise
	public String speak()
	{
		return "*Axolotl noises*";
	}
	@Override
	//returns all of the information about the animal
	public String toString() {
		return "Axolotl [age=" + age + "length=" + length + "weight=" + weight+"]";
	}
	
}
