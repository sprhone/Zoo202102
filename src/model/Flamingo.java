//Changes made by Jaden Schuster

package model;
/**
 * Flamingo
 * @author Jeremy Brannen
 *
 */
public class Flamingo {
	
	String name;
	String gender;
	int height;
	
	public Flamingo() {
	}

	public Flamingo(String name, String gender, int height) {
		this.name = name;
		this.gender = gender;
		this.height = height;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Flamingo [name=" + name + ", gender=" + gender + ", height=" + height + "]";
	}
	
	/**
	 * Returns string of flamingo's voice.
	 * @return "Squak, Squak!"
	 */
	public String speak() {
		return "Squak, Squak!";
	}
	
	/**
	 * Returns string of flamingo's noise.
	 * @return "Flap flap."
	 */
	public String makeNoise() {
		return "Flap flap.";
	}


}
