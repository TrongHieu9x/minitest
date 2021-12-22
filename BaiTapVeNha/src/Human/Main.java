package Human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanManager humanManager = new HumanManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Hiển thị tất cả người");
            System.out.println("2. Hiển thị tất cả nam");
            System.out.println("3. Hiển thị tất cả nữ");
            System.out.println("4. hiển thị tất cả người dưới 20 tuổi");
            System.out.println("5. Thêm 1 người");
            System.out.println("6. Xóa 1 người theo tên");
            System.out.println("7. Sửa 1 người theo tên");
            System.out.println("8. Hiển thị tất cả người nhập vào");

            switch (choice) {
                case 1:
                    humanManager.displayAll();
                    break;
                case 2:
                    Human human = humanManager.createHuman();

            }
        }
    }
}
