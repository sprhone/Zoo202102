//Jaden Schuster

package model;

public class Monkey {
	
	private String name;
	private int age;
	private String favoriteFood;

	public Monkey() {
		// TODO Auto-generated constructor stub
	}
	
	public Monkey(String name, int age, String favoriteFood) {
		this.name = name;
		this.age = age;
		this.favoriteFood = favoriteFood;
	}
	
	/**
	 * Returns string of monkey's voice.
	 * @return "Haa haa!"
	 */
	public String speak() {
		return "Haa haa!";
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

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	@Override
	public String toString() {
		return "Monkey [name=" + name + ", age=" + age + ", favoriteFood=" + favoriteFood + "]";
	}
	
}
