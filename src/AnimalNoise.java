//Changes made by Jaden Schuster

import model.Cat;
import model.Cow;
import model.Crow;
import model.Dog;
import model.Pig;
import model.Rhino;
import model.Duck;
import model.Mongoose;
import model.Frog;
import model.Flamingo;
import model.Owl;
import model.Chinchilla;
import model.Horse;
import model.Lion;
import model.Pangolin;

public class AnimalNoise {

	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {

		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		
		Dog doggy = new Dog();
		System.out.println(doggy.speak());
		
		Pig wilbur = new Pig();
		System.out.println(wilbur.speak());

		Cow moomoo = new Cow();
		System.out.println(moomoo.speak());
		
		Duck ducky = new Duck();
		System.out.println(ducky.speak());
		
		Mongoose rikkitikkitavi = new Mongoose();
		System.out.println(rikkitikkitavi.speak());
		
		Frog Froggo = new Frog();
		System.out.println(Froggo.speak());
    
		Flamingo Ricco = new Flamingo();
		System.out.println(Ricco.speak());
		
		Owl mrOwl = new Owl();
		System.out.println(mrOwl.speak());

		Chinchilla bobby = new Chinchilla();
		System.out.println(bobby.speak());
		
		Rhino spike = new Rhino();
		System.out.println(spike.speak());
    
		Horse horse = new Horse();
		System.out.println(horse.speak());
		
		Crow crow = new Crow();
		System.out.println(crow.speak());

		Lion lion = new Lion(); 
		System.out.println(lion.speak());
		
		Pangolin george = new Pangolin();
		System.out.println(george.speak());
		
		System.out.println(fluffy.makeNoise());
		
		System.out.println(doggy.makeNoise());
		
		System.out.println(wilbur.makeNoise());

		System.out.println(moomoo.makeNoise());
		
		System.out.println(ducky.makeNoise());
		
		System.out.println(rikkitikkitavi.makeNoise());
		
		System.out.println(Froggo.makeNoise());
    
		System.out.println(Ricco.makeNoise());
		
		System.out.println(mrOwl.makeNoise());

		System.out.println(bobby.makeNoise());
		
		System.out.println(spike.makeNoise());
    
		System.out.println(horse.makeNoise());

		System.out.println(crow.makeNoise());

		System.out.println(lion.makeNoise());
		
		System.out.println(george.makeNoise());

	}
}


