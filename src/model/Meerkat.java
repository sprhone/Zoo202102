package model;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Jan 28, 2021
 */
public class Meerkat {
	private String name;
	private int age;
	private double height;
	
	public Meerkat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meerkat(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Meerkat [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	public String speak()
	{
		return "Hakuna Matata!";
	}
	
	
}
