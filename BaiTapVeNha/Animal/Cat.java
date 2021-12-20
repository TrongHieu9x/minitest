package Animal;

public class Cat extends Animal implements AnimalManeger {


    public String makeSound() {
        return "Cat : meo...e..o..";
    }

    public String howToEat() {
        return "Eat Mouse";
    }
}
