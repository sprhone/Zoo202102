package model;


public class Hamster {
    private String name;
    private String color;
    private int age;

    public Hamster(){}

    public Hamster(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String makeNoise(){
        return "Squeek";
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

    public String getType() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}