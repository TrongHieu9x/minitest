package Minitest3;

public class Human {
    public static int VALUE = 0;
    private int id;
    private String name;
    private double age;

    public Human() {
    }

    public Human(String name, double age) {
        this.id = ++VALUE;
        this.name = name;
        this.age = age;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
