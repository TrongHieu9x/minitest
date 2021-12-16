import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So nguoi muon tao: ");
        int size = scanner.nextInt();
        Person[] person = new Person[size];
        PersonManager personManager = new PersonManager(person);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hien thi tat ca");
            System.out.println("2. Them nguoi vao danh sach");
            System.out.println("3. Tim vi tri nguoi trong danh sach");
            System.out.println("4. Xoa 1 nguoi trong danh sach");
            System.out.println("5. Sua thong tin cua 1 nguoi");
            System.out.println("6. Sap xep danh sach theo diem TB");
            choice = scanner.nextInt();
            switch (choice) {
                case 1
            }
        }
    }
}
