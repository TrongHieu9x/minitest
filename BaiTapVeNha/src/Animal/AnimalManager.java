package Animal;

import java.util.Arrays;

public class AnimalManager {
    private Animal[] animals;
    private static int index = 0;

    public AnimalManager(Animal[] animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        if (index == animals.length) {
            animals = Arrays.copyOf(animals, animals.length * 2);
        }
        animals[index] = animal;
        index++;
        System.out.println("Them ok");
        System.out.println("------------");
    }

    public void deleteAnimal(String name) {
        index = 0;
        Animal[] animalList = new Animal[animals.length];
        for (Animal animal : animals) {
            if (animal != null && !animal.getName().equals(name)) {
                animalList[index] = animal;
                index++;
            }
        }
        animals = animalList;
        System.out.println("Xoa ok");
        System.out.println("----------");
    }

    public void displayAnimal() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
        System.out.println("------------");
    }


}
