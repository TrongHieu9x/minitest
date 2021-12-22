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
                case 2:
                    Human human1= humanManager.createHuman();
                    humanManager.addHuman(human1);
                    break;
                case 3:
                    System.out.println("Nhập tên: ");
                    String deleteName = scanner.nextLine();
                    scanner.nextLine();
                    Human human2 = humanManager.deleteByName(deleteName);
                    if (human2 == null){
                        System.out.println("không có tên người tương ứng!");
                    } else {
                        System.out.println(human2);
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên: ");
                    String editName = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(humanManager.updateByName(editName));
                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }

        } while (choice != 0);
            }
        }
    }
}
