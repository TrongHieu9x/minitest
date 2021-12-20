package Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        AnimalManager = new AnimalManager(AnimalArrayList);
        String name;
        int age;
        double weight;

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Thêm 1 con vật vào tập hợp: ");
            System.out.println("2. Xóa 1 con vật khỏi tập hợp: ");
            System.out.println("3. Sửa con vật theo tên: ");
            System.out.println("4. Hiển thị thông tin 1 con vật theo tên nhập vào: ");
            System.out.println("5. Hiển thị tất cả các con vật trong tập hợp: ");
            System.out.println("6. Trả về tất cả các con Dog trong tập hợp: ");
            System.out.println("7. Trả về tất cả các con vật trong khoảng cân nặng được nhập vào: ");
            System.out.println("0. Exit");
            System.out.println(" Nhập vào lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
    }
}
