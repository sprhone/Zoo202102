package model;

public class Horse {
	private String breed;
	private String name;
	private String age;
	private String gender;
	private String color;

	public Horse() {
		super();
	}
 
	public Horse(String breed, String name, String age, String gender, String color) {
		super();
		this.breed = breed;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
	}
	
	public String speak() {
		return "neigh";
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Horse [breed=" + breed + ", name=" + name + ", age=" + age + ", gender=" + gender + ", color=" + color
				+ "]";
	}
	

}
