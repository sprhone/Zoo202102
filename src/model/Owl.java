package model;


/**
 * @author James Meendering
 *
 */
public class Owl {
	private String classificationType;
	private double weight;
	private double height;

	public Owl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owl(String classificationType, double weight, double height) {
		super();
		this.classificationType = classificationType;
		this.weight = weight;
		this.height = height;
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

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Owl [name=" + classificationType + ", weight=" + weight + ", height=" + height + "]";
	}

	public String speak() {
		// TODO Auto-generated method stub
		return "A one.. A two-HOO... A tha-three... <crunch>";
	}
}
