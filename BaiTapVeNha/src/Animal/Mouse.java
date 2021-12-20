package Animal;

public class Mouse extends Animal {
    private String thief;

    public Mouse(String name, int age, double weight, String thief) {
        super(name, age, weight);
        this.thief = thief;
    }

    public String getThief() {
        return thief;
    }

    public void setThief(String thief) {
        this.thief = thief;
    }

    public String makeSound() {
        return "Mouse : Chít..ít..ịt";
    }

    public String howToEat() {
        return "Eat Dog";
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "thief='" + thief + '\'' +
                '}';
    }
}
