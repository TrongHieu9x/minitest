package Minitest3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student createStudent(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi: ");
        int age = scanner.nextInt();

        System.out.println("Nhập điểm Toán: ");
        double scoreMath = scanner.nextDouble();
        System.out.println("Nhập điểm Toán: ");
        double scorePhisyo = scanner.nextDouble();
        System.out.println("Nhập điểm Toán: ");
        double scoreChemistry = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, age, scoreMath, scorePhisyo, scoreChemistry);
    }

    public static Student searchById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public static Student updateById(int id) {
        Student studentUpdate = null;
        for (Student student : students) {
            if (Student.getId() == id) {
                studentUpdate = student;
            }
        }
        if (studentUpdate != null) {
            System.out.println("Nhập tên mới: ");
            studentUpdate.setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới: ");
            studentUpdate.setAge(scanner.nextInt());
            System.out.println("Nhập điểm mới: ");
            studentUpdate.setScoreMath(scanner.nextDouble());
            System.out.println("Nhập điểm mới: ");
            studentUpdate.setScorePhisyo(scanner.nextDouble());
            System.out.println("Nhập điểm mới: ");
            studentUpdate.setScoreChemistry(scanner.nextDouble());

            scanner.nextLine();
            return studentUpdate;
        }
        return null;
    }

    public static Student deleteById(int id) {
        Student student = null;
        for (Student student1 : students) {
            if (student1.getId() == id) {
                student = student1;
            }
        }
        students.remove(student);
        return student;
    }

    public static void sortByAveragePoint() {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : students) {
            if (student instanceof Student) {
                students.add((Student) student);
            }
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAveragePoint() < o2.getAveragePoint()) {
                    return 1;
                } else if (o1.getAveragePoint() > o2.getAveragePoint()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        students.addAll(students);
        ArrayList<Student> student1;
        System.out.println("Sắp xếp thành công!!!");
    }

}
