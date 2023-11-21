package creational.factory.factories;

import creational.factory.objects.Animal;
import creational.factory.objects.Cat;

public class CatFactory implements AnimalFactory{

    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
