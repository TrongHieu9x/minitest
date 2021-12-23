package Minitest3;

public class Student extends  Human {
    private double scoreMath;
    private double scorePhisyo;
    private double scoreChemistry;
    private double averagePoint;

    public Student(String name, int age, double scoreMath, double scorePhisyo, double scoreChemistry, double averagePoint) {
        super(name, age);
        this.scoreMath = this.scoreMath;
        this.scorePhisyo = this.scorePhisyo;
        this.scoreChemistry = this.scoreChemistry;
        this.averagePoint = averagePoint;
    }

    public Student() {
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhisyo() {
        return scorePhisyo;
    }

    public void setScorePhisyo(double scorePhisyo) {
        this.scorePhisyo = scorePhisyo;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "scoreMath=" + scoreMath +
                ", scorePhisyo=" + scorePhisyo +
                ", scoreChemistry=" + scoreChemistry +
                ", averagePoint=" + averagePoint +
                '}';
    }


}
