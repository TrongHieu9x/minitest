package Minitest3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Thêm 1 student");
            System.out.println("2. Sửa 1 student theo id");
            System.out.println("3. Xóa 1 student theo id");
            System.out.println("4. Tìm 1 student theo id");
            System.out.println("5. Sắp xếp theo điểm trung bình");
            System.out.println("6. Sinh viên có điểm cao nhất");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                case 2:
                    System.out.println("Nhập id student muốn sửa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(StudentManager.updateById(id));
                    break;

                case 3:
                    System.out.println("Nhập id student muốn xóa: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(StudentManager.deleteById(idDelete));
                    break;
                case 4:
                    System.out.println("Nhập id student muốn tìm: ");
                    int idSearch = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(StudentManager.searchById(idSearch));
                    break;
                case 5:
                    StudentManager.sortByAveragePoint();
                    break;
            }
        }
    }


}
