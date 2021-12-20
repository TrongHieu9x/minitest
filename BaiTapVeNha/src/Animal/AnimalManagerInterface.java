package Animal;

import java.util.ArrayList;

public interface AnimalManagerInterface {
    int run();
    String makeSound();
    void addAnimal(ArrayList<Animal> animalArrayList, Animal animal);
    void deleteAnimalByName(ArrayList<Animal> animalArrayList, String name);
    void editInformationByName(ArrayList<Animal> animalArrayList, String name);
    void displayAnimalByName(ArrayList<Animal> animalArrayList, String name);
    void displayAllAnimal(ArrayList<Animal> animalArrayList);
    void displayAllDog(ArrayList<Animal> animalArrayList, String name);
    void displayAllAnimalByRangeWeight(ArrayList<Animal> animalArrayList, double weight);
}
