import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number products: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Thông tin SP: ");
        Product[] productlist = new Product[n];
        for (int i = 0; i < productlist.length; i++) {
            System.out.println("information " + (i + 1));
            productlist[i] = products(scanner);
        }

        for (int i = 0; i < productlist.length; i++) {
            System.out.println(productlist[i].toString());
        }
//        Tìm sản phẩm theo tên
        System.out.println("Enter product find: ");
        String nameProduct = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < productlist.length; i++) {
            if (productlist[i].getName().equals(nameProduct)) {
                System.out.println(productlist[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Product not item");
        }

//        Tính tổng giá các sản phẩm
        int sumProduct = 0;
        for (int i = 0; i < productlist.length; i++) {
            sumProduct += productlist[i].getMoney();
        }
        System.out.println("Total product = " + sumProduct);

    }


    public static Product products(Scanner scanner) {
        String id;
        String name;
        double price;
        String type;
        System.out.println("Enter ID: ");
        id = scanner.nextLine();
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter money: ");
        price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter type: ");
        type = scanner.nextLine();

        return new Product(id, name, price, type);
    }

}
