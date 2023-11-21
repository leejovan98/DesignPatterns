package creational.factory.factories;

import creational.factory.objects.Animal;
import creational.factory.objects.Cat;
import creational.factory.objects.Dog;

public class DogFactory implements AnimalFactory{

    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
