//Changes made by Jaden Schuster

package model;
/**
 * @author Isaiah Wertz
 *
 */
public class Crow {
	private String name;
	private String weight;
	private int age;
	
	public Crow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Crow(String name, String weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Crow [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}

	/**
	 * Returns string of crow's voice.
	 * @return "Caw"
	 */
	public String speak() {
		return "Caw";
	}
	
	/**
	 * Returns string of crow's noise.
	 * @return "Flap flap."
	 */
	public String makeNoise() {
		return "Flap flap.";
	}
}
