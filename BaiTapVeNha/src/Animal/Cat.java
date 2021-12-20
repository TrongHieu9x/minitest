package Animal;

public class Cat extends Animal {
    private String chase;

    public Cat(String name, int age, double weight, String chase) {
        super(name, age, weight);
        this.chase = chase;
    }

    public String getChase() {
        return chase;
    }

    public void setChase(String chase) {
        this.chase = chase;
    }

    public String makeSound() {
        return "Cat : meo...e..o..";
    }

    public String howToEat() {
        return "Eat Mouse";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "chase='" + chase + '\'' +
                '}';
    }
}
