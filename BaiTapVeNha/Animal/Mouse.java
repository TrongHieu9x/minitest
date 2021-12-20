package Animal;

public class Mouse extends Animal implements AnimalManeger {

    public String makeSound() {
        return "Mouse : Chít..ít..ịt";
    }

    public String howToEat() {
        return "Eat Dog";
    }
}
