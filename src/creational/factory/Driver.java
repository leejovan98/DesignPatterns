package creational.factory;

import creational.factory.factories.AnimalFactory;
import creational.factory.factories.CatFactory;
import creational.factory.factories.DogFactory;

public class Driver {
    public static void main(String[] args) {
        catSounds();
        dogSounds();
    }

    public static void catSounds(){
        AnimalFactory animalFactory = new CatFactory();
        System.out.println(animalFactory.getAnimal().makeNoise());
    }

    public static void dogSounds(){
        AnimalFactory animalFactory = new DogFactory();
        System.out.println(animalFactory.getAnimal().makeNoise());
    }
}
