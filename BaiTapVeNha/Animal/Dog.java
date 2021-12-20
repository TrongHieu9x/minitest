package Animal;

public class Dog extends Animal implements AnimalManeger {


    public String makeSound() {
        return "Dog : go-go - let's go";
    }

    public String howToEat() {
        return "Eat Cat";
    }
}
