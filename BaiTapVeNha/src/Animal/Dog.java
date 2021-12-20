package Animal;

public class Dog extends Animal {

    private String takeAShower;

    public Dog(String name, int age, double weight, String takeAShower) {
        super(name, age, weight);
        this.takeAShower = takeAShower;
    }

    public String getTakeAShower() {
        return takeAShower;
    }

    public void setTakeAShower(String takeAShower) {
        this.takeAShower = takeAShower;
    }

        public String makeSound() {
        return "Dog : go-go - let's go";
    }

    public String howToEat() {
        return "Eat Cat";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "takeAShower='" + takeAShower + '\'' +
                '}';
    }
}
