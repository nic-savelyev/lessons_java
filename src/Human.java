
public class Human {

    private final int MIN_AGE = 0;
    private final int MAX_AGE = 130;

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName (String newName) {
        if (newName != null && newName.length() >= 2) {
            name = newName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge (int newAge) {
        if (newAge > MIN_AGE && newAge < MAX_AGE)
          age = newAge;
        else {
            System.out.println("You are STUPID!");
        }
    }

}
