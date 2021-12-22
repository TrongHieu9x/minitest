package Human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    private ArrayList<Human> humans;
    private final Scanner scanner = new Scanner(System.in);

    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    public void displayAll() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public void displayAllSouth(){

    }

    public void displayAllFemale() {

    }

    public void addHuman(Human human) {
        humans.add(human);
    }

    public Human createHuman(){
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        return new Human(name, age, gender, address);
    }

    public Human searchByAge(int age) {
        for (Human human : humans) {
            if (human.getAge() < 20) {
                return human;
            }
        }
        return null;
    }

    public Human deleteByName(String name) {
        Human human = null;
        for (Human h : humans) {
            if (h.getName() == name) {
                human = h;
            }
        }
        humans.remove(human);
        return human;
    }

    public Human updateByName(String name) {
        Human humanUpdate = null;
        for (Human human : humans) {
            if (human.getName() == name) {
                humanUpdate = human;
            }
        }
        if (humanUpdate != null) {
            System.out.println("Nhập tên mới: ");
            String name1 = scanner.nextLine();
            if (name.equals("")) {
                humanUpdate.setName(humanUpdate.getName());
            } else {
                humanUpdate.setName(name);
            }
            System.out.println("Nhập tuổi mới: ");
            humanUpdate.setAge(scanner.nextInt());
            scanner.nextLine();
            return humanUpdate;
        }
        return null;
    }
}
