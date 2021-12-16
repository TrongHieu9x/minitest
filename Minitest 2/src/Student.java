public class Student extends Person{
    private double average;

    public Student() {
    }

    public Student(double average) {
        this.average = average;
    }

    public Student( String name, int age, double average) {
        super(name, age);
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "average=" + average +
                '}';
    }
}
