package Candy;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCandy {
    private ArrayList<Candy> candies;
    private final Scanner scanner = new Scanner(System.in);

    public ManagerCandy() {
        this.candies = new ArrayList<>();
    }

    public void displayAll() {
        for (Candy candy : candies) {
            System.out.println(candy);
        }
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public Candy searchById(int id) {
        for (Candy candy : candies) {
            if (candy.getId() == id) {
                return candy;
            }
        }
        return null;
    }

    public Candy deleteById(int id) {
        Candy candy = null;
        for (Candy c : candies) {
            if (c.getId() == id) {
                candy = c;
            }
        }
        candies.remove(candy);
        return candy;
    }

    public Candy updateById(int id) {
        Candy candyUpdate = null;
        for (Candy candy : candies) {
            if (candy.getId() == id) {
                candyUpdate = (Candy) candy;
            } else if (candy.getId() == id) {
                candyUpdate = candy;
            }
        }
        if (candyUpdate != null) {
            System.out.println("Enter Color: ");
            candyUpdate.setColor(scanner.nextLine());
            System.out.println("Enter property: ");
            candyUpdate.setProperty(scanner.nextLine());
            System.out.println("Enter number: ");
            candyUpdate.setQuantity(scanner.nextInt());
            System.out.println("Enter price: ");
            candyUpdate.setPrice(scanner.nextDouble());
        }
        return null;
    }

    public void maxPrice(Candy[] candies) {
        double maxPrice = candies[0].getPrice();
        for (Candy candy : candies) {
            if (candy.getPrice() > maxPrice) {
                maxPrice = candy.getPrice();
            }
        }
        System.out.println("nhung vien keo co gia cao nhat la: ");
        for (Candy candy : candies) {
            if (candy.getPrice() ==maxPrice) {
                System.out.println(candy);
            }
        }
    }


}
