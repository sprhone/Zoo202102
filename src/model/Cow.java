//Changes made by Jaden Schuster

package model;

public class Cow {
    private String name;
    private String breed;
    private int age;

    public Cow(){}

    public Cow(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    /**
	 * Returns string of cow's voice.
	 * @return "Moo"
	 */
    public String speak(){
        return "Moo";
    }
    
    /**
	 * Returns string of cow's noise.
	 * @return "Clomp clomp."
	 */
	public String makeNoise() {
		return "Clomp clomp.";
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}