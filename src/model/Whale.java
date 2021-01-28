package model;

public class Whale {
	private int age;
	private int weight;
	private String name;
	
	
	public Whale()
	{
		this.age = 0;
		this.weight = 0;
		this.name = "";
	}
	
	public Whale(int age, int weight, String name)
	{
		this.age = age;
		this.weight = weight;
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Whale [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}
	
	public String speak()
	{
		return "AWOOOOGGA";
	}
}
