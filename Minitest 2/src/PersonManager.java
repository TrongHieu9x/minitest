

import java.util.ArrayList;

public class PersonManager implements Manager {
    private static int id = 1;
    private static int index = 0;
    ArrayList<Person> persons = new ArrayList<>();

    public PersonManager(ArrayList<Person> persons) {
        for (Person person : persons) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }
    @Override
    public void addPerson() {
    }

    @Override
    public void displayPerson() {
    }

    @Override
    public void searchById() {
    }

    @Override
    public void deletePersonById() {
    }

    @Override
    public void editPersonById() {
    }

    @Override
    public void sortByAveragePoint() {
    }

    @Override
    public void sumPoint() {
    }
}
